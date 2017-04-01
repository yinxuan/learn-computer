//这是一份专业的删除链表指定元素的代码，值得深究
package Linklist;

/**
 * Created by s on 17/3/6.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        LinkList list = new LinkList();
        for (int i = 0; i < 10; i++) {
            //产生10个0～100的随机整数，用辅助变量temp来承载
            int temp = ((int) (Math.random() * 100)) % 100;
            list.insert(i, temp);
            System.out.print(temp + " ");
        }

        list.delete(4);
        System.out.println("\n------删除第五个元素之后-------");
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}