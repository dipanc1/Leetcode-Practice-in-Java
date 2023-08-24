import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

class Solution129 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        //starting with the end of array, when stack is empty, there is no greater element the last so put -1 in map
//push it in stack. Now next element compare it with top element in stack. if nums2 < top of stack
//put stack.peek in map else we will keep popping until we find element in stack which is greater than nums2 element

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {

            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else if (!stack.isEmpty() && nums2[i] < stack.peek()) {
                map.put(nums2[i], stack.peek());
            } else {
                while (!stack.isEmpty() && nums2[i] >= stack.peek()) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    map.put(nums2[i], -1);
                } else {
                    map.put(nums2[i], stack.peek());
                }
            }
            stack.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}

public class next_greater_element {
    public static void main(String[] args) {
        Solution129 s = new Solution129();
        System.out.println(Arrays.toString(s.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
    }
}
