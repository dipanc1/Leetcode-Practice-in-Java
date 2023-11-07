import java.util.Arrays;

class Solution87 {
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) {
        //Your code here
        long[] longs = new long[n];
        longs[0] = 1;
        if (n == 1) {
            return longs;
        }
        longs[1] = 1;
        for (int i = 2; i < n; i++) {
            longs[i] = longs[i - 2] + longs[i - 1];
        }
        return longs;
    }
}

public class fibonacci_numbers {
    public static void main(String[] args) {
         Solution87 s = new Solution87();
        System.out.println(Arrays.toString(s.printFibb(50)));
    }
}
