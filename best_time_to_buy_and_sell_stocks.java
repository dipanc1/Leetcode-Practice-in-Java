class Solution149 {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1, maxProfit = 0, profit = 0; //  left = buy, right = sell

        while (right < prices.length){
            // profitable ?
            if (prices[left] < prices[right]) {
                profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }

        return maxProfit;

    }
}

public class best_time_to_buy_and_sell_stocks {
    public static void main(String[] args) {
        Solution149 s = new Solution149();
        System.out.println(s.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
