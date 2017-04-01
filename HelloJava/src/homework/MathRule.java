package homework;

/**
 * Created by s on 17/3/17.
 */
public class MathRule {
    public static void main (String[] args) {

        //输出九＊九乘法口诀表
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < i + 1; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + " ");
            }
            System.out.println();
        }

    }
}

