import java.util.PriorityQueue;

class Solution68 {
    public int lastStoneWeight(int[] stones) {
        // make a priority queue in decreasing order
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            heap.offer(stone);
        }

        while (heap.size() > 1) heap.offer(heap.poll() - heap.poll());

        return heap.poll();

    }
}

public class last_stone_weight {
    public static void main(String[] args) {
        Solution68 s = new Solution68();
        System.out.println(s.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
