class Solution47 {
    public int shipWithinDays(int[] weights, int D) {
        int left = Integer.MIN_VALUE, right = 0;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            System.out.println("left right mid value are -- " + left + " " + right + " " + mid);
            if (isValid(weights, mid) <= D) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int isValid(int[] weights, int target) {
        int total = 0;
        int count = 1;
        for (int w : weights) {
            total += w;
            if (total > target) {
                count++;
                total = w;
            }
        }
        return count;
    }
}

public class capacity_to_ship_packages_within_d_days {
    public static void main(String[] args) {
        Solution47 s = new Solution47();
        System.out.println(s.shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
    }
}
