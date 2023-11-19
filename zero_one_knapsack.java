import java.util.HashMap;

class Solution147 {
    public int zeroOneKnapsack(int[] weights, int[] values, int n, int maxCapacity, HashMap<Integer, Integer> data) {
        for (int itemNum = 0; itemNum <= n; itemNum++) {
            for (int capacity = 0; capacity <= maxCapacity; capacity++) {
                if (itemNum == 0 || capacity == 0) data.put(itemNum, capacity);
                else if (weights[itemNum] <= capacity) {
                    data.put(itemNum, Math.max(values[itemNum] + (data.get(itemNum - 1) - weights[itemNum]), data.get(itemNum - 1)));
                } else {
                    data.put(itemNum - 1, capacity);
                }
            }
        }
        return data.get(n);
    }
}

public class zero_one_knapsack {
    public static void main(String[] args) {
        Solution147 s = new Solution147();
        int[] weights = new int[]{0, 8, 2, 6, 1};
        int[] values = new int[]{0, 50, 150, 210, 30};

        HashMap<Integer, Integer> data = new HashMap<>();

        int n = 4;
        int maxCapacity = 10;

        System.out.println(s.zeroOneKnapsack(weights, values, n, maxCapacity, data));
    }
}
