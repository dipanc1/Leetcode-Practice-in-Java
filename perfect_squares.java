import java.util.Arrays;
import java.util.HashMap;

class Solution201 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int min_val = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; ++j) {
                min_val = Math.min(min_val, dp[i - j * j] + 1);
            }
            dp[i] = min_val;
        }

        return dp[n];
//        return solve(n, new HashMap<>());
    }

    private int solve(int n, HashMap<Integer, Integer> memo) {
        if (n == 0) return 0;
        if (n < 0) return Integer.MAX_VALUE;
        if (memo.containsKey(n)) return memo.get(n);
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            ans = Math.min(ans, 1 + (solve(n - i * i, memo)));
        }
        memo.put(n, ans);
        return ans;
    }
}

public class perfect_squares {
    public static void main(String[] args) {
        Solution201 s = new Solution201();
        System.out.println(s.numSquares(12));
    }
}
