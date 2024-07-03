import java.util.HashMap;

class Solution286 {
    public int subarraySum(int[] nums, int k) {
        int currSum = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int num : nums) {
            currSum += num;
            int diff = currSum - k;

            res += map.getOrDefault(diff, 0);

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return res;
    }
}

public class subarray_sum_equals_k {
    public static void main(String[] args) {
        Solution286 s = new Solution286();
        System.out.println(s.subarraySum(new int[]{1, 1, 1}, 2));
    }
}
