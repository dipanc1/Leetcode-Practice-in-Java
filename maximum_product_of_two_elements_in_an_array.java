class Solution168 {
    public int maxProduct(int[] nums) {
        int largest = 0, sLargest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= largest || nums[i] >= sLargest) {
                sLargest = Math.max(largest, sLargest);
                largest = nums[i];
            }
        }
        return (largest - 1) * (sLargest - 1);
    }
}

public class maximum_product_of_two_elements_in_an_array {
    public static void main(String[] args) {
        Solution168 s = new Solution168();
        System.out.println(s.maxProduct(new int[]{3, 4, 5, 2}));
    }
}
