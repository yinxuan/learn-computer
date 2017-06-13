package day1;

/**
 * Created by s on 2017/6/11.
 */
public class TestMyRunnable {
    public static void main(String []args) {
        MyRunnable1 my1 = new MyRunnable1();
        MyRunnable2 my2 = new MyRunnable2();

        Thread t1 = new Thread(my1);
        Thread t2 = new Thread(my2);

        System.out.println("t1的优先级" + t1.getPriority());
        System.out.println("t2的优先级" + t2.getPriority());

        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("t1的优先级" + t1.getPriority());
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("t2的优先级" + t2.getPriority());

        //就绪状态
        t1.start();             //加号
        t2.start();             //星号
    }
}
