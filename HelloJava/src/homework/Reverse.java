package homework;

/**
 * Created by s on 17/3/18.
 */
public class Reverse {
    public int[] returnArray(int[] array) {
        int[] b = new int[5];
        int temp = 0;
        for(int i = array.length - 1; i >= 0; i--,temp++) {
            b[temp] = array[i];
        }
        return b;
    }
}
