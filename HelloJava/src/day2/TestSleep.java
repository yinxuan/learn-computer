package day2;

import java.util.*;

/**
 * Created by s on 2017/6/11.
 * 休眠方法
 */
public class TestSleep {
    public static void main(String []args) {
        for(int i=0;i<10;i++) {
            System.out.println(i);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
