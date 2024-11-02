class Solution308 {
    public int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            ans = (ans * 10) + lastDigit;
            x /= 10;
        }

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;
        else return (int) ans;
    }
}

public class reverse_integer {
    public static void main(String[] args) {
        Solution308 s = new Solution308();
        System.out.println(s.reverse(1534236469));
    }
}
