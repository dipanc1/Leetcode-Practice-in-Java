import java.util.ArrayList;
import java.util.List;

public class MutatedCommonChars {

    public static void main(String[] args) {
        List<List<Character>> result = mutatedCommonChars(List.of(
                List.of("abc", "acc"),
                List.of("xyz", "yxz"),
                List.of("eee", "eee"),
                List.of("aaaaac", "aabaag")
        ));

        System.out.println(result);
    }

    public static List<List<Character>> mutatedCommonChars(List<List<String>> wordsList) {
        List<List<Character>> result = new ArrayList<>();

        for (List<String> pair : wordsList) {
            if (pair.size() != 2) {
                continue;  // Skip pairs that do not have exactly two strings
            }

            String word1 = pair.get(0);
            String word2 = pair.get(1);

            List<Character> commonCharsList = new ArrayList<>();

            // Find common characters after mutation
            for (int i = 0; i < word1.length(); i++) {
                char char1 = word1.charAt(i);
                char char2 = word2.charAt(i);

                if (char1 != char2) {
                    commonCharsList.add(char1);
                }
            }

            // Append the result to the final list
            result.add(commonCharsList);
        }

        return result;
    }
}

