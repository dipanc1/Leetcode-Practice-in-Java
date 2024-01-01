import java.util.HashMap;
import java.util.Map;

class Solution179 {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int count = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characterIntegerMap.containsKey(c))
                count = Math.max(count, i - characterIntegerMap.getOrDefault(c, 0) - 1);
            else characterIntegerMap.put(c, i);
        }

        return count;
    }
}

public class largest_substring_between_two_equal_characters {
    public static void main(String[] args) {
        Solution179 s = new Solution179();
        System.out.println(s.maxLengthBetweenEqualCharacters("aa"));
    }
}
