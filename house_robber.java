import java.util.Arrays;
import java.util.List;

class Solution20 {
    int[] memo;

    public int rob(int[] nums) {
//        int curMax = 0;
//        int preMax = 0;
//        for (int num : nums) {
//            int temp = curMax;
//            curMax = Math.max(num + preMax, curMax);
//            preMax = temp;
//        }
//
//        return curMax;

//        second
//        memo = new int[nums.length];
//        Arrays.fill(memo, -1);
//        return rob(nums, nums.length - 1);

        // third
        int[] f = new int[nums.length + 1];

        f[1] = nums[0];

        for (int i = 2; i < f.length; i++) {
            f[i] = Math.max(nums[i - 1] + f[i - 2], f[i - 1]);
        }

        return f[nums.length];
    }

//    public int rob(int[] nums, int i) {
//        if (i < 0) return 0;
//        if (memo[i] >= 0) return memo[i];
//
//        int result = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
//
//        memo[i] = result;
//
//        return result;
//    }
}

public class house_robber {
    public static void main(String[] args) {
        Solution20 s = new Solution20();
        System.out.println(s.rob(new int[]{1, 2, 3, 1}));
    }
}
