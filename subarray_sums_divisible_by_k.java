import java.util.HashMap;

class Solution287 {
    public int subarraysDivByK(int[] nums, int k) {
        int currSum = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
//        int[] prefix_cnt = new int[nums.length];
        map.put(0, 1);

        for (int num : nums) {
            currSum += num;
            int remain = currSum % k;

            res += map.getOrDefault(remain, 0);

            map.put(remain, map.getOrDefault(remain, 0) + 1);
        }

        return res;
    }
}

public class subarray_sums_divisible_by_k {
    public static void main(String[] args) {
        Solution287 s = new Solution287();
        System.out.println(s.subarraysDivByK(new int[]{5}, 9));
    }
}
