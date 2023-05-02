import java.util.HashMap;

class Solution63 {
    public int longestPalindromeSubseq(String s) {
        StringBuilder stringBuffer = new StringBuilder(s);
        return lcs(s, stringBuffer.reverse().toString());
    }

    public int lcs(String a, String b) {
        int m = a.length();
        int n = b.length();
        int t[][] = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }
            }
        }

        return t[m][n];
    }
}

public class longest_palindrome_subsequence {
    public static void main(String[] args) {
        Solution63 s = new Solution63();
        System.out.println(s.longestPalindromeSubseq("bbbab"));
    }
}
