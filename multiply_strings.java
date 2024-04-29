class Solution248 {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) return "0";

        if ("1".equals(num1)) return num2;
        if ("1".equals(num2)) return num1;

        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                product += result[i + j + 1];

                result[i + j + 1] = product % 10;
                result[i + j] += product / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (sb.isEmpty() && r == 0) continue;
            sb.append(r);
        }

        return sb.toString();
    }
}

public class multiply_strings {
    public static void main(String[] args) {
        Solution248 s = new Solution248();
        System.out.println(s.multiply("2", "3"));
    }
}
