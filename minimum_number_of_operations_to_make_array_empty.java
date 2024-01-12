import java.util.HashMap;
import java.util.Map;

class Solution183 {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> count = counter(nums);
        int res = 0;

        for (int entry : count.values()) {
            if (entry == 1) return -1;

            res += Math.ceilDiv(entry, 3);
        }

        return res;
    }

    public HashMap<Integer, Integer> counter(int[] nums) {

        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int n : nums) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }
        return counter;
    }
}

public class minimum_number_of_operations_to_make_array_empty {
    public static void main(String[] args) {
        Solution183 s = new Solution183();
        System.out.println(s.minOperations(new int[]{2, 3, 3, 2, 2, 4, 2, 3, 4}));
    }
}
