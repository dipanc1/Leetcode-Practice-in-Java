import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class Solution252 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length; // Number of bars in the histogram
        int maxArea = 0;

//        for (int i = 0; i < n; i++) {
//            for (int j = i, minHeight = Integer.MAX_VALUE; j < n; j++) {
//                minHeight = Math.min(minHeight, heights[j]);
//                int area = minHeight * (j - i + 1);
//                maxArea = Math.max(maxArea, area);
//            }
//        }

//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < n; i++) {
//            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
//                int h = heights[stack.pop()];
//                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
//                maxArea = Math.max(maxArea, h * w);
//            }
//            stack.push(i);
//        }

        Deque<Integer> stack = new ArrayDeque<>();
        stack.offerFirst(-1);

        for (int i = 0; i < n; i++) {
            while (stack.peekFirst() != -1 && heights[stack.peekFirst()] > heights[i]) {
                int ind = stack.pollFirst();
                maxArea = Math.max(maxArea, heights[ind] * (i - stack.peekFirst() - 1));
            }
        }

        int right = n;
        while (stack.peekFirst() != -1){
            int ind = stack.pollFirst();
            maxArea = Math.max(maxArea, heights[ind] * (right - stack.peekFirst() - 1));
        }

        return maxArea;
    }
}

public class largest_rectangle_in_histogram {
    public static void main(String[] args) {
        Solution252 s = new Solution252();
        System.out.println(s.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }
}
