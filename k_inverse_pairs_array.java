class Solution193 {
    public int kInversePairs(int n, int k) {
//        int[][] dp = new int[1001][1001];
//        int MOD = (int) (1e9 + 7);
//        dp[0][0] = 1;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j <= k; j++) {
//                for (int l = 0; l <= Math.min(j, i - 1); l++) {
//                    if (j - l >= 0) {
//                        dp[i][j] = (dp[i][j] + dp[i - 1][j - l]) % MOD;
//                    }
//                }
//            }
//        }
//
//        return dp[n][k];

//        int MOD = (int) (1e9 + 7);
//        int[][] dp = new int[n + 1][k + 1];
//
//        for (int i = 1; i <= n; ++i) {
//            for (int j = 0; j <= k; ++j) {
//                if (j == 0) dp[i][j] = 1;
//                else {
//                    int val = (dp[i - 1][j] + MOD - (j - i >= 0 ? dp[i - 1][j - i] : 0)) % MOD;
//                    dp[i][j] = (dp[i][j - 1] + val) % MOD;
//                }
//            }
//        }
//
//        return (dp[n][k] + MOD - (k > 0 ? dp[n][k - 1] : 0)) % MOD;

        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;
        int mod = 1000000007;

        for (int i = 1; i <= n; i++) {
            int val = 0;
            for (int j = 0; j <= k; j++) {
                val += dp[i - 1][j];
                if (j >= i) val -= dp[i - 1][j - i];
                if (val < 0) val += mod;
                val = (val % mod);
                dp[i][j] = val;
            }
        }
        return (int) (dp[n][k]);

    }
}


public class k_inverse_pairs_array {
    public static void main(String[] args) {
        Solution193 s = new Solution193();
        System.out.println(s.kInversePairs(3, 0));
    }
}
