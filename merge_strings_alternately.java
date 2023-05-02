class Solution65 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        // two pointer
        int i = 0, j = 0;
        while (i < word1.length() || j < word2.length()){
            if (i < word1.length()) ans.append(word1.charAt(i++));
            if (j < word2.length()) ans.append(word2.charAt(j++));
        }


        // one pointer
//
//        for (int i = 0; i < word1.length() || i < word2.length(); ++i) {
//            if (i < word1.length()) ans.append(word1.charAt(i));
//            if (i < word2.length()) ans.append(word2.charAt(i));
//        }
//
        return ans.toString();
    }
}

public class merge_strings_alternately {
    public static void main(String[] args) {
        Solution65 s = new Solution65();
        System.out.println(s.mergeAlternately("abc", "pqr"));
    }
}
