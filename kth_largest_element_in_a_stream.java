import java.util.PriorityQueue;

class KthLargest {
    private final PriorityQueue<Integer> heap = new PriorityQueue<>();
    private final int k1;

    public KthLargest(int k, int[] nums) {
        this.k1 = k;
        for (int n : nums) {
            add(n);
        }
    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k1) heap.poll();
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */


public class kth_largest_element_in_a_stream {
    public static void main(String[] args) {
        KthLargest k = new KthLargest(3, new int[]{4, 5, 8, 2});
        k.add(3);   // return 4
        k.add(5);   // return 5
        k.add(10);  // return 5
        k.add(9);   // return 8
        k.add(4);
        System.out.println(k);
    }
}
