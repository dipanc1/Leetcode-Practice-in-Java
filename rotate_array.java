import java.util.Arrays;

class Solution101 {
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
//        k %= nums.length;
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, nums.length - 1);
        int n = nums.length;
        if (n == 1 || k == 0) return;
        // insert into the temp array till k
        int[] temp = new int[k];
        k = k % n;

        System.arraycopy(nums, n - k, temp, 0, k);

        // insert from k to n for first k
        for (int j = n - k - 1; j >= 0; j--) {
            nums[j + k] = nums[j];
        }

        // insert temp back at the back
        System.arraycopy(temp, 0, nums, 0, k);

        System.out.println(Arrays.toString(nums));
    }
}

public class rotate_array {
    public static void main(String[] args) {
        Solution101 s = new Solution101();
        s.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
