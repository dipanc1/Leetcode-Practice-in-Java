import java.util.ArrayList;
import java.util.List;

class Solution121 {
    List<String> res = null;
    String[] strMap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if (digits.isEmpty()) return res;

        dfs(0, digits, new StringBuilder());
        return res;
    }

    void dfs(int length, String digits, StringBuilder temp) {
        if (length == digits.length()) {
            res.add(temp.toString());
            return;
        }

        char ch = digits.charAt(length);

        String str = strMap[ch - '0'];

        for (char c : str.toCharArray()) {
            temp.append(c);
            dfs(length + 1, digits, temp);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}


public class letter_combination_of_a_phone_number {
    public static void main(String[] args) {
        Solution121 s = new Solution121();
        System.out.println(s.letterCombinations("23"));
    }
}
