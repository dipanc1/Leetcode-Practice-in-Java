import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution85 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        minHeap.addAll(map.keySet());

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = minHeap.poll();
        }
        return ans;

    }
}

public class top_k_frequent_elements {
    public static void main(String[] args) {
        Solution85 s = new Solution85();
        System.out.println(s.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }
}
