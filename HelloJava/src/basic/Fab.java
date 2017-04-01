package basic;

/**
 * Created by s on 17/3/14.
 */
public class Fab {
    public static void main(String []args){
        int n = 4;
        System.out.println("第" + n +"个月后的兔子数量为： " + fun(n));
    }

    private static int fun(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return fun(n-1)+fun(n-2);
        }
    }
}
