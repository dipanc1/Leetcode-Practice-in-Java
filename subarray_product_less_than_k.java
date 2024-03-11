class Solution230 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0, l = 0, product = 1;

        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];

            while (product >= k && l <= i) {
                product = product / nums[l];
                l++;
            }

            res += (i - l + 1);
        }


        return res;
    }
}

public class subarray_product_less_than_k {
    public static void main(String[] args) {
        Solution230 s = new Solution230();
        System.out.println(s.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }
}
