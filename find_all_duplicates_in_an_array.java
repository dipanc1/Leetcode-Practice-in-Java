import java.util.ArrayList;
import java.util.List;

class Solution228 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
//        Map<Integer, Integer> count = new HashMap<>();
//
//        for (int num : nums) {
//            count.put(num, count.getOrDefault(num, 0) + 1);
//            if (count.get(num) > 1) return num;
//        }

        int[] freq = new int[nums.length + 1];
        for (int num : nums) {
            freq[num]++;
            if (freq[num] > 1) res.add(num);
        }

        return res;
    }
}

public class find_all_duplicates_in_an_array {
    public static void main(String[] args) {
        Solution228 s = new Solution228();
        System.out.println(s.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
