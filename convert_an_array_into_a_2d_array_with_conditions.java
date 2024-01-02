import java.util.*;

class Solution181 {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int[] hashMap = new int[nums.length + 1];

        for (int num : nums) {

            if (hashMap[num] >= res.size()) {
                res.add(new ArrayList<>());
            }

            res.get(hashMap[num]++).add(num);

        }

        return res;
    }
}

public class convert_an_array_into_a_2d_array_with_conditions {
    public static void main(String[] args) {
        Solution181 s = new Solution181();
        System.out.println(s.findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1}));
    }
}
