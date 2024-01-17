import java.util.HashMap;
import java.util.Map;

class Solution187 {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        int ans = 0;

        for (int i = 0; i < 26; i++) {
            ans += Math.max(0, freq[i]);
        }

        return ans;

    }
}

public class minimum_number_of_steps_to_make_two_strings_anagram {
    public static void main(String[] args) {
        Solution187 s = new Solution187();
        System.out.println(s.minSteps("leetcode", "practice"));
    }
}
