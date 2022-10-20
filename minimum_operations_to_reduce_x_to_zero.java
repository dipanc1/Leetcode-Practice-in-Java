class Solution9 {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int target = sum - x;

        if(target < 0) return -1;
        if(target == 0) return nums.length;

        int start = 0;
        int runningSum = 0;
        int max_len = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];

            while (runningSum > target){
                runningSum -= nums[start++];
            }

            if(runningSum == target){
                max_len = Math.max(max_len, i - start + 1);
            }
        }

        return max_len == Integer.MIN_VALUE ? -1 : nums.length - max_len;
    }
}

public class minimum_operations_to_reduce_x_to_zero {
    public static void main(String[] args) {
      Solution9 s = new Solution9();
      System.out.println(s.minOperations(new int[] {1,1,4,2,3}, 5));
    }
}
