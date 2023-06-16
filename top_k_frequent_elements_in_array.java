import java.util.*;

class Solution93 {
    public int[] topK(int[] nums, int k) {
        // Code here
        int n = nums.length;
        int[] ans = new int[k];
        Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (!integerMap.containsKey(nums[i])) {
                integerMap.put(nums[i], 1);
            } else {
                integerMap.put(nums[i], integerMap.get(nums[i]) + 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if (b.getValue() > a.getValue()) return 1;
            if (b.getValue() < a.getValue()) return -1;
            else return b.getKey() - a.getKey();
        });

        pq.addAll(integerMap.entrySet());

        for (int i = 0; i < k; i++) {
            ans[i] = Objects.requireNonNull(pq.poll()).getKey();
        }

        return ans;
    }
}

public class top_k_frequent_elements_in_array {
    public static void main(String[] args) {
        Solution93 s = new Solution93();
        System.out.println(Arrays.toString(s.topK(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
