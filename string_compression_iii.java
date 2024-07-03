import java.util.HashMap;

class Solution279 {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int idx = 0;

        while (idx < word.length()) {
            char curr = word.charAt(idx);
            int charCount = 0;
            while (idx < word.length() && word.charAt(idx) == curr && charCount < 9) {
                charCount++;
                idx++;
            }

            comp.append(charCount).append(curr);
        }

        return comp.toString();
    }
}

public class string_compression_iii {
    public static void main(String[] args) {
        Solution279 s = new Solution279();
        System.out.println(s.compressedString("aaaaaaaaaaaaaabb"));
    }
}
