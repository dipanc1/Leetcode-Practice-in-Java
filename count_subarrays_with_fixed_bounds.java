class Solution234 {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int badIdx = -1, rIdx = -1, lIdx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (!(minK <= nums[i] && nums[i] <= maxK)) badIdx = i;

            if (nums[i] == minK) lIdx = i;

            if (nums[i] == maxK) rIdx = i;

            int smaller = Math.min(lIdx, rIdx);

            res += Math.max(0, smaller - badIdx);
        }

        return res;
    }
}

public class count_subarrays_with_fixed_bounds {
    public static void main(String[] args) {
        Solution234 s = new Solution234();
        System.out.println(s.countSubarrays(new int[]{1, 3, 5, 2, 7, 5}, 1, 5));
    }
}
