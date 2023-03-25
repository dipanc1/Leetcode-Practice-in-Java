import java.util.Arrays;

class Solution49 {
    public int[] sortArray(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.arraycopy(nums, 0, ans, 0, n);
        return ans;
    }
}

public class sort_an_array {
    public static void main(String[] args) {
        Solution49 s = new Solution49();
        System.out.println(Arrays.toString(s.sortArray(new int[]{5, 2, 3, 1})));
    }
}
