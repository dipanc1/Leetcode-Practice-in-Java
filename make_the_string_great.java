import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;

class Solution14 {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            // Now we check if either the present or the next character is capital
//            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {
//                // recursive call for the rest of the string
//                return makeGood(s.substring(0, i) + s.substring(i + 2));
//            }

            if (!stack.isEmpty() && (stack.peek() - arr[i] == 32 || stack.peek() - arr[i] == -32)) stack.pop();
            else stack.push(arr[i]);
        }

        while (!stack.empty()) ans = stack.pop() + ans;

        return ans;
    }
}

public class make_the_string_great {
    public static void main(String[] args) {
        Solution14 s = new Solution14();
        System.out.println(s.makeGood("leEeetcode").toCharArray());
    }
}
