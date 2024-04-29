import java.util.PriorityQueue;

class Solution257 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : nums) {
            pq.add(n);
        }

        int ans = 1, count = 1, prev = pq.remove();

        while (!pq.isEmpty()) {
            int present = pq.remove();
            if (present == prev) continue;
            else if (Math.abs(present - prev) == 1) {
                count++;
                ans = Math.max(ans, count);
                prev = present;
            } else {
                count = 1;
                prev = present;
            }
        }

        return ans;
    }
}

public class longest_consecutive_sequence {
    public static void main(String[] args) {
        Solution257 s = new Solution257();
        System.out.println(s.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
