class Solution124 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1)
            return Integer.MIN_VALUE;

        int sub = dividend % divisor;

        return (dividend - sub) / divisor;
    }
}

public class divide_two_integers {
    public static void main(String[] args) {
        Solution124 s = new Solution124();
        System.out.println(s.divide(10, 3));
    }
}
