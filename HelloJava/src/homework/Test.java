package homework;

import java.util.HashSet;

/**
 * Created by s on 17/3/16.
 */
public class Test {
    public static void main(String []args) {
//
//        Multiplication multiplication = new Multiplication();
//        multiplication.mul(9);
//
//        Square sq = new Square();
//        //输出一个矩形
//        sq.square(3,3);
//
//        System.out.println();
//
//        //输出一个直角三角形
//        sq.delta(3);
//
//        System.out.println();
//
//        //输出一个等边三角形
//        sq.deltaS(3);
//
//        System.out.println();
//
//        //输出一个等腰三角形
//        sq.triangle(3);
//
        Return ret = new Return();
//
//        System.out.println("" + ret.sums(5));
//
//        System.out.println("" + ret.rets(5));
//

//
//        try {
//            for(int i = 10;i > -1;i--){
//                System.out.print("fibonacci of " + i + " is " +ret.fibonacci(i) + "\n");
//            }
//        } catch (Exception e) {
//            System.out.print("抛异常啦sb");
//        }

//        System.out.println(ret.fibonacci(15));

        char []a = new char[30];
//        for(int i = 0; i < a.length; i++){
//            a[i] = (char) ((int) ('a') + i);
//        }
        char i = 'a';
        int index = 0;
        while(i <= 'z'){
            a[index] = i;
            index++;
            i += 1;
        }
        a[index++] = 'b';
        a[index++] = 'd';
        a[index++] = 'a';
        a[index] = 'v';
        System.out.println(a);



        System.out.println(ret.returnCharByJay(a));

        System.out.println(ret.returnChar(a));      //{'a','b','c','d'}

        System.out.println(ret.charNum(a));
//        System.out.println(97);
//        System.out.println((char)(97));
//        System.out.println((int)('a'));

//        char []b = new char[3];
//        int[] c = new int[1];
//        int[] d = new int[1];
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(b);

//        NumFlower num = new NumFlower();
//        num.numFlower(9999);
    }
}
