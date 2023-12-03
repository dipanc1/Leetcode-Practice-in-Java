import java.util.Arrays;

class Solution159 {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Integer.MIN_VALUE;
        for (int j : piles) {
            r = Math.max(r, j);
        }
        int result = r;

        while (l < r) {
            int k = l + (r - l) / 2;
            int hours = 0;
            for (int pile : piles) {
                int time = pile / k;
                hours += time;
                if (pile % k != 0) hours++;
            }

            if (hours <= h) {
                result = Math.min(result, k);
                r = k;
            } else l = k + 1;
        }

        return result;
    }
}

public class koko_eating_bananas {
    public static void main(String[] args) {
        Solution159 s = new Solution159();
        System.out.println(s.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }
}
