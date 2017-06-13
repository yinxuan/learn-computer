package day3;

/**
 * Created by s on 2017/6/13.
 */
public class ATest{
    public static void main(String args[]) {
        Sub   sub = new Sub( );
        System. out .println(sub. x );              // 1
        System. out .println(sub. n );              // 2
        System. out .println(sub.method1( ));    // 3
        System. out .println(sub.method2( ));    // 4
        Super supsub= new Sub( );
        System. out .println(supsub. x );          // 5
        System. out .println(supsub. n );          // 6
        System. out .println(supsub.method1( ));// 7
        System. out .println(supsub.method2( ));// 8
        Super sup= new Super( );
        System. out .println(sup. x );             // 9
        System. out .println(sup. n );             // 10
        System. out .println(sup.method1( ));   // 11
        System. out .println(sup.method2( ));   // 12
    }

    public static class Super{
        int x =1 , y =2 ;
        static int n =50;
        int method1( ){
            return ( x < y )? x : y ;
        }
        static int method2( ){
            return n ++;
        }
    }

    public static class Sub extends Super{
        int method1( ) {
            return ( x > y )? x : y ;
        }
        static int method2( ){
            return n --;
        }
    }
}

