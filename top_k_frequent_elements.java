import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution85 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        int[] ans = new int[k];

        // making table with no. of occurrences
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        minHeap.addAll(map.keySet()); // for (int i : map.keySet()) {minHeap.add(i);}

        for (int i = 0; i < k; i++) {
            ans[i] = minHeap.poll();
        }

        // {1=3, 2=2, 3=1}
        // 1
        // 2
        // 3
        // [1, 2, 3]
        // [1, 2]
        return ans;
    }
}

public class top_k_frequent_elements {
    public static void main(String[] args) {
        Solution85 s = new Solution85();
        System.out.println(Arrays.toString(s.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
