import java.util.ArrayList;
import java.util.Stack;

class Solution134 {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long ans = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] < nums[i])) {
                int top = stack.pop();
                int left = top - (stack.isEmpty() ? -1 : stack.peek());
                int right = i - top;

                ans += (long) nums[top] * left * right;
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] > nums[i])) {
                int top = stack.pop();
                int left = top - (stack.isEmpty() ? -1 : stack.peek());
                int right = i - top;

                ans -= (long) nums[top] * left * right;
            }
            stack.push(i);
        }

        return ans;
    }
}

public class sum_of_subarray_ranges {
    public static void main(String[] args) {
        Solution134 s = new Solution134();
        System.out.println(s.subArrayRanges(new int[]{3, 1, 2, 4}));
    }
}
