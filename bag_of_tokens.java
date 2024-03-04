import java.util.Arrays;

class Solution215 {
    public int bagOfTokensScore(int[] tokens, int power) {
        int res = 0, score = 0, l = 0, r = tokens.length - 1;
        Arrays.sort(tokens);

        while (l <= r) {
            if (power >= tokens[l]) {
                power -= tokens[l];
                l++;
                score++;
                res = Math.max(res, score);
            } else if (score > 0) {
                power += tokens[r];
                r--;
                score--;
            } else break;
        }

        return res;
    }
}

public class bag_of_tokens {
    public static void main(String[] args) {
        Solution215 s = new Solution215();
        System.out.println(s.bagOfTokensScore(new int[]{200, 100}, 150));
    }
}
