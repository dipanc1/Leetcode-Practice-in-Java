import java.util.PriorityQueue;

class Solution161 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            priorityQueue.add(num);
        }

        System.out.println(priorityQueue);

        for (int i = 0; i < k - 1; i++) {
            priorityQueue.poll();
        }

        return priorityQueue.peek();
    }
}


public class kth_largest_element_in_an_array {
    public static void main(String[] args) {
        Solution161 s = new Solution161();
        System.out.println(s.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 4));
    }
}
