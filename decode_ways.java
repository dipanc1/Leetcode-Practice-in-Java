import java.util.Arrays;

class Solution174 {
    public int numDecodings(String s) {
//        int[] memo = new int[s.length()];
//        Arrays.fill(memo, -1);
//        return rDecode(s, 0, memo);

        if (s.isEmpty() || s.charAt(0) == '0') return 0;

        int[] dp = new int[s.length() + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));

            if (oneDigit != 0) dp[i] += dp[i - 1];
            if (10 <= twoDigit && twoDigit <= 26) dp[i] += dp[i - 2];
        }

        return dp[s.length()];
    }

    private int rDecode(String s, int i, int[] memo) {
        if (i == s.length()) return 1;

        if (memo[i] != -1) return memo[i];

        if (s.charAt(i) == '0') return 0;

        int ways = rDecode(s, i + 1, memo);

        if (i + 1 < s.length() && Integer.parseInt(s.substring(i, i + 2)) <= 26) ways += rDecode(s, i + 2, memo);

        memo[i] = ways;

        return ways;
    }
}

public class decode_ways {
    public static void main(String[] args) {
        Solution174 s = new Solution174();
        System.out.println(s.numDecodings("12"));
    }
}
