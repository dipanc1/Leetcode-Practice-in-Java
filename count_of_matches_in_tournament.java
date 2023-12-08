class Solution165 {

    public int numberOfMatches(int n) {
        int ans = 0;
//        if (n == 1) return 0;
//        if (n % 2 == 0) {
//            return n / 2 + numberOfMatches(n / 2);
//        } else {
//            return (n - 1) / 2 + numberOfMatches((n - 1) / 2 + 1);
//        }
        while (n > 1) {
            ans += n / 2;
            n = (n + 1) / 2;
        }
        return ans;
    }
}

public class count_of_matches_in_tournament {
    public static void main(String[] args) {
        Solution165 s = new Solution165();
        System.out.println(s.numberOfMatches(7));
    }
}
