package learn;

import java.util.HashMap;

/**
 * Created by s on 17/3/28.
 * 程序员面试金典 10.4 尹炫
 * 给定一个数组，包含1到N的整数，N最大为32000；数组可能含有重复的值，且N的取值不定，若只有4KB内存可用，该如何打印数组中所有重复的元素
 */

public class Test {
    public static void main(String[] args) {

        int[] input = {2,3,6,0,1,-2,7,2,2,5,7,9};
        char[] input2 = {'a','b','c','d','a','c','f'};
////        checkDuplicates(input);
//        int[] result = solution(input);
//        for(int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
        System.out.println(count(input));
        System.out.println(test(input2));
        System.out.println(testInteger(input));
    }

    //
    private static HashMap<Integer, Integer> count(int[] array) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i=0; i<array.length; i++) {
            int num = array[i];

            Integer currentCount;
            if (!result.containsKey(num)) {
                currentCount = 0;
            } else {
                currentCount = result.get(num);
            }

            currentCount++;

            result.put(num, currentCount);
        }

        return result;
    }

    private static HashMap<Character,Integer> test(char[] array) {
        HashMap<Character,Integer> result = new HashMap<>();
        for(int i=0; i<array.length; i++) {
            char num = array[i];

            Integer current;
            if (!result.containsKey(num)) {
                current = 0;
            } else {
                current = result.get(num);
            }

            current++;

            result.put(num,current);
        }

        return result;
    }

    private static HashMap<Integer,Integer> testInteger(int[] array) {
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            int num = array[i];

            Integer current;
            if(!result.containsKey(num)) {
                current = 0;
            } else {
                current = result.get(num);
            }

            current++;
            result.put(num,current);
        }

        return result;
    }

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

}

