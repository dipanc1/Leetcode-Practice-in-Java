class Solution176 {
    public int minCost(String colors, int[] neededTime) {
        int res = 0;
        int l = colors.length();
        char[] chars = colors.toCharArray();
        int maxTime = neededTime[0];

        for (int i = 1; i < l; i++) {
            if (chars[i - 1] != chars[i]) {
                maxTime = neededTime[i];
            } else {
                res += Math.min(maxTime, neededTime[i]);
                maxTime = Math.max(maxTime, neededTime[i]);
            }
        }

        return res;
    }
}

public class minimum_time_to_make_rope_colorful {
    public static void main(String[] args) {
        Solution176 s = new Solution176();
        System.out.println(s.minCost("aaabbbabbbb", new int[]{3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1}));
    }
}
