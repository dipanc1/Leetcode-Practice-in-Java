class Solution166 {
    public int totalMoney(int n) {
        int ans = 0, monday = 1;

        while (n > 0) {
            for (int i = 0; i < Math.min(n, 7); i++) {
                ans += i + monday;
            }

            n -= 7;
            monday++;
        }

        return ans;
    }
}

public class calculate_money_in_leetcode_bank {
    public static void main(String[] args) {
        Solution166 s = new Solution166();
        System.out.println(s.totalMoney(4));
    }
}
