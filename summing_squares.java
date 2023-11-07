import java.util.HashMap;

class Solution145 {

    public int summingSquare(int n) {
        return (int) summingSquare(n, new HashMap<>());
    }

    public double summingSquare(int n, HashMap<Integer, Double> memo) {
        if (n == 0) return 0;
        if (memo.containsKey(n)) return memo.get(n);

        double minSquares = Double.POSITIVE_INFINITY;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            int square = i * i;
            double numSquares = 1 + summingSquare(n - square, memo);
            if (numSquares < minSquares) minSquares = numSquares;

        }
        double result = minSquares;
        memo.put(n, result);

        return result;
    }
}

public class summing_squares {
    public static void main(String[] args) {
        Solution145 s = new Solution145();
        System.out.println(s.summingSquare(12));
    }
}
