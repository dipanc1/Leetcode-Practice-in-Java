class Solution175 {
    int mod = 1000000007;
    int[][] dp;

    public int numRollsToTarget(int n, int k, int target) {

        dp = new int[n + 1][target + 1];
        return rDecode(n, k, target);
    }

    private int rDecode(int n, int k, int target) {
        if (target == 0 && n == 0) return 1;
        if (target < n || n * k < target) return 0;

        if (dp[n][target] != 0) return dp[n][target];

        int ways = 0;

        for (int i = 1; i <= k; i++) {
            if (target < i) break;
            ways = (ways + rDecode(n - 1, k, target - i)) % mod;
        }
        dp[n][target] = ways % mod;

        return ways % mod;
    }
}

public class number_of_dice_rolls_with_target_sum {
    public static void main(String[] args) {
        Solution175 s = new Solution175();
        System.out.println(s.numRollsToTarget(2, 6, 7));
    }
}
