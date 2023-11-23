import java.util.ArrayList;
import java.util.List;

class Solution10 {

//    public void generate(Integer left, Integer right, ArrayList<String> result, String string) {
//        if (left == 0 && right == 0) {
//            result.add(string);
//            return;
//        }
//
//        // backtracking here
//        if (left > 0) {
//            generate(left - 1, right, result, string + "(");
//        }
//        if (right > left) {
//            generate(left, right - 1, result, string + ")");
//        }
//
//    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);

        return result;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max) {
        if (open == max && close == max) {
            list.add(str);
            return;
        }

        if (open < max) backtrack(list, str + "(", open + 1, close, max);
        if (close < open) backtrack(list, str + ")", open, close + 1, max);
    }
}

public class generate_parentheses {
    public static void main(String[] args) {
        Solution10 s = new Solution10();
        System.out.println(s.generateParenthesis(3));
    }
}
