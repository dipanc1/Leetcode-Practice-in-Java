import java.util.ArrayList;
import java.util.Stack;

class Solution4 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char a : s.toCharArray()) {
            switch (a) {
                case '(' -> st.push(')');
                case '[' -> st.push(']');
                case '{' -> st.push('}');
                default -> {
                    if (st.isEmpty()) return false;
                    if (a != st.pop()) return false;
                }
            }
        }

        return st.isEmpty();
    }
}

public class valid_parentheses {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.isValid("]"));
    }
}
