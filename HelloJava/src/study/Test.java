package study;

/**
 * Created by s on 2017/5/7.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("main方法开始执行");
        Test t = new Test();
        try {
            t.test1();
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {

            System.out.println("over");
        }

        System.out.println("main方法结束");
    }

    //ArithmeticException 指的是运算异常
    void test1() throws ArithmeticException {
        System.out.println("test1开始执行");
        System.out.println(1/0);
        System.out.println("test1结束执行");
    }

}
