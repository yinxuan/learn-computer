package study;

/**
 * Created by s on 2017/6/10.
 */
public class ThreadDemo {
    public static void main(String []args) {
        ThreadTest tt = new ThreadTest();
        tt.start();

        for(int i = 0; i <10; i++) {
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("主线程" + i);
        }
        System.out.println("程序执行完毕");
    }
}
