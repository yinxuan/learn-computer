import java.util.Stack;

/**
 * Created by s on 17/3/7.
 */
public class Sort {

    private class Region {
        int low;
        int high;

        Region(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }

    public void nonRecursiveQuickSort(int[] nums) {
        int i, j, pivot;
        Region region;
        Stack<Region> regions = new Stack<>();
        regions.add(new Region(0, nums.length - 1));
        while (!regions.empty()) {
            region = regions.pop();
            i = region.low;
            j = region.high;
            pivot = nums[i];
            while (i < j) {
                while (i < j) {
                    if (pivot >= nums[j]) {
                        nums[i++] = nums[j];
                        break;
                    }
                    j--;
                }
                while (i < j) {
                    if (pivot <= nums[i]) {
                        nums[j--] = nums[i];
                        break;
                    }
                    i++;
                }
            }
            nums[i] = pivot;
            if (i > region.low + 1) regions.add(new Region(region.low, i - 1));
            if (i < region.high - 1) regions.add(new Region(i + 1, region.high));
        }
    }

    public static void main(String[] args) {
        int[] a = {49,38,65,97,76,13,27,49};
        new Sort().nonRecursiveQuickSort(a);
        for (int i:a) System.out.println(i);
    }
}

