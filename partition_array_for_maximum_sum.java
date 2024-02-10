import java.util.HashMap;

class Solution197 {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        return dfs(arr, 0, k, new HashMap<>());
    }

    private int dfs(int[] arr, int i, int k, HashMap<Integer, Integer> memo) {
        if (i >= arr.length) return 0;
        if (memo.containsKey(i)) return memo.get(i);
        int curr_max = 0;
        int res = 0;
        for (int j = i; j < Math.min(arr.length, i + k); j++) {
            curr_max = Math.max(curr_max, arr[j]);
            int window_size = j - i + 1;
            res = Math.max(res, dfs(arr, j + 1, k, memo) + curr_max * window_size);
        }
        memo.put(i, res);
        return res;
    }
}

public class partition_array_for_maximum_sum {
    public static void main(String[] args) {
        Solution197 s = new Solution197();
        System.out.println(s.maxSumAfterPartitioning(new int[]{1, 15, 7, 9, 2, 5, 10}, 3));
    }
}
