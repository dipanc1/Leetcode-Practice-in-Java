import java.util.HashSet;
import java.util.Map;

class Solution150 {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}


public class longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        Solution150 s = new Solution150();
        System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
    }
}
