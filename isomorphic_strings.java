import java.util.HashMap;
import java.util.HashSet;

class Solution235 {
    public boolean isIsomorphic(String s, String t) {
        int[] num1 = new int[256];
        int[] num2 = new int[256];

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (num1[c1] != num2[c2]) return false;

            num1[c1] = i + 1;
            num2[c2] = i + 1;
        }

        return true;

    }
}

public class isomorphic_strings {
    public static void main(String[] args) {
        Solution235 s = new Solution235();
        System.out.println(s.isIsomorphic("bbbaaaba", "aaabbbba"));
    }
}
