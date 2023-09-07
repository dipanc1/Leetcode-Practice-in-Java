import java.util.Stack;

class Solution136 {
    public String removeKdigits(String num, int k) {
        int n = num.length();

        Stack<Character> st = new Stack<>();

        for (char c : num.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }

            st.push(c);

        }
        while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return !sb.isEmpty() ? sb.toString() : "0";
    }
}

public class remove_k_digits {
    public static void main(String[] args) {
        Solution136 s = new Solution136();
        System.out.println(s.removeKdigits("1432219", 3));
    }
}
