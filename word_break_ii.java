import java.util.ArrayList;
import java.util.List;

class Solution278 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        backtrack(0, new ArrayList<>(), res, wordDict, s);
        return res;
    }

    private void backtrack(int idx, List<String> cur, List<String> res, List<String> wordDict, String s) {
        if (idx == s.length()) {
            res.add(String.join(" ", cur));
            return;
        }

        for (int i = idx; i <= s.length(); i++) {
            String word = s.substring(idx, i);
            if (wordDict.contains(word)) {
                cur.add(word);
                backtrack(i, cur, res, wordDict, s);
                cur.remove(cur.size() - 1);
            }
        }
    }
}

public class word_break_ii {
    public static void main(String[] args) {
        Solution278 s = new Solution278();
        System.out.println(s.wordBreak("catsanddog", List.of("cat", "cats", "and", "sand", "dog")));
    }
}
