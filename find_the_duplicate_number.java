import java.util.HashMap;
import java.util.Map;

class Solution227 {
    public int findDuplicate(int[] nums) {
//        Map<Integer, Integer> count = new HashMap<>();
//
//        for (int num : nums) {
//            count.put(num, count.getOrDefault(num, 0) + 1);
//            if (count.get(num) > 1) return num;
//        }

        int[] freq = new int[nums.length + 1];
        for (int num : nums) {
            freq[num]++;
            if (freq[num] > 1) return num;
        }

        return -1;
    }
}

public class find_the_duplicate_number {
    public static void main(String[] args) {
        Solution227 s = new Solution227();
        System.out.println(s.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }
}
