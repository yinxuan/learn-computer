package homework;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by s on 17/3/17.
 */
public class Return {

    public int sums(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            sum = sum + i * (i + 1);
        }
        return sum;
    }

    public int rets(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n * (n - 1) ;
            n--;
        }
        return sum;
    }

    public int retss(int n) {
        if(n <= 2) {
            return 2;
        } else {
            return retss(n - 1) * retss(n);
        }
    }

//    public int fibonacci (int n) throws Exception{
//        if (n <= 0) {
//            throw new Exception("your input is illegal, n=" + n);
//        }
//        if(n == 1 || n == 2) {
//            return 1;
//        } else {
//            return fibonacci(n - 1)+fibonacci(n - 2);
//        }
//    }

    public char[] charNum(char[] input) {
        char[] result = new char[26];
        int temp = 0;

        for (int i = 0; i < input.length; i++,temp++) {

            // 取出当前候选char
            char currentChar = input[i];

            // 候选char 和 result 比较，看result是不是已经有了
//
//            for (int j = 0; j < result.length; j++) {
//                //候选char 和 result 里每一个 char 对比
//                char tempChar = result[j];
//                if (currentChar == tempChar) {
//                    break;
//                }
//            }
            // 根据上面的判断，来决定要不要把 currentChar 放进到 result 里
            if (!ifCharInArray(currentChar, result)) {
                result[temp] = currentChar;
            }
        }
        return result;
    }

//
////        char []a = {};
////        int temp = 1;
////        for(int i = 0; i < b.length; i++){
////            for(int j = 0; j < temp; j++){
////                if(b[i] == a[j]) {
////                    a[j] = b[i];
////                    temp++;
////                }
////            }
////        }
////        return a;
//
//
//
////        for(int i = 0; i < b.length; i++) {
////            switch (b[i] - 'a') {
////                case 0 : System.out.println("a has " + i);break;
////                case 1 : System.out.println("b has " + i);break;
////                case 2 : System.out.println("c has " + i);break;
////                case 3 : System.out.println("d has " + i);break;
////            }
////            for(int j = 1; j < b.length; j++) {
////                int temp = 0;
////                if(b[j] == b[i]){
////                    temp++;
////                }
////                return temp;
////            }
////        }
////        return 0;
//    }


    public Character[] returnCharByJay(char[] a) {
        HashSet<Character> set = new HashSet<>();
        int j=0;
        while (j<a.length) {
            set.add(a[j++]);
        }
        return set.toArray(new Character[26]);
    }

    public char[] returnChar(char[] a) {
        int temp = 0;
        char[] b = new char[26];
        for(int i = 0; i < a.length; i++){
            char current = a[i];
            if(!ifCharInArray(current,b)) {
                b[temp] = current;
                temp++;
            }
        }

        char[] result =new char[temp];
        for(int j = 0; j < temp; j++) {
            result[j] = b[j];
        }
        return result;
    }

    public boolean ifCharInArray(char targetChar, char[] content) {
        for(int i = 0; i < content.length; i++) {
            if(targetChar == content[i]) {
                return true;
            }
        }
        return false;
    }

}
