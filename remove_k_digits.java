import java.util.Stack;

class Solution136 {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (char n : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > n) {
                stack.pop();
                k--;
            }

            stack.push(n);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        while (!sb.isEmpty() && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return !sb.isEmpty() ? sb.toString() : "0";
    }
}

public class remove_k_digits {
    public static void main(String[] args) {
        Solution136 s = new Solution136();
        System.out.println(s.removeKdigits("1432219", 3));
    }
}
