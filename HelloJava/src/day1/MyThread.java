package day1;

/**
 * Created by s on 2017/6/10.
 * 多继承接口
 */
public class MyThread implements Runnable{
    public static void main(String []args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();

        for(int i = 0; i < 10; i++) {
            try{
                Thread.sleep(100);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程" + i);
        }
    }

    @Override
    public void run(){
        for(int i = 0; i < 10; i++) {
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("MyThread" + i);
        }
    }
}
