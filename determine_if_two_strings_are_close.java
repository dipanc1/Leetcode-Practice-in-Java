import java.util.Arrays;

class Solution188 {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(freq1) + " " + Arrays.toString(freq2));
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) return false;
        }

//        for (int i = 0; i < 26; i++) {
//            if ((freq1[i] == 0) != (freq2[i] == 0)) return false;
//        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; i++) {
            if ((freq1[i] != freq2[i])) return false;
        }

        return true;
    }
}

public class determine_if_two_strings_are_close {
    public static void main(String[] args) {
        Solution188 s = new Solution188();
        System.out.println(s.closeStrings("cabbba", "abbccc"));
    }
}
