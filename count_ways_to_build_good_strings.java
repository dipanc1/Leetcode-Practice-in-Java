class Solution81 {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        int res = 0;
        int mod = 1000000007;
        dp[0] = 1;
        for (int i = 1; i <= high; i++) {
            if (i >= zero) dp[i] = (dp[i] + dp[i - zero]) % mod;
            if (i >= one) dp[i] = (dp[i] + dp[i - one]) % mod;
            if (i >= low) res = (res + dp[i]) % mod;
        }
        return res;
    }
}


public class count_ways_to_build_good_strings {
    public static void main(String[] args) {
        Solution81 s = new Solution81();
        System.out.println(s.countGoodStrings(3, 3, 1, 1));
    }
}
