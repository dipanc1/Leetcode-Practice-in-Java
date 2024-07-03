import java.util.Arrays;

class Solution297 {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) return 0;
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;

        for (int l = 1; l < 4; l++) {
            int r = nums.length - 4 + l;
            res = Math.min(res, nums[r] - nums[l]);
        }

        return res;
    }
}

public class minimum_difference_between_largest_and_smallest_value_in_three_moves {
    public static void main(String[] args) {
        Solution297 s = new Solution297();
        System.out.println(s.minDifference(new int[]{1, 5, 0, 10, 14}));
    }
}
