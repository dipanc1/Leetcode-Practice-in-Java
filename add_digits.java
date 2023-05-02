import java.sql.Array;

class Solution69 {
    public int addDigits(int num) {
        if (num == 0) return 0;
        else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}

public class add_digits {
    public static void main(String[] args) {
        Solution69 s = new Solution69();
        System.out.println(s.addDigits(38));
    }
}