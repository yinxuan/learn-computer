package day2;

/**
 * Created by s on 2017/6/11.
 */
public class TestJoin {
    public static void main(String []args) {
        MyThread mt = new MyThread();
        mt.start();

        for(int i=0;i<10;i++) {
            if(i == 5) {
                try{
                    mt.join();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("+++++++++");
        }
    }


    static class MyThread extends Thread{
        public void run() {
            for(int i=0;i < 10;i++) {
                System.out.println("***********");
            }
        }
    }
}