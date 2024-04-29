class Solution247 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
//        int sGas = 0, sCost = 0, res = 0, total = 0;
//        for (int i = 0; i < gas.length; i++) {
//            sGas += gas[i];
//            sCost += cost[i];
//        }
//        if (sGas < sCost) return -1;
//
//        for (int i = 0; i < gas.length; i++) {
//            total += gas[i] - cost[i];
//            if (total < 0) {
//                total = 0;
//                res = i + 1;
//            }
//        }
//
//        return res;

        int n = gas.length, min = 0, tank = 0, start = 0;

        for (int i = 0; i < n; i++) {
            tank += gas[i] - cost[i];
            if (tank < min) {
                min = tank;
                start = i + 1;
            }
        }

        if (tank < 0) return -1;

        return start == n ? 0 : start;
    }
}

public class gas_station {
    public static void main(String[] args) {
        Solution247 s = new Solution247();
        System.out.println(s.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }
}
