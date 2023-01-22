import java.util.Arrays;

class Solution30 {
    public int maxSubarraySumCircular(int[] array) {
        int acc = 0;
        int max1 = kadane(array);
        System.out.println("Max 1: "+ max1);
        for(int i = 0; i < array.length; i++) {
            acc += array[i];
            array[i] = -array[i];
        }
        System.out.println(Arrays.toString(array));

        int min = kadane(array);
        System.out.println("Min: "+ min);

        int max2 = acc + min;
        System.out.println("Max 2: "+ max2);

        if(max2 == 0)  return max1;
        return Math.max(max1, max2);
    }
    public int kadane(int[] array) {
        int maxSum = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            maxSum = Math.max(maxSum+array[i], array[i]);
            max = Math.max(max, maxSum);
        }
        return max;
    }
}
public class maximum_sum_circular_subarray {
    public static void main(String[] args) {
        Solution30 s = new Solution30();
        System.out.println(s.maxSubarraySumCircular(new int[] {5,-3,5}));
    }
}
