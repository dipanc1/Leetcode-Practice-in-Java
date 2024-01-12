import java.util.Arrays;
import java.util.Map;

class Solution184 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp, 1);
        // [1,1,1,1,1,1,1,1] System.out.println(Arrays.toString(dp));
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return Arrays.stream(dp).max().orElse(0);
    }
}

public class longest_increasing_subsequence {
    public static void main(String[] args) {
        Solution184 s = new Solution184();
        System.out.println(s.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}
