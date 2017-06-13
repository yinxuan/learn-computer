package day1;

/**
 * Created by s on 2017/6/11.
 */
public class MyRunnable1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0;i < 100;i++) {
            System.out.print("+");
        }
    }
}
