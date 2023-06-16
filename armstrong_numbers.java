import java.util.ArrayList;

//User function Template for Java
class Solution91 {
    static String armstrongNumber(int n) {
        // code here
        int res, sum = 0, k = n;
        while (k != 0) {
            res = k % 10;
            k = k / 10;
            sum += res * res * res;
        }
        if (n == sum) return "Yes";
        return "No";

    }

}

public class armstrong_numbers {
    public static void main(String[] args) {
        Solution91 s = new Solution91();
        System.out.println(s.armstrongNumber(370));
    }
}
