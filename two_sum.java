import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
//        int[] sum = new int[2];
//        for (int i = 0; i < nums.length; ++i) {
//            for (int j = i + 1; j < nums.length; ++j) {
//                if (target == nums[i] + nums[j]) {
//                    sum[0] = i;
//                    sum[1] = j;
//                    return sum;
//                }
//            }
//        }
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) return new int[]{hashMap.get(target - nums[i]), i};

            hashMap.put(nums[i], i);
        }
        return null;


    }
}

public class two_sum {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(Arrays.toString(s.twoSum(new int[]{3, 2, 4}, 6)));
    }
}
