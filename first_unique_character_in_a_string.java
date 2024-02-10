import java.util.HashMap;

class Solution199 {
    public int firstUniqChar(String s) {
//        int[] map = new int[26];
//
//        // First pass: count the frequency of each character
//        for (char c : s.toCharArray()) {
//            map[c - 'a']++;
//        }
//
//        // Second pass: find the first non-repeating character
//        for (int i = 0; i < s.length(); i++) {
//            if (map[s.charAt(i) - 'a'] == 1) {
//                return i;
//            }
//        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int index = s.indexOf(s.charAt(i));
            if (index == s.lastIndexOf(s.charAt(i))) ans = Math.min(ans, index);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

public class first_unique_character_in_a_string {
    public static void main(String[] args) {
        Solution199 s = new Solution199();
        System.out.println(s.firstUniqChar("loveleetcode"));
    }
}
