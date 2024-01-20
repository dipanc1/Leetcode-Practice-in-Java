import java.util.*;

class Solution133 {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long MOD = (long) 1e9 + 7;
        long result = 0;

        int[] leftCount = new int[n];
        int[] rightCount = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()])
                leftCount[i] += leftCount[stack.pop()];

            leftCount[i]++;
            stack.push(i);

        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()])
                rightCount[i] += rightCount[stack.pop()];

            rightCount[i]++;
            stack.push(i);

        }

        for (int i = 0; i < n; i++) {
            result = (result + (long) arr[i] * leftCount[i] * rightCount[i]) % MOD;
        }

        return (int) result;
    }

}

public class sum_of_subarray_minimums {
    public static void main(String[] args) {
        Solution133 s = new Solution133();
        System.out.println(s.sumSubarrayMins(new int[]{3, 1, 2, 4}));
    }
}
