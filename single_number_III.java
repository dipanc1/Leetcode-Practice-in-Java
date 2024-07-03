import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution281 {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();


        for (int num : nums) mp.put(num, mp.getOrDefault(num, 0) + 1);

        int index = 0;

        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            if (m.getValue() == 1) ans[index++] = m.getKey();
        }

        return ans;
    }
}

public class single_number_III {
    public static void main(String[] args) {
        Solution281 s = new Solution281();
        System.out.println(Arrays.toString(s.singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }
}
