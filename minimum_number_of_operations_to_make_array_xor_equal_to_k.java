class Solution262 {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        for (int x : nums) {
            ans = ans ^ x; // total bitwise of nums
        }
        ans = ans ^ k;

        int res = 0;

        while (ans > 0) {
            if ((ans & 1) != 0) res++;
            ans = ans >> 1;
        }

        return res;
    }
}

public class minimum_number_of_operations_to_make_array_xor_equal_to_k {
    public static void main(String[] args) {
        Solution262 s = new Solution262();
        System.out.println(s.minOperations(new int[]{2, 1, 3, 4}, 1));
    }
}
