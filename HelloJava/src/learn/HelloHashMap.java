package learn;

import java.util.HashMap;

public class HelloHashMap {
    public static void main(String[] args) {
        int[] inputInt = {10,10,20,20, 20};
//        char[] inputChar = {'a','b','d','g','d','a','b','c'};
        System.out.println(testInteger(inputInt));
//        System.out.println(testChar(inputChar));
    }

    private static HashMap<Integer,Integer> testInteger(int[] array) {
        //创建一个HashMap对象
        HashMap<Integer,Integer> result = new HashMap<>();
        Integer currentNumber;          //存放数字出现的次数，默认为0
        for(int i = 0; i < array.length; i++) {
            int num = array[i];         //取出要比较的元素
            //如果之前出现过
            if(result.containsKey(num)) {
                //将此时该数出现的次数传给currentNumber
                currentNumber = result.get(num);
                //将次数加一
                currentNumber++;
                //将改变后的次数保存起来
                result.put(num,currentNumber);
            } else {
                //如果没有出现过，则将该数出现次数设为1，保存起来
                result.put(num,1);
            }
        }
        //返回生成的HashMap
        return result;
    }




//    private static HashMap<Character,Integer> testChar(char[] array) {
//        HashMap<Character,Integer> result = new HashMap<>();
//        Integer current;
//        for(int i = 0; i < array.length; i++) {
//            char num = array[i];
//            if(!result.containsKey(num)) {
//                current = 0;
//            } else {
//                current = result.get(num);
//            }
//            current++;
//            result.put(num,current);
//        }
//        return result;
//    }
}

