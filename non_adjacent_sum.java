import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution144 {
    public int nonAdjacentSum(List<Integer> nums) {
        return nonAdjacentSum(nums, 0, new HashMap<>());
    }

    public int nonAdjacentSum(List<Integer> nums, int i, HashMap<Integer, Integer> memo) {
        if (i >= nums.size()) return 0;

        if (memo.containsKey(i)) return memo.get(i);
        // i + 2 because it would be adjacent to i (brute force recursion)
//        return Math.max(
//                nums.get(i) + nonAdjacentSum(nums, i + 2),
//                nonAdjacentSum(nums, i + 1)
//        );
        int result = Math.max(nums.get(i) + nonAdjacentSum(nums, i + 2, memo), nonAdjacentSum(nums, i + 1, memo));

        memo.put(i, result);
        return result;

    }
}

public class non_adjacent_sum {
    public static void main(String[] args) {
        Solution144 s = new Solution144();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(4);
        integerList.add(5);
        integerList.add(12);
        integerList.add(7);
        System.out.println(s.nonAdjacentSum(integerList));
    }
}
