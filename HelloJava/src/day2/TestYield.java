package day2;

/**
 * Created by s on 2017/6/11.
 * 暂停方法
 */
public class TestYield {
    public static void main(String []args) {
        Thread t1 = new Thread(new MyRunnable1());
        Thread t2 = new Thread(new MyRunnable2());

        t1.start();
        t2.start();
    }

    static class MyRunnable1 implements Runnable {
        @Override
        public void run() {
            for(int i=0;i<200;i++) {
                System.out.print("+");
                Thread.yield();
            }
        }
    }


    static class MyRunnable2 implements Runnable {
        @Override
        public void run() {
            for(int i=0;i<200;i++) {
                System.out.print("*");
                Thread.yield();
            }
        }
    }
}
