import java.util.HashMap;

class Solution233 {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int res = 0, far_l = 0, near_l = 0;
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int l = 0, r = 0; r < nums.length; r++) {
            count.put(nums[r], count.getOrDefault(nums[r], 0) + 1);

            while (count.size() > k) {
                count.put(count.get(nums[near_l]), count.get(nums[near_l]) - 1);

                if (count.get(nums[near_l]) == 0) count.remove(nums[near_l]);
                near_l++;
                far_l = near_l;
            }


            while (count.get(nums[near_l]) > 1) {
                count.put(count.get(nums[near_l]), count.get(nums[near_l]) - 1);
                near_l++;
            }

            if (count.size() == k) {
                res += near_l - far_l + 1;
            }

        }


        return res;
    }
}

public class subarrays_with_k_different_integers {
    public static void main(String[] args) {
        Solution233 s = new Solution233();
        System.out.println(s.subarraysWithKDistinct(new int[]{1, 2, 1, 2, 3}, 2));
    }
}
