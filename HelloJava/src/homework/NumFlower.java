package homework;

/**
 * Created by s on 17/3/17.
 */

//求得水仙花数，水仙花数是指一个 n 位正整数 ( n≥3 )，它的每个位上的数字的 n 次幂之和等于它本身。

public class NumFlower {
    //稍微优化一点，能实现100～999和1000～9999水仙花数的判断
//    public void numFlower(int n) {
//        if(n >= 1000) {
//            for(int i = 1000; i <= n; i++){
//                int x = i / 1000;
//                int y = (i - 1000 * x) / 100;
//                int z = (i - 1000 * x - 100 * y) / 10;
//                int m = (i - 1000 * x - 100 * y) % 10;
//                int num;
//                num = x * x * x * x + y * y * y * y + z * z * z * z + m * m * m * m;
//                if(num == i) {
//                    System.out.println(num);
//                }
//            }
//        } else {
//            for(int i = 100; i <= n; i++){
//                int x = i / 100;
//                int y = (i - 100 * x) / 10;
//                int z = (i - 100 * x) % 10;
//                int num;
//                num = x * x * x + y * y * y + z * z * z;
//                if(num == i) {
//                    System.out.println(num);
//                }
//            }
//        }
//    }


    //范例中给出的解答代码，只能满足100～1000
    public static void main(String[] args){
        for(int i=100;i<1000;i++){
            if(isLotus(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
    //判断水仙花数
    private static boolean isLotus(int lotus){
        int m = 0;
        int n = lotus;
        int sum = 0;
        m = n/100;
        n  -= m*100;
        sum = m*m*m;
        m = n/10;
        n -= m*10;
        sum += m*m*m + n*n*n;
        if(sum==lotus)
            return true;
        else
            return false;
    }
}
