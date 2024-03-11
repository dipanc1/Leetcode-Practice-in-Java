import java.util.Arrays;

class Solution231 {
    public int maxSubarrayLength(int[] nums, int k) {
        int[] count = new int[(int) Math.pow(10, 5)];
        int l = 0, res = 0;


        for (int r = 0; r < nums.length; r++) {
            if (count[nums[r]] == 0) count[nums[r]]++;
            else count[nums[r]]++;

            while (count[nums[r]] > k) {
                count[nums[l]]--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }


        return res;
    }
}

public class length_of_longest_subarray_with_at_most_k_frequency {
    public static void main(String[] args) {
        Solution231 s = new Solution231();
        System.out.println(s.maxSubarrayLength(new int[]{2}, 1));
    }
}
