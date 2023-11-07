import java.util.HashMap;

class Solution138 {

    public int fibo(int n) {
        // recursive without memoization
        return fibo(n, new HashMap<>());
    }

    public int fibo(int n, HashMap<Integer, Integer> memo) {
        // recursive without memoization
        if (n == 0 || n == 1) return n;
//        return fibo(n - 1) + fibo(n - 2);

        if (memo.containsKey(n)) return memo.get(n);

        int result = fibo(n - 1, memo) + fibo(n - 2, memo);
        memo.put(n, result);
        return result;
    }

}

public class fib {
    public static void main(String[] args) {
        Solution138 s = new Solution138();
        System.out.println(s.fibo(60));
    }
}
