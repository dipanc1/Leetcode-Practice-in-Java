import java.util.List;
import java.util.Stack;

class Solution238 {
    public String minRemoveToMakeValid(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        StringBuilder filtered = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                res.append(c);
                count++;
            } else if (c == ')' && count > 0) {
                res.append(c);
                count--;
            } else if (c != ')') res.append(c);
        }

        for (char c : res.reverse().toString().toCharArray()) {
            if (c == '(' && count > 0) count--;
            else filtered.append(c);
        }

        return filtered.reverse().toString();
    }
}

public class minimum_remove_to_make_valid_parentheses {
    public static void main(String[] args) {
        Solution238 s = new Solution238();
        System.out.println(s.minRemoveToMakeValid("lee(t(c)o)de)"));
    }
}
