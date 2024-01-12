class Solution185 {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        int[] dp = new int[nums.length];
        int ans = 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp[i] = dp[i - 1] + 1;
                ans += dp[i];
            }
        }

        return ans;
    }
}

public class arithmetic_slices {
    public static void main(String[] args) {
        Solution185 s = new Solution185();
        System.out.println(s.numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }
}
