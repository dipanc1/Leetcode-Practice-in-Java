class Solution3 {
    public int fib(int n) {
        if (n <= 1) return n;

        int last = fib(n - 1);
        int secondLast = fib(n - 2);

        return last + secondLast;

        // Time Complexity -> 2^n (exponential)
        // Space Complexity ->
    }
}
public class fibbonacci {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.fib(4));
    }
}
