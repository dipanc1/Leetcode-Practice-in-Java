import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution284 {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int minCount = Integer.MAX_VALUE;

            for (String word : words) {
                int count = 0;
                for (char c : word.toCharArray()) {
                    if (c == ch) count++;
                }

                minCount = Math.min(minCount, count);
            }

            for (int i = 0; i < minCount; i++) {
                res.add(String.valueOf(ch));
            }
        }

        return res;


    }
}

public class find_common_characters {
    public static void main(String[] args) {
        Solution284 s = new Solution284();
        System.out.println(s.commonChars(new String[]{"bella", "label", "roller"}));
    }
}
