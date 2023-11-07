import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution141 {

    public int minChange(int amoount, List<Integer> coins) {
        return minChange(amoount, coins, new HashMap<>());
    }

    public int minChange(int amount, List<Integer> coins, HashMap<Integer, Integer> memo) {
        if (amount == 0) return amount;

        if (amount < 0) return -1;

        if (memo.containsKey(amount)) memo.get(amount);

        int minCoins = -1;

        // recursive solution (brute force)
//        for (int coin : coins) {
//            int sumAmount = amount - coin;
//            int subCoins = minChange(sumAmount, coins);
//            if (subCoins != -1) {
//                int numCoins = subCoins + 1;
//                if (numCoins < minCoins || minCoins == -1) minCoins = numCoins;
//            }
//        }

        // memoization solution
        for (int coin : coins) {
            int sumAmount = amount - coin;
            int subCoins = minChange(sumAmount, coins);
            if (subCoins != -1) {
                int numCoins = subCoins + 1;
                if (numCoins < minCoins || minCoins == -1) minCoins = numCoins;
            }
        }
        memo.put(amount, minCoins);
        return minCoins;
    }
}

public class min_change {
    public static void main(String[] args) {
        Solution141 s = new Solution141();
        ArrayList<Integer> coins = new ArrayList<>();
        coins.add(1);
        coins.add(2);
        coins.add(3);
        System.out.println(s.minChange(4, coins));
    }
}
