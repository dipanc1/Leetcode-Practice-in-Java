import java.util.Arrays;
import java.util.Comparator;

class Solution226 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int count = 1;

        long prevLast = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (prevLast >= points[i][0]) {
                prevLast = Math.min(points[i][1], prevLast);
            } else {
                prevLast = points[i][1];
                count++;
            }
        }

        return count;

//        int arrows = 1;
//        long end = points[0][1];
//
//        for (int[] balloon : points) {
//            if (balloon[0] > end) {
//                end = balloon[1];
//                arrows++;
//            }
//        }
//
//        return arrows;
    }
}

public class minimum_number_of_arrows_to_burst_balloons {
    public static void main(String[] args) {
        Solution226 s = new Solution226();
        System.out.println(s.findMinArrowShots(new int[][]{new int[]{10, 16}, new int[]{2, 8}, new int[]{1, 6}, new int[]{7, 12}}));
    }
}
