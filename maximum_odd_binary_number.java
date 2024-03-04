class Solution214 {
    public String maximumOddBinaryNumber(String s) {
        int count1 = 0, count2 = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') count1++;
            else count2++;
        }

        return "1".repeat(count1 - 1) +
                "0".repeat(count2) +
                "1";
    }
}

public class maximum_odd_binary_number {
    public static void main(String[] args) {
        Solution214 s = new Solution214();
        System.out.println(s.maximumOddBinaryNumber("010"));
    }
}
