class Solution256 {
    public int longestSubstring(String s, int k) {
        if (s.isEmpty()) return 0;
        char[] chars = new char[26];

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }

        boolean flag = true;
        for (char aChar : chars) {
            if (aChar < k && aChar > 0) {
                flag = false;
                break;
            }
        }

        if (flag) return s.length();

        int result = 0, start = 0, cur = 0;

        while (cur < s.length()) {
            if (chars[s.charAt(cur) - 'a'] < k) {
                result = Math.max(result, longestSubstring(s.substring(start, cur), k));
                start = cur + 1;
            }
            cur++;
        }

        result = Math.max(result, longestSubstring(s.substring(start), k));
        return result;
    }
}

public class longest_substring_with_at_least_k_repeating_characters {
    public static void main(String[] args) {
        Solution256 s = new Solution256();
        System.out.println(s.longestSubstring("aaabb", 3));
    }
}
