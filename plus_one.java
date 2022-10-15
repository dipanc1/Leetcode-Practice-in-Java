import java.util.ArrayList;
import java.util.Arrays;

class Solution8 {
//    public String[] plusOne(int[] digits) {
//        StringBuilder s = new StringBuilder();
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i : digits) {
//            s.append(i);
//        }
//        int digit = Integer.parseInt(s.toString()) + 1;
//        String gidit = Integer.toString(digit);
//        return gidit.split("");
//
//    }
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
}

public class plus_one {
    public static void main(String[] args) {
        Solution8 s = new Solution8();
        System.out.println(Arrays.toString(s.plusOne(new int[]{4, 3, 2, 1})));
    }
}
