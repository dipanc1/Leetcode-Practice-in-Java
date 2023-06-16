import java.util.Arrays;

class Solution106 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < s.length(); i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}

public class valid_anagram {
    public static void main(String[] args) {
        Solution106 solution106 = new Solution106();
        System.out.println(solution106.isAnagram("anagram", "nagaram"));
    }
}
