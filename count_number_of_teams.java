class Solution302 {
    public int numTeams(int[] rating) {
        int res = 0;
        int n = rating.length;
        int[][][] visited = new int[n][n][n];
        for (int i = 0; i < n; i++) {
            res += backTrack(i, true, 1, rating);
            res += backTrack(i, false, 1, rating);
        }

//        for (int i = 1; i < rating.length - 1; i++) {
//            int left_smaller = 0, right_larger = 0;
//
//            for (int m = 0; m < i; m++) {
//                if (rating[m] < rating[i]) left_smaller++;
//            }
//
//            for (int m = i + 1; m < rating.length; m++) {
//                if (rating[m] > rating[i]) right_larger++;
//            }
//
//            res += left_smaller * right_larger;
//
//            int left_larger = i - left_smaller, right_smaller = rating.length - i - 1 - right_larger;
//
//            res += left_larger * right_smaller;
//
//        }

        return res;
    }

    private int backTrack(int i, boolean ascend, int count, int[] rating) {
        if (count == 3) return 1;
        if (i == rating.length) return 0;

        int res = 0;

        for (int j = i + 1; j < rating.length; j++) {
            if (ascend && rating[i] < rating[j]) res += backTrack(j, ascend, count + 1, rating);
            if (!ascend && rating[i] > rating[j]) res += backTrack(j, ascend, count + 1, rating);
        }

        return res;

    }
}

public class count_number_of_teams {
    public static void main(String[] args) {
        Solution302 s = new Solution302();
        System.out.println(s.numTeams(new int[]{2, 5, 3, 4, 1}));
    }
}
