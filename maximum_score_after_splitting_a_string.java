class Solution173 {
    public int maxScore(String s) {
        int maxScore = 0;
        int zeroesInLeft = 0;
        int onesInRight = (int) s.chars().filter(c -> c == '1').count();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') zeroesInLeft++;
            else onesInRight--;

            maxScore = Math.max(maxScore, (zeroesInLeft + onesInRight));
        }

        return maxScore;
    }
}

public class maximum_score_after_splitting_a_string {
    public static void main(String[] args) {
        Solution173 s = new Solution173();
        System.out.println(s.maxScore("011101"));
    }
}
