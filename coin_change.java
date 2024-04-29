class Solution258 {
    private Integer[][] dp;

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (coins.length == 0) return -1;
        dp = new Integer[coins.length][amount + 1];
        int res = coinChangeFrom(coins, amount, 0);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private int coinChangeFrom(int[] coins, int amount, int currentIdx) {
        if (amount == 0) return 0;

        if (amount < 0 || currentIdx == coins.length) return Integer.MAX_VALUE;

        if (dp[currentIdx][amount] != null) return dp[currentIdx][amount];

        int c1 = Integer.MAX_VALUE;
        int res = coinChangeFrom(coins, amount - coins[currentIdx], currentIdx);
        if (res != Integer.MAX_VALUE) c1 = res + 1;

        int c2 = coinChangeFrom(coins, amount, currentIdx + 1);

        return dp[currentIdx][amount] = Math.min(c1, c2);
    }
}

public class coin_change {
    public static void main(String[] args) {
        Solution258 s = new Solution258();
        System.out.println(s.coinChange(new int[]{1, 2, 5}, 11));
    }
}
