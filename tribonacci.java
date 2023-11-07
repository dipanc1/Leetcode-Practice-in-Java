import java.util.HashMap;

class Solution139 {
    public int trib(int n) {
        return trib(n, new HashMap<>());
    }
    public int trib(int n, HashMap<Integer, Integer> dp) {
        // dynamic programming
        if (n == 0 || n == 1) return 0;
        if (n == 2) return 1;
        // trib(n - 3) + trib(n - 2) + trib(n - 1) recursive soln.
        if (dp.containsKey(n)) return dp.get(n);

        int res = trib(n - 3, dp) + trib(n - 2, dp) + trib(n - 1, dp);
        dp.put(n, res);

        return res;
    }
}

public class tribonacci {
    public static void main(String[] args) {
        Solution139 s = new Solution139();
        System.out.println(s.trib(85));
    }
}
