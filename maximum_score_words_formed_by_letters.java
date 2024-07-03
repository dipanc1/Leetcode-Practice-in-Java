import java.util.HashMap;

class Solution277 {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char c : letters) letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        return backTrack(0, words, letterCount, score);
    }

    private boolean canFormAWord(String word, HashMap<Character, Integer> letterCount) {
        HashMap<Character, Integer> wordCount = new HashMap<>();
        for (char c : word.toCharArray()) wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);

        for (Character c : wordCount.keySet()) {
            if (wordCount.get(c) > letterCount.getOrDefault(c, 0)) return false;
        }

        return true;

    }

    private int backTrack(int i, String[] words, HashMap<Character, Integer> letterCount, int[] score) {
        if (i == words.length) return 0;
        int res = backTrack(i + 1, words, letterCount, score); // skip

        if (canFormAWord(words[i], letterCount)) {
            // include (when possible)
            for (char c : words[i].toCharArray()) {
                letterCount.put(c, letterCount.getOrDefault(c, 0) - 1);
            }
            res = Math.max(res, getScore(words[i], score) + backTrack(i + 1, words, letterCount, score));
            for (char c : words[i].toCharArray())
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);

        }

        return res;
    }

    private int getScore(String s, int[] score) {
        int res = 0;

        for (char c : s.toCharArray()) {
            res += score[c - 'a'];
        }

        return res;
    }
}

public class maximum_score_words_formed_by_letters {
    public static void main(String[] args) {
        Solution277 s = new Solution277();
        System.out.println(s.maxScoreWords(new String[]{"dog", "cat", "dad", "good"}, new char[]{'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'}, new int[]{1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }
}
