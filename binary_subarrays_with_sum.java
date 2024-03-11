class Solution222 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(goal, nums) - helper(goal - 1, nums);
    }

    public int helper(int x, int[] n) {
        if (x < 0) return 0;
        int res = 0, l = 0, cur = 0;

        for (int r = 0; r < n.length; r++) {
            cur += n[r];
            while (cur > x) {
                cur -= n[l];
                l++;
            }
            res += (r - l + 1);
        }
        return res;
    }
}

public class binary_subarrays_with_sum {
    public static void main(String[] args) {
        Solution222 s = new Solution222();
        System.out.println(s.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
    }
}
