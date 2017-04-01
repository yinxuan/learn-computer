package homework;

/**
 * Created by s on 17/3/18.
 */
public class TestArray {
    public static void main(String[] args) {
        Reverse returnA = new Reverse();

        System.out.println("原始数组为：");
        int[] a = {1,2,3,4,5};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();

        System.out.println("逆序后的数组为：");
        int[] b;
        b = returnA.returnArray(a);
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }

        System.out.println();
    }
}
