import java.util.Arrays;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (target == nums[i] + nums[j]) {
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }
            }
        }
        return sum;
    }
}

public class two_sum {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
