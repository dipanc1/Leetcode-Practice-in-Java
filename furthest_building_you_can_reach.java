import java.util.Comparator;
import java.util.PriorityQueue;

class Solution210 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int i = 0;
        for (i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff <= 0) continue;

            bricks -= diff;
            maxHeap.add(diff);

            if (bricks < 0) {
                if (ladders == 0) return i;
                ladders--;
                bricks += maxHeap.poll();
            }
        }
        return i;
    }
}

public class furthest_building_you_can_reach {
    public static void main(String[] args) {
        Solution210 s = new Solution210();
        System.out.println(s.furthestBuilding(new int[]{4, 2, 7, 6, 9, 14, 12}, 5, 1));
    }
}
