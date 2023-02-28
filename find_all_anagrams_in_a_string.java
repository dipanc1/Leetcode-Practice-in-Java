import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution38 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] map = new int[26];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < p.length(); i++) {
            map[p.charAt(i) - 'a']++;
        }

        int windowStart = 0;
        int windowEnd = 0;
        while (windowEnd < s.length()) {
            // valid anagram
            if (map[s.charAt(windowEnd) - 'a'] > 0) {
                map[s.charAt(windowEnd++) - 'a']--;
                // window size equal to size of P
                if (windowEnd - windowStart == p.length()) {
                    result.add(windowStart);
                }
            }
            // window is of size 0
            else if (windowStart == windowEnd) {
                windowStart++;
                windowEnd++;
            }
            // decrease window size
            else {
                map[s.charAt(windowStart++) - 'a']++;
            }
        }
        return result;
    }
}

public class find_all_anagrams_in_a_string {
    public static void main(String[] args) {
        Solution38 s = new Solution38();
        System.out.println(s.findAnagrams("cbaebabacd", "abc"));
    }
}
