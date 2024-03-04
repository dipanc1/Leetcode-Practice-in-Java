import java.util.Arrays;

class Solution32 {
    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n + 1];

        for (int[] t : trust) {
            count[t[0]]--;
            if (count[t[1]] == -1) continue;
            count[t[1]]++;
        }

        for (int i = 1; i <= n; ++i) {
            if (count[i] == n - 1) return i;
        }

        return -1;
    }

}

public class find_the_town_judge {
    public static void main(String[] args) {
        Solution32 s = new Solution32();
        System.out.println(s.findJudge(3, new int[][]{{1, 2}, {2, 3}}));
    }
}
