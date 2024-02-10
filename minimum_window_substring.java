import java.util.HashMap;

class Solution198 {
    //    1. Use two pointers to create a window of letters in s, which would have all the characters from t.
//    2. Expand the right pointer until all the characters of t are covered.
//    3. Once all the characters are covered, move the left pointer and ensure that all the characters are still covered to minimize the subarray size.
//    4. Continue expanding the right and left pointers until you reach the end of s.
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty() || s.length() < t.length()) {
            return "";
        }

        int[] map = new int[128];
        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;

        for (char c : t.toCharArray()) {
            map[c]++;
        }

        char[] chs = s.toCharArray();

        while (end < chs.length) {
            if (map[chs[end++]]-- > 0) {
                count--;
            }

            while (count == 0) {
                if (end - start < minLen) {
                    startIndex = start;
                    minLen = end - start;
                }
                if (map[chs[start++]]++ == 0) count++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}

public class minimum_window_substring {
    public static void main(String[] args) {
        Solution198 s = new Solution198();
        System.out.println(s.minWindow("ADOBECODEBANC", "ABC"));
    }
}
