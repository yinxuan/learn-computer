package homework;

/**
 * Created by s on 17/3/16.
 */
public class Square {
    //输出一个矩形
    public void square(int i,int m) {
        for(int n = 0; n < i; n++){
            for(int x = 0; x < m; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //输出一个直角三角形
    public void delta(int i) {
        for(int n = 1; n <= i; n++){
            int temp = n;
            while(temp != 0) {
                System.out.print("* ");
                temp--;
            }
            System.out.println();
        }
    }

    //输出一个等边三角形
    public void deltaS(int i) {
        for(int n = 1; n <= i; n++) {
            int temp = n,x = i - n;
            while(temp != 0) {
                while (x != 0){
                    System.out.print(" ");
                    x--;
                }
                System.out.print("* ");
                temp--;
            }
            System.out.println();
        }
    }

    //输出一个等腰三角形
    public void triangle(int i){
        for(int n = 1; n <= i; n++){
            int temp = 2 * n -1, x = i - n;
            while(temp != 0){
                while(x != 0){
                    System.out.print(" ");
                    x--;
                }
                System.out.print("*");
                temp--;
            }
            System.out.println();
        }
    }
}
