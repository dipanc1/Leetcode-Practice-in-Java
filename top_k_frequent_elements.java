import java.util.*;

class Solution85 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b) -> hp.get(b) - hp.get(a));

        for (int num : nums) {
            hp.put(num, hp.getOrDefault(num, 0) + 1);
        }

        minheap.addAll(hp.keySet());

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = minheap.poll();
        }

        return ans;

    }
}

public class top_k_frequent_elements {
    public static void main(String[] args) {
        Solution85 s = new Solution85();
        System.out.println(Arrays.toString(s.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
