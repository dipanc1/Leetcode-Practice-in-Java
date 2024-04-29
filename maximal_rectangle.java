import java.util.Stack;

class Solution244 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols + 1];

        int maxArea = 0;

        for (char[] row : matrix) {
            for (int i = 0; i < cols; i++) {
                heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
            }

            int n = heights.length;

//            for (int i = 0; i < n; i++) {
//                for (int j = i, minHeight = Integer.MAX_VALUE; j < n; j++) {
//                    minHeight = Math.min(minHeight, heights[j]);
//                    int area = minHeight * (j - i + 1);
//                    maxArea = Math.max(maxArea, area);
//                }
//            }

            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                    int h = heights[stack.pop()];
                    int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                    maxArea = Math.max(maxArea, h * w);
                }
                stack.push(i);
            }
        }

        return maxArea;
    }
}

public class maximal_rectangle {
    public static void main(String[] args) {
        Solution244 s = new Solution244();
        System.out.println(s.maximalRectangle(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}));
    }
}
