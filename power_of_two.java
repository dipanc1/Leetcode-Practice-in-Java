class Solution123 {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;

        if (n == 1) return true;

        if (n % 2 != 0) return false;

        return isPowerOfTwo(n / 2);
    }
}

public class power_of_two {
    public static void main(String[] args) {
        Solution123 s = new Solution123();
        System.out.println(s.isPowerOfTwo(6));
    }
}
