package homework;

/**
 * Created by s on 17/3/15.
 */
public class AddDoWhile {
    public static void main(String []args){
        int num = 0, i = 1;
        do{
            num = num + i;
            i++;
        }while(i < 100);
        System.out.println("输出的总和为：" + num);
    }
}
