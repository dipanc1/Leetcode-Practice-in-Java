import java.util.Arrays;
import java.util.Stack;

class Solution131 {
    public int[] prevSmaller(int[] A) {

        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[i] <= stack.peek()) {
                stack.pop();
            }

            if (stack.size() == 0) ans[i] = -1;
            else ans[i] = stack.peek();

            stack.push(A[i]);
        }

        return ans;
    }
}

public class nearest_smallest_element {
    public static void main(String[] args) {
        Solution131 s = new Solution131();
        System.out.println(Arrays.toString(s.prevSmaller(new int[]{4, 5, 2, 10, 8})));
    }
}
