package learn;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by s on 17/3/28.
 * 程序员面试金典 10.4 尹炫
 * 给定一个数组，包含1到N的整数，N最大为32000；数组可能含有重复的值，且N的取值不定，若只有4KB内存可用，该如何打印数组中所有重复的元素
 */

public class Test {
    public static void main(String[] args) {

//        int length = 20000;
//        int[] input = new int[length];
//        for (int i=0; i<length; i++) {
//            input[i] = i;
//        }
//
//        int count = 100;
//
//        long timeStart = System.currentTimeMillis();
//        for (int i=0; i<count; i++) {
//            solution(input);
//        }
//        System.out.println("solution spent time: " + (System.currentTimeMillis() - timeStart));
//
//        timeStart = System.currentTimeMillis();
//        for (int i=0; i<count; i++) {
//            solution2(input);
//        }
//        System.out.print("solution2 spent time: " + (System.currentTimeMillis() - timeStart));

        int[] input = {2,2,2,2};
        int[] result = solution2(input);
        System.out.println("重复的数字为：");
        for(int i = 0; i < result.length; i++) {
            //规定的数字范围为1～32000
            if(result[i] > 0) {
                System.out.println(result[i]);
            }
        }
    }

    //方法一，利用两个for循环实现
    public static int[] solution(int[] array) {
        int[] a = new int[array.length];
        int temp = 0;
        for(int i = 0; i < a.length; i++) {
            if(!isNumberInArray(array[i],a)) {
                for(int j = i + 1; j < a.length; j++) {
                    if(array[j] == array[i]) {
                        a[temp] = array[j];
                        temp++;
                        break;
                    }
                }
            }
        }
        return a;
    }

    private static boolean isNumberInArray(int num,int[] array) {
        boolean result = false;
        for(int i = 0; i < array.length; i++) {
            if(num == array[i]) {
                result = true;
                break;
            }
        }
        return  result;
    }

    //方法二，利用HashMap实现
    public static int[] solution2(int[] array) {
        HashMap<Integer,Integer> result = new HashMap<>();
        int[] a = new int[array.length];
        int temp = 0;
        Integer current;
        for(int i = 0; i < array.length; i++) {
            int num = array[i]; //asdfadf
            if(!result.containsKey(num)) { //asdfa
                a[temp] = num; //asd
                temp++; //asdf
                current = 0; //asdfasdf
            } else {
                current = result.get(num);
            }
            result.put(num,current);
        }
        return a;
    }

    //方法三，利用HashSet实现
    public static int[] solution3(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int[] a = new int[array.length];
        int temp = 0;
        for(int i = 0; i < array.length; i++) {
            if(!set.contains(array[i])) {
                a[temp] = array[i];
                temp++;
            } else {
                break;
            }
        }
        return a;
    }
}

