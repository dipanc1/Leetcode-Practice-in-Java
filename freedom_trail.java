import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution260 {
    public int findRotateSteps(String ring, String key) {
        int[] dp = new int[ring.length()];
        Arrays.fill(dp, 0);

        char[] kc = key.toCharArray();
        char[] rc = ring.toCharArray();

        for (int k = kc.length - 1; k > 0; k--) {
            int[] next_dp = new int[ring.length()];
            Arrays.fill(next_dp, Integer.MAX_VALUE);

            for (int r = 0; r < ring.length() - 1; r++) {
                for (int i = 0; i < ring.length() - 1; i++) {
                    if (rc[i] == kc[k]) {
                        int min_dist = Math.min(Math.abs(r - i), ring.length() - Math.abs(r - i));
                        next_dp[r] = Math.min(next_dp[r], min_dist + 1 + dp[i]);
                    }
                }
            }
            dp = next_dp;
        }

        return dp[0];

//        return helper(0, 0, ring, key, new int[ring.length()][key.length()]);
    }

    private int helper(int r, int k, String ring, String key, int[][] memo) {
        if (k == key.length()) return 0;
        if (memo[r][k] != 0) return memo[r][k];

        char[] rc = ring.toCharArray();
        char[] kc = key.toCharArray();

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < ring.length(); i++) {
            if (rc[i] == kc[k]) {
                int min_dist = Math.min(Math.abs(r - i), ring.length() - Math.abs(r - i));
                res = Math.min(res, min_dist + 1 + helper(i, k + 1, ring, key, memo));
            }
        }

        memo[r][k] = res;
        return res;
    }
}

public class freedom_trail {
    public static void main(String[] args) {
        Solution260 s = new Solution260();
        System.out.println(s.findRotateSteps("godding", "gd"));
    }
}
