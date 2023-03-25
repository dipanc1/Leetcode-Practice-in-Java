import java.util.Objects;

class Solution51 {
    public int strStr(String haystack, String needle) {
        if (Objects.equals(haystack, needle) || Objects.equals(needle, "")) return 0;

        if (haystack.length() < needle.length()) return -1;

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.toCharArray()[i] == needle.toCharArray()[0]) {
                for (int j = 0; j < needle.length(); j++) {
                    if (needle.toCharArray()[j] != haystack.toCharArray()[i + j]) {
                        break;
                    } else if (j == needle.length() - 1) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }
}

public class find_the_index_of_the_first_occurrence_in_a_string {
    public static void main(String[] args) {
        Solution51 s = new Solution51();
        System.out.println(s.strStr("leetcode", "leeto"));
    }
}
