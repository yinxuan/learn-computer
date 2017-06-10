package study;

import basic.Fab;

/**
 * Created by s on 2017/5/5.
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 　　　　1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 */
public class work_1 {
    public static void main(String args[]) {
        System.out.println(Fab(4));
    }

    public static int Fab(int month) {
        int result = 1;
        int i = 1;
        for(;month > 2;month--) {
            result = result + i;
            i = result;
        }
        return result;
    }
}
