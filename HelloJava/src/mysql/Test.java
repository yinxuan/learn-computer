package mysql;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by s on 2017/6/12.
 * 此表单已经彻底创建完毕，只需输入需要的保存的数据即可，比如f1.setAge(18)
 */
public class Test {
    public static void main(String []args) {
        Filter f1 = new Filter();
        f1.setId(10);
        f1.setUserName("李白");

        Filter f2 = new Filter();
        f2.setUserName("Lucy");
        f2.setAge(18);

        Filter f3 = new Filter();
        f3.setEmail("yinxuansh@126.com,zsh@163.com,yes@126.com");

        String sql1 = query(f1);
        String sql2 = query(f2);
        String sql3 = query(f3);

        System.out.println(sql1);
        System.out.println(sql2);
        System.out.println(sql3);

        //创建一个新表单Filtert2来测试这个表单的内容是否是正确的
        Filter2 filter2 = new Filter2();
        filter2.setAmount(100);
        filter2.setName("技术部");
        System.out.println(query(filter2));
    }

    private static String query(Object f){
        StringBuilder sb = new StringBuilder();
        //1.获取到class
        Class c = f.getClass();
        //2.获取到table的名字
        boolean exists = c.isAnnotationPresent(Table.class);
        if(!exists) {
            return null;
        }
        Table t = (Table)c.getAnnotation(Table.class);
        String tableName = t.value();
        sb.append("select * from ").append(tableName).append(" Where 1=1 ");
        //遍历所有的字段
        Field[] fArray = c.getDeclaredFields();
        for(Field field:fArray) {
            //4.处理每个字段的sql
            //4.1拿到字段名
            boolean fExists = field.isAnnotationPresent(Column.class);
            if(!fExists){
                continue;
            }
            Column column = field.getAnnotation(Column.class);
            String columnName = column.value();
            //4.2拿到字段的值,通过反射来取得值
            String fieldName = field.getName();
            String getMethodName = "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
            Object fieldValue = null;
            try {
                Method getMethod = c.getMethod(getMethodName);
                fieldValue = getMethod.invoke(f);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //4.3拼装sql
            //将显示为0或者null的元素全部忽略，只显示有用信息
            if(fieldValue == null || (fieldValue instanceof Integer && (Integer)fieldValue == 0)) {
                continue;
            }
            //给出现的字符全都加上单引号，满足数据库的引用
            sb.append(" and ").append(fieldName);
            //对众多的地址进行in()操作符处理
            if(fieldValue instanceof String) {
                if(((String)fieldValue).contains(",")) {
                    String[] values = ((String)fieldValue).split(",");
                    sb.append(" in(");
                    for(String v : values) {
                        sb.append("'").append(v).append("'").append(",");
                    }
                    sb.deleteCharAt(sb.length() - 1);       //去掉最后面的逗号
                    sb.append(")");                         //在最后面加上一个 ）号
                }else {
                    sb.append("=").append("'").append(fieldValue).append("'");
                }
            }else if(fieldValue instanceof Integer) {
                sb.append("=").append(fieldValue);
            }
        }

        return sb.toString();
    }
}
