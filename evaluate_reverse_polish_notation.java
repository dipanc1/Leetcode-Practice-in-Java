import java.util.Objects;
import java.util.Stack;

class Solution156 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (Objects.equals(token, "/")) {
                int two = stack.pop();
                int one = stack.pop();

                token = String.valueOf(one / two);
                stack.add(Integer.parseInt(token));
            } else if (Objects.equals(token, "+")) {
                int two = stack.pop();
                int one = stack.pop();

                token = String.valueOf(one + two);
                stack.add(Integer.parseInt(token));
            } else if (Objects.equals(token, "-")) {
                int two = stack.pop();
                int one = stack.pop();

                token = String.valueOf(one - two);
                stack.add(Integer.parseInt(token));
            } else if (Objects.equals(token, "*")) {
                int two = stack.pop();
                int one = stack.pop();

                token = String.valueOf(one * two);
                stack.add(Integer.parseInt(token));
            } else {
                stack.add(Integer.parseInt(token));
            }
        }

        return stack.pop();

    }
}

public class evaluate_reverse_polish_notation {
    public static void main(String[] args) {
        Solution156 s = new Solution156();
        System.out.println(s.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}
