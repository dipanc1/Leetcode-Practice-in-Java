class Solution295 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//        int total = 0, windowAll = 0, windowPartial = 0, ans = 0;
//        for (int i = 0; i < customers.length; i++) {
//            total += grumpy[i] == 0 ? customers[i] : 0;
//        }
//
//        for (int i = 0; i < customers.length; i++) {
//            windowAll += customers[i];
//            windowPartial += grumpy[i] == 0 ? customers[i] : 0;
//
//            if (i + 1 >= minutes) {
//                ans = Math.max(ans, total - windowPartial + windowAll);
//                int left = i - minutes + 1;
//                windowAll -= customers[left];
//                windowPartial -= grumpy[left] == 0 ? customers[left] : 0;
//            }
//        }
//        return ans;

        int n = grumpy.length, i = 0, currWin = 0, maxWin = 0;
        for (int j = 0; j < n; j++) {
            currWin += grumpy[j] * customers[j];
            maxWin = Math.max(currWin, maxWin);
            if (j >= minutes - 1) {
                currWin -= grumpy[i] * customers[i];
                i++;
            }
        }

        int res = maxWin;
        for (int j = 0; j < n; j++) {
            res += grumpy[j] == 0 ? customers[j] : 0;
        }
        return res;

    }
}

public class grumpy_bookstore_owner {
    public static void main(String[] args) {
        Solution295 s = new Solution295();
        System.out.println(s.maxSatisfied(new int[]{1, 0, 1, 2, 1, 1, 7, 5}, new int[]{0, 1, 0, 1, 0, 1, 0, 1}, 3));
    }
}
