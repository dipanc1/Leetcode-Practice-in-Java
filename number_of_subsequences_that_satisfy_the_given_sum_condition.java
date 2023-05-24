import java.util.Arrays;

class Solution76 {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0, low = 0, high = nums.length - 1, mod = (int) 1e9 + 7;
        int[] p = new int[nums.length];
        p[0] = 1;
        for (int i = 1; i < nums.length; i++) p[i] = p[i - 1] * 2 % mod;

        while (low <= high) {
            if (nums[low] + nums[high] <= target) {
                ans += p[high - low++] % mod;
            } else {
                high--;
            }
        }
        return ans;
    }
}

public class number_of_subsequences_that_satisfy_the_given_sum_condition {
    public static void main(String[] args) {
        Solution76 s = new Solution76();
        System.out.println(s.numSubseq(new int[]{2, 3, 3, 4, 6, 7}, 12));
    }
}
