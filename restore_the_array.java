class Solution67 {
    static int mod = (int) 1e9 + 7;

    public int numberOfArrays(String s, int k) {
        // Memoization
        return solve(s, 0, k, new Integer[s.length()]);
    }

    private int solve(String s, int i, int k, Integer[] dp) {
        if (i == s.length()) return 1;

        if (dp[i] != null) return dp[i];

        long sum = 0, num = 0;
        for (int j = i; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0');

            if (num > k || num == 0) break;

            sum += solve(s, j + 1, k, dp);
        }
        return dp[i] = (int) (sum % mod);
    }
}

public class restore_the_array {
    public static void main(String[] args) {
        Solution67 s = new Solution67();
        System.out.println(s.numberOfArrays("1000", 10000));
    }
}
