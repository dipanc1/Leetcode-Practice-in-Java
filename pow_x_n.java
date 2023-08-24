class Solution125 {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;

        if (n < 0) return 1.0 / myPow(x, -n);

        double halfPow = myPow(x, n / 2);

        if (n % 2 == 0) return halfPow * halfPow;
        else return x * halfPow * halfPow;
    }
}

public class pow_x_n {
    public static void main(String[] args) {
        Solution125 s = new Solution125();
        System.out.println(s.myPow(1.00000, -2147483648));
    }
}
