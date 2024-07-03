import java.util.HashMap;
import java.util.Map;

class Solution276 {
    public int beautifulSubsets(int[] nums, int k) {
//        int res = dfs(nums, k, 0, new HashMap<>());
//        return res - 1;
        Map<Integer, Integer> mp = new HashMap<>();

        for (int n : nums) mp.put(n, mp.getOrDefault(n, 0) + 1);

        int res = 1, prev = 0, prevPrev = 0;

        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            int cur = m.getKey();

            if (mp.containsKey(cur - k)) continue;

            prev = 0;

            while (mp.containsKey(cur)) {
                prevPrev = prev;
                prev = ((1 << mp.get(cur)) - 1) * res;
                res += prevPrev;
                cur += k;
            }
            res += prev;
        }

        return res - 1;
    }

    public int dfs(int[] nums, int k, int idx, HashMap<Integer, Integer> subsets) {
        if (idx == nums.length) return 1;

        int taken = 0;

        if (!subsets.containsKey(nums[idx] - k) && !subsets.containsKey(nums[idx] + k)) {
            subsets.put(nums[idx], subsets.getOrDefault(nums[idx], 0) + 1);

            taken = dfs(nums, k, idx + 1, subsets);

            subsets.put(nums[idx], subsets.get(nums[idx]) - 1);

            if (subsets.get(nums[idx]) == 0) {
                subsets.remove(nums[idx]);
            }
        }

        int notTaken = dfs(nums, k, idx + 1, subsets);

        return taken + notTaken;
    }
}

public class the_number_of_beautiful_subsets {
    public static void main(String[] args) {
        Solution276 s = new Solution276();
        System.out.println(s.beautifulSubsets(new int[]{2, 4, 6}, 2));
    }
}
