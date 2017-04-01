package homework;

/**
 * Created by s on 17/3/15.
 */
public class Opera {
    public static void main(String []args){
        System.out.println(" "+(20.2*10));
        System.out.println(" "+(20.2*10.1));
        System.out.println(" "+(20.2/10.1));
        System.out.println(" "+(20.2%2));
        System.out.println(" "+(19%2));

        System.out.println("输出a的值");
        double a = 20.2;
        System.out.println("a= " +(a++));
        System.out.println("a= " +(a--));

        System.out.println("输出b的值");
        System.out.println("b= " +(20+2));
        System.out.println("b= " +(20/2));
        System.out.println("b= " +(20%2));
        System.out.println("b= " +(20<<2));
        System.out.println("b= " +(20>>2));
        System.out.println("b= " +(20^2));
        System.out.println("b= " +(20|2));

        System.out.println("输出c的值");
        System.out.println("c= " +(10&20));
        System.out.println("c= " +(10|20));
        System.out.println("c= " +(10^20));
        System.out.println("c= " +(~10));
        System.out.println("c= " +(10<<2));
        System.out.println("c= " +(10>>3));
    }
}
