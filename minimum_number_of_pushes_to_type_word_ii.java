import java.util.Arrays;

class Solution307 {
    public int minimumPushes(String word) {
        int[] map = new int[26];
        for (char c : word.toCharArray()) map[c - 'a']++;

        // sort in descending order
        Arrays.sort(map);
        int[] sortedFrequency = new int[26];
        for (int i = 0; i < 26; i++) {
            sortedFrequency[i] = map[25 - i];
        }


        int res = 0;

        for (int i = 0; i < sortedFrequency.length; i++) {
            res += (sortedFrequency[i] * (1 + (i / 8)));
        }

        return res;
    }

}

    public class minimum_number_of_pushes_to_type_word_ii {
        public static void main(String[] args) {
            Solution307 s = new Solution307();
            System.out.println(s.minimumPushes("abcde"));
        }
    }
