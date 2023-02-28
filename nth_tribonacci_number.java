class Solution34 {
    public int tribonacci(int n) {
        // T0 = 0, T1 = 1, T2 = 1 and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
        // Tn = Tn-3 + Tn-2 + Tn-1
//        if (n == 0) return 0;
//        if (n == 1 || n == 2) return 1;
//        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);

        if (n == 0 || n == 1) return n;

        int[] dp = new int[n+1];

        dp[0] = 0; dp[1] = 1; dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }

        return dp[n];
    }
}
public class nth_tribonacci_number {
    public static void main(String[] args) {
        Solution34 s =  new Solution34();
        System.out.println(s.tribonacci(4));
    }
}
