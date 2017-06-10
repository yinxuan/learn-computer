package study;

/**
 * Created by s on 2017/6/10.
 * 单继承类
 */
public class ThreadTest extends Thread {
    public void run() {
        for(int i= 0; i < 10;i++) {
            try{
                Thread.sleep(100);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyThread" + i);
        }
    }
}
