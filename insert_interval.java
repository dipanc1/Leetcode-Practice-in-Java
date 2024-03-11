import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution225 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int start = newInterval[0], end = newInterval[1]; // 2, 5
//        boolean inserted = false;
//
//        for (int[] inv : intervals) {
//            int cStart = inv[0], cEnd = inv[1];
//
//            // 5 < 1
//            if (cEnd < start || inserted) {
//                ans.add(new int[]{cStart, cEnd});
//                continue;
//            }
//
//            start = Math.min(start, cStart);
//            // 3 < 2
//            if (end < cStart) {
//                ans.add(new int[]{start, end});
//                ans.add(new int[]{cStart, cEnd});
//                inserted = true;
//                continue;
//            }
//            // 3 <= 5
//            if (end <= cEnd) {
//                ans.add(new int[]{start, cEnd});
//                inserted = true;
//            }
//        }
//
//        if (!inserted) ans.add(new int[]{start, end});

        int n = intervals.length;
        int index = 0;

        while (index < n && intervals[index][1] < start) {
            ans.add(intervals[index]);
            index++;
        }

        while (index < n && intervals[index][0] <= end) {
            end = Math.max(end, intervals[index][1]);
            start = Math.min(start, intervals[index][0]);
            index++;
        }

        ans.add(newInterval);

        while (index < n) {
            ans.add(intervals[index]);
            index++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}

public class insert_interval {
    public static void main(String[] args) {
        Solution225 s = new Solution225();
        System.out.println(Arrays.deepToString(s.insert(new int[][]{new int[]{1, 3}, new int[]{6, 9}}, new int[]{2, 5})));
    }
}
