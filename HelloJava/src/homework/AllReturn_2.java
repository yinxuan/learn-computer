package homework;

/**
 * Created by s on 17/3/26.
 */
import java.util.*;
public class AllReturn_2 {
    public static void main(String[] args){
        System.out.println("请输入一行字符：");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //停止输入字符
        scan.close();
        //返回各个字符的个数
        count(str);
    }
    //统计输入的字符
    private static void count(String str){
        List<String> list = new ArrayList<String>();
        char[] array_Char = str.toCharArray();
        for(char c:array_Char)
            //直接可以调用列表的元素添加函数
            list.add(String.valueOf(c));//将字符作为字符串添加到list表中
        Collections.sort(list);//排序
        for(String s:list){
            int begin = list.indexOf(s);
            int end = list.lastIndexOf(s);
            //索引结束统计字符数
            if(list.get(end)==s)
                System.out.println("字符‘"+s+"’有"+(end-begin+1)+"个");
        }
    }
}
