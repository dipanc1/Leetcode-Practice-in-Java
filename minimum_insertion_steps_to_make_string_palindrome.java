class Solution66 {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                dp[i + 1][j + 1] = s.charAt(i) == s.charAt(n - 1 - j) ? dp[i][j] + 1 : Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }
        return n - dp[n][n];
    }
}

public class minimum_insertion_steps_to_make_string_palindrome {
    public static void main(String[] args) {
        Solution66 s = new Solution66();
        System.out.println(s.minInsertions("mbadm"));
    }
}
