import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

class Solution130 {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] >= stack.peek()) {
                stack.pop();
            }
            stack.push(nums[i]);
        }
        int[] ans = new int[nums.length];


        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] >= stack.peek()) {
                stack.pop();
            }

            if (stack.size() == 0) ans[i] = -1;
            else ans[i] = stack.peek();

            stack.push(nums[i]);
        }

        return ans;
    }
}

public class next_greater_element2 {
    public static void main(String[] args) {
        Solution130 s = new Solution130();
        System.out.println(Arrays.toString(s.nextGreaterElements(new int[]{5, 4, 3, 2, 1})));
    }
}
