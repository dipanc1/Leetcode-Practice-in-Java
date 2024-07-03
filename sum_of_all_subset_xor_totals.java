class Solution275 {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int i, int sum) {
        if (i >= nums.length) return sum;

        return dfs(nums, i + 1, sum ^ nums[i]) + dfs(nums, i + 1, sum);
    }
}

public class sum_of_all_subset_xor_totals {
    public static void main(String[] args) {
        Solution275 s = new Solution275();
        System.out.println(s.subsetXORSum(new int[]{1, 3}));
    }
}
