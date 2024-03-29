import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution117 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);

        search(list, new ArrayList<>(), candidates, target, 0);

        return list;
    }

    private void search(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain == 0) list.add(new ArrayList<>(tempList));

        else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) continue;
                if (remain < nums[i]) break;
                tempList.add(nums[i]);
                search(list, tempList, nums, remain - nums[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

public class combination_sum2 {
    public static void main(String[] args) {
        Solution117 s = new Solution117();
        System.out.println(s.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }
}
