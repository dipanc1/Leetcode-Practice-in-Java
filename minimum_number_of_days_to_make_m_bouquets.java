class Solution294 {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = 1, high = (int) 1e9;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isPossibleBouquets(bloomDay, m, k, mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    private boolean isPossibleBouquets(int[] bloomDay, int bouquets, int adjacentFlowers, int day) {
        int total = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            int count = 0;
            while (i < bloomDay.length && count < adjacentFlowers && bloomDay[i] <= day) {
                count++;
                i++;
            }

            if (count == adjacentFlowers) {
                total++;
                i--;
            }

            if (total >= bouquets) {
                return true;
            }
        }

        return false;
    }
}

public class minimum_number_of_days_to_make_m_bouquets {
    public static void main(String[] args) {
        Solution294 s = new Solution294();
        System.out.println(s.minDays(new int[]{1, 10, 3, 10, 2}, 3, 1));
    }
}
