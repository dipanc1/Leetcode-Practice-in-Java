class Solution282 {
    public int appendCharacters(String s, String t) {
//        int ptrT = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (ptrT < t.length() && t.charAt(ptrT) == s.charAt(i)) ptrT++;
//        }
//
//        return t.length() - ptrT;

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) j++;
            i++;
        }

        return t.length() - j;
    }
}

public class append_characters_to_string_to_make_subsequence {
    public static void main(String[] args) {
        Solution282 s = new Solution282();
        System.out.println(s.appendCharacters("coaching", "coding"));
    }
}
