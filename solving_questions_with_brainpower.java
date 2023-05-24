class Solution80 {
    public long mostPoints(int[][] questions) {
        return dfs(questions, 0, new Long[questions.length]);
    }

    public long dfs(int[][] nums, int i, Long[] memo) {
        if (i >= memo.length) return 0;

        if (memo[i] != null) return memo[i];

        long skip = dfs(nums, i + 1, memo); // move to next index
        long solve = nums[i][0] + dfs(nums, i + nums[i][1] + 1, memo); // get point and move to next valid index

        return memo[i] = Math.max(skip, solve);
    }
}

public class solving_questions_with_brainpower {
    public static void main(String[] args) {
        Solution80 s = new Solution80();
        System.out.println(s.mostPoints(new int[][]{{3, 2}, {4, 3}, {4, 4}, {2, 5}}));
    }
}
