import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;

class Solution253 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] ans = new int[nums.length - k + 1];

        PriorityQueue<Integer> maxPq = new PriorityQueue<>((o1, o2) -> (o2 - o1));

        for (int i = 0; i < nums.length; i++) {
            int start = i - k;

            if (start >= 0) maxPq.remove(start);
            maxPq.offer(i);

            if (maxPq.size() == k) ans[i - k + 1] = nums[maxPq.peek()];
        }

        return ans;
    }
}

public class sliding_window_maximum {
    public static void main(String[] args) {
        Solution253 s = new Solution253();
        System.out.println(Arrays.toString(s.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}
