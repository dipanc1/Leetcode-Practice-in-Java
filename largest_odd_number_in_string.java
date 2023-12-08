import java.util.ArrayList;

class Solution167 {
    public String largestOddNumber(String num) {
        int n = num.length() - 1;
        if ((int) num.charAt(n) % 2 != 0) return num;

        while (n > 0) {
            int i = num.charAt(n);
            if (i % 2 != 0) return num.substring(0, n + 1);
            n--;
        }

        return "";

    }
}

public class largest_odd_number_in_string {
    public static void main(String[] args) {
        Solution167 s = new Solution167();
        System.out.println(s.largestOddNumber("52"));
    }
}
