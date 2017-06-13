package day3;

/**
 * Created by s on 2017/6/13.
 * 分析==和equals的区别
 */
public class Square {
    long width;
    public Square(long l) {
        width = l;
    }
    public static void main(String []args) {
        Square a,b,c;
        a = new Square(42L);
        b = new Square(42L);
        c = b;
        long s = 42L;
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(a.equals(s));
    }
}
