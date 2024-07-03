import java.util.*;

class Solution285 {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set = new HashSet<>(dictionary);
        List<String> sentenceArray = new ArrayList<>(Arrays.asList(sentence.split(" ")));

        StringBuilder ans = new StringBuilder();

        for (String word : sentenceArray) {
            int i = 0;

            while (i <= word.length()) {
                String curr = word.substring(0, i);
                if (set.contains(curr)) {
                    ans.append(curr).append(" ");
                    break;
                }
                i++;
            }

            if (i == word.length() + 1) ans.append(word).append(" ");
        }

        ans.deleteCharAt(ans.length() - 1);

        return ans.toString();

    }
}

public class replace_words {
    public static void main(String[] args) {
        Solution285 s = new Solution285();
        System.out.println(s.replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery"));
    }
}
