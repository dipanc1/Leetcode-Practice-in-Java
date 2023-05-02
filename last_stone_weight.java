import java.util.PriorityQueue;

class Solution68 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> b - a);
        for (int stone :
                stones) {
            priorityQueue.offer(stone);
        }
        while (priorityQueue.size() > 1) priorityQueue.offer(priorityQueue.poll() - priorityQueue.poll());

        return priorityQueue.poll();
    }
}

public class last_stone_weight {
    public static void main(String[] args) {
        Solution68 s = new Solution68();
        System.out.println(s.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
