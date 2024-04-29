class Solution241 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;

        for (int i = 0; i < tickets.length;i++){
            if (i <= k) {
                count += Math.min(tickets[i], tickets[k]);
            } else {
                count += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return count;
    }
}

public class time_needed_to_buy_tickets {
    public static void main(String[] args) {
        Solution241 s = new Solution241();
        System.out.println(s.timeRequiredToBuy(new int[]{2, 3, 2}, 2));
    }
}
