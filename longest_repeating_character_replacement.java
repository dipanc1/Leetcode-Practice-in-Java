import java.util.Collections;
import java.util.HashMap;

class Solution151 {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0, l = 0, maxF = 0; // addition of maxF

        for (int r = 0; r < s.length(); r++) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxF = Math.max(maxF, count.get(s.charAt(r)));

            if (((r - l + 1) - maxF) > k) { // changed from((r - l + 1) - Collections.max(count.values())) > k
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}


public class longest_repeating_character_replacement {
    public static void main(String[] args) {
        Solution151 s = new Solution151();
        System.out.println(s.characterReplacement("ABAB", 2));
    }
}
