import java.util.*;

class Solution133 {
    public int sumSubarrayMins(int[] arr) {
        ArrayList<Integer> listR = new ArrayList<>();
        ArrayList<Integer> listL = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        long result = 0;

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) stack.pop();
            if (!stack.isEmpty()) listL.add(i - stack.peek());
            else listL.add(i + 1);

            stack.push(i);

        }
        stack.clear();


        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
            if (!stack.isEmpty()) listR.add(stack.peek() - i);
            else listR.add(arr.length - i);

            stack.push(i);
        }
        System.out.println(listL + " " + listR);

        for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
            long total = ((long) listL.get(i) * listR.get(j)) % 1000000007;
            total = (total * arr[i]) % 1000000007;
            result = (result + total) % 1000000007;
        }
        return (int) result % 1000000007;
    }

}

public class sum_of_subarray_minimums {
    public static void main(String[] args) {
        Solution133 s = new Solution133();
        System.out.println(s.sumSubarrayMins(new int[]{3, 1, 2, 4}));
    }
}
