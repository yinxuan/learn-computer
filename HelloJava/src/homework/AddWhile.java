package homework;

/**
 * Created by s on 17/3/15.
 */
public class AddWhile {
    public static void main(String []args){
        int num = 0, i = 1;
        while(i < 100){
            num+=i;
            i++;
        }
        System.out.print("输出的总和为：" + num);
    }
}
