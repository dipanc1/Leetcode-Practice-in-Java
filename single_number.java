import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution126 {
    public int singleNumber(int[] nums) {

//        int ans = 0;
//
//        for (int x : nums) {
//            ans ^= x;
//        }
//
//        return ans;

        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerMap.get(nums[i]) != null) integerMap.put(nums[i], integerMap.get(nums[i]) + 1);
            else integerMap.put(nums[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }

        return -1;
    }
}

public class single_number {
    public static void main(String[] args) {
        Solution126 s = new Solution126();
        System.out.println(s.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
