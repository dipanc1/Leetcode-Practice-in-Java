import java.util.Arrays;
import java.util.HashMap;

class Solution259 {
    public int longestIdealString(String s, int k) {
//        int[] hashMap = new int[];
//        return helper(0, ' ', s, k);
        int[] dp = new int[26];
        Arrays.fill(dp, 0);

        for (char c : s.toCharArray()) {
            int curr = c - 'a';
            int longest = 1;
            for (int i = 0; i < 26; i++) {
                if (Math.abs(curr - i) <= k) longest = Math.max(longest, 1 + dp[i]);
            }
            dp[curr] = Math.max(dp[curr], longest);
        }

        Arrays.sort(dp);
        return dp[dp.length - 1];

    }

//    public int helper(int i, char prev, String s, int k) {
//        if (i == s.length()) return 0;
//        // skip s[i]
//        int res = helper(i + 1, prev, s, k);
//
//        // include s[i]
//        if (prev == ' ' || Math.abs(s.charAt(i) - prev) <= k)
//            res = Math.max(res, 1 + helper(i + 1, s.charAt(i), s, k));
//
//        return res;
//    }
}

public class longest_ideal_subsequence {
    public static void main(String[] args) {
        Solution259 s = new Solution259();
        System.out.println(s.longestIdealString("acfgbd", 2));
    }
}
