import java.util.Stack;

class Solution62 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int j = 0;

        for (int val :pushed) {
            stack.push(val);
            while (!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}

public class validate_stack_sequence {
    public static void main(String[] args) {
        Solution62 s = new Solution62();
        System.out.println(s.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }
}
