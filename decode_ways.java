import java.util.Arrays;

class Solution174 {
    public int numDecodings(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return rDecode(s, 0, memo);
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
