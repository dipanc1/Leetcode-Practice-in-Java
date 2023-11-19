import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution146 {
    public int countingChange(int amount, List<Integer> coins) {
        return countingChange(amount, 0, coins, new HashMap<>());
    }

    public int countingChange(int amount, int coinIdx, List<Integer> coins, HashMap<List<Integer>, Integer> memo) {
        if (amount == 0) return 1;

        if (coinIdx >= coins.size()) return 0;

        List<Integer> key = List.of(amount, coinIdx);
        if (memo.containsKey(key)) return memo.get(key);

        int totalWays = 0;

        int value = coins.get(coinIdx);

        for (int qty = 0; qty * value <= amount; qty++) {
            int subAmount = amount - (qty * value);
            totalWays += countingChange(subAmount, coinIdx + 1, coins, memo);
        }

        memo.put(key, totalWays);
        return totalWays;
    }
}

public class counting_change {
    public static void main(String[] args) {
        Solution146 s = new Solution146();
        System.out.println(s.countingChange(4, List.of(1, 2, 3)));
    }
}
