package homework;

import java.util.Scanner;

/**
 * Created by s on 17/3/15.
 */
public class AddTool {

    public int addNum(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }

    public int addSquare(int m) {
        int result = 0;
        for(int i = 1; i <= m; i++){
            result += i * i;
        }
        return result;
    }

    public int round(double input) {
        if(input >= 0) {
            return (int) (input + 0.5);
        } else {
            return (int) (input - 0.5);
        }
    }

    public int roundValue(double input) {
        if(input >= 0) {
            if((int)(input*10) % 10 <= 4) {
                return (int)(input);
            } else {
                return (int)(input)+1;
            }
        } else {
            if((int)(-1*input*10) % 10 <= 4) {
                return (int)(input);
            } else {
                return (int)(input) - 1;
            }
        }
    }

    public void roundNum(int i) {
        int sum = 0 ;
        Scanner in = new Scanner(System.in);
//        while (i < in.nextInt()) {
//            sum = sum + in.nextInt();
//            i++;
//        }
//        return sum;
        System.out.println("输入的值为： " + in);
    }
}
