import java.util.Arrays;

class Solution293 {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 0, high = ((position[position.length - 1] - position[0]) / (m - 1)), ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canWePlace(position, mid, m)) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }

    private boolean canWePlace(int[] arr, int dist, int cows) {
        int count = 1;
        int last = arr[0];

        for (int j : arr) {
            if (j - last >= dist) {
                count++;
                last = j;
            }

            if (count >= cows) {
                return true;
            }
        }

        return false;
    }
}


public class magnetic_force_between_two_balls {
    public static void main(String[] args) {
        Solution293 s = new Solution293();
        System.out.println(s.maxDistance(new int[]{1, 2, 3, 4, 7}, 3));
    }
}
