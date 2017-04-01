package homework;

/**
 * Created by s on 17/3/16.
 */
public class Multiplication {
    public void mul(int i) {
        for(int x = 1; x <= i; x++) {
            for(int y = 1; y < x + 1; y++) {
                System.out.print("  " + x + " * " + y + "=" + " " + (x*y));
            }
            System.out.println();
        }
    }
}
