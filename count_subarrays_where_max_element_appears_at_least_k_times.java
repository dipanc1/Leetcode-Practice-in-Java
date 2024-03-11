import java.util.Arrays;
import java.util.HashMap;

class Solution232 {
    public long countSubarrays(int[] nums, int k) {
        long max_num = Integer.MIN_VALUE, max_cnt = 0, l = 0, res = 0;

        for (int num : nums) {
            max_num = Math.max(max_num, num);
        }

        for (int num : nums) {
            if (num == max_num) max_cnt++;

            while (max_cnt == k) {
                if (nums[(int) l] == max_num) max_cnt--;
                l++;
            }

            res += l;
        }

        return res;
    }

}

public class count_subarrays_where_max_element_appears_at_least_k_times {
    public static void main(String[] args) {
        Solution232 s = new Solution232();
        System.out.println(s.countSubarrays(new int[]{2, 2, 2, 2, 1, 3, 3, 2, 2, 1, 1, 3, 1, 1, 2, 3, 2, 1, 1, 2, 1, 1, 2, 1, 2, 1, 2, 1, 3, 1, 3, 3}, 5));
    }
}
