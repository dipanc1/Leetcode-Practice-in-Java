import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution192 {
    int result = 0;

    public int maxLength(List<String> arr) {
        if (arr == null || arr.isEmpty()) return 0;
        dfs(arr, "", 0);
        return result;
    }

    public void dfs(List<String> arr, String path, int i) {
        boolean isUniqueChar = isUniqueChar(path);

        if (isUniqueChar) result = Math.max(path.length(), result);

        if (i == arr.size() || !isUniqueChar) return;

        for (int j = i; j < arr.size(); j++) {
            dfs(arr, path + arr.get(j), j + 1);
        }
    }

    public boolean isUniqueChar(String s) {
        Set<Character> characters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (characters.contains(c)) return false;
            characters.add(c);
        }
        return true;
    }

}

public class maximum_length_of_a_concatenated_string_with_unique_characters {
    public static void main(String[] args) {
        Solution192 s = new Solution192();
        System.out.println(s.maxLength(List.of("cha", "r", "act", "ers")));
    }
}
