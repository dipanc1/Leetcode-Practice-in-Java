class Solution159 {
    public int minEatingSpeed(int[] piles, int h) {
//        int l = 1, r = Integer.MIN_VALUE;
//        for (int j : piles) {
//            r = Math.max(r, j);
//        }
//        int result = r;
//
//        while (l < r) {
//            int k = l + (r - l) / 2;
//            int hours = 0;
//            for (int pile : piles) {
//                int time = pile / k;
//                hours += time;
//                if (pile % k != 0) hours++;
//            }
//
//            if (hours <= h) {
//                result = Math.min(result, k);
//                r = k;
//            } else l = k + 1;
//        }
//
//        return result;

//        long sum = 0;
//        for (int p : piles) {
//            sum += p;
//        }
//
//        int n = piles.length;
//        int min = (int) ((sum + h - 1) / h);
//        int max = (int) ((sum + h) / (h - n + 1));
//
//        while (min < max) {
//            int mid = min + (max - min) / 2;
//            int time = 0;
//
//            for (int p : piles) {
//                time += (p + mid - 1) / mid;
//            }
//
//            if (time > h) {
//                min = mid + 1;
//            } else {
//                max = mid;
//            }
//        }
//
//        return min;

        int left = 1, right = 0;
        for (int pile : piles) right = Math.max(right, pile);

        while (left < right) {
            int hoursUsed = 0;
            int middle = (right + left) / 2;

            for (int pile : piles) {
                hoursUsed += (int) Math.ceil((double) pile / middle);
            }

            if (hoursUsed <= h) {
                right = middle;
            }   else {
                left = middle + 1;
            }
        }

        return right;
    }
}

public class koko_eating_bananas {
    public static void main(String[] args) {
        Solution159 s = new Solution159();
        System.out.println(s.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }
}
