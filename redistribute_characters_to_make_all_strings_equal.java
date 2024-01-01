import java.util.HashMap;
import java.util.Map;

class Solution178 {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        Map<Character, Integer> counts = new HashMap<>();

        for (String w : words) {
            for (char c : w.toCharArray()) {
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % n != 0) return false;
        }

        return true;
    }
}

public class redistribute_characters_to_make_all_strings_equal {
    public static void main(String[] args) {
        Solution178 s = new Solution178();
        System.out.println(s.makeEqual(new String[]{"abc", "aabc", "bc"}));
    }
}
