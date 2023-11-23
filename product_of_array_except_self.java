import java.util.Arrays;

class Solution152 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int prefix = 1, postfix = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }

        return res;
    }
}

public class product_of_array_except_self {
    public static void main(String[] args) {
        Solution152 s = new Solution152();
        System.out.println(Arrays.toString(s.productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
