package basic;

/**
 * Created by s on 17/3/15.
 */
public class Test {
    public  static void main(String []args){
        int []a = {1,3,5,7,9,2,4,6,8,0};
        int []b = insertSort(a);
        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }
    }

    public static int[] insertSort(int[] nums) {
        int temp, length = nums.length;
        for (int i = 1; i < length; i++) {
            temp = nums[i];
            int j = i;
            for (; j >= 1&&temp < nums[j - 1]; j--) {
                nums [j] = nums[j - 1];
            }
            nums[j] = temp;
        }
        return nums;
    }
}
