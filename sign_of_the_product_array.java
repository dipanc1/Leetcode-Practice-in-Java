class Solution72 {
    public int arraySign(int[] nums) {
        int sign = 1;

        for (int num : nums) {
            if (num == 0) return 0;
            sign *= num > 0 ? 1 : -1;
        }
        return sign;
    }
}

public class sign_of_the_product_array {
    public static void main(String[] args) {
        Solution72 s = new Solution72();
        System.out.println(s.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1}));
    }
}
