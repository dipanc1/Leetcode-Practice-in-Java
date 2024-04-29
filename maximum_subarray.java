class Solution246 {
    public int maxSubArray(int[] nums) {
        // Brute Force
//        int sum;
//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0;i < nums.length;i++) {
//            sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j];
//                maxSum = Math.max(sum, maxSum);
//            }
//        }
//
//        return maxSum;

        // Prefix Sum
//        int sum;
//        int maxSum = Integer.MIN_VALUE;
//
//        int[] pre = new int[nums.length];
//        pre[0] = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            pre[i] = pre[i - 1] + nums[i];
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i; j < nums.length; j++) {
//                sum = (i == 0) ? pre[j] : pre[j] - pre[i - 1];
//                maxSum = Math.max(sum, maxSum);
//            }
//        }
//
//        return maxSum;

        // Kadane's Algo
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;

            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }

        return max;
    }
}

public class maximum_subarray {
    public static void main(String[] args) {
        Solution246 s = new Solution246();
        System.out.println(s.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
