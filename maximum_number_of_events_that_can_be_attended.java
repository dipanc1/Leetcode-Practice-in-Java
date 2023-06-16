import java.util.Arrays;
import java.util.PriorityQueue;

class Solution107 {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int ans = 0, i = 0, n = events.length;
        for (int d = 0; d <= 100000; d++) {
            while (!minHeap.isEmpty() && minHeap.peek() < d){
                minHeap.poll();
            }
            while (i < n && events[i][0] == d){
                minHeap.offer(events[i++][1]);
            }
            if (!minHeap.isEmpty()){
                minHeap.poll();
                ans++;
            }
        }

        return ans;
    }
}

public class maximum_number_of_events_that_can_be_attended {
    public static void main(String[] args) {
        Solution107 s = new Solution107();
        System.out.println(s.maxEvents(new int[][]{{1, 2}, {2, 3}, {3, 4}}));
    }
}
