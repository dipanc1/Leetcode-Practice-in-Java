class Solution203 {
    int ans = 0;

    public int countSubstrings(String s) {

        int n = s.length();
        if (n == 0) return 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (isPalindrome(s, i, j)) ans++;
//            }
//        }
//
        // DP
//        boolean[][] dp = new boolean[n][n];
//
//        for (int i = 0; i < n; i++) {
//            dp[i][i] = true;
//            ans++;
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//            if (s.charAt(i) == s.charAt(i + 1)) {
//                dp[i][i + 1] = true;
//                ans++;
//            }
//        }
//
//        for (int len = 3; len <= n; len++) {
//            for (int i = 0; i < n - len + 1; i++) {
//                if (s.charAt(i) == s.charAt(i + len - 1) && dp[i + 1][i + len - 2]) {
//                    dp[i][i + len - 1] = true;
//                    ans++;
//                }
//            }
//        }
    // doesn't work
        for (int i = 0; i < n; i++) {
            helper(s, i, i);
            helper(s, i, i + 1);
        }

        return ans;
    }

    public void helper(String s, int left, int right) {
        if (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            ans++;
            left--;
            right++;
        }
    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}

public class palindromic_substrings {
    public static void main(String[] args) {
        Solution203 s = new Solution203();
        System.out.println(s.countSubstrings("abc"));
    }
}
