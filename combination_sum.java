import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution108 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        search(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void search(List<List<Integer>> list, List<Integer> templList, int[] nums, int remain, int start) {
        if (remain == 0) list.add(new ArrayList<>(templList));
        else if (remain < 0) return;
        else {
            for (int i = start; i < nums.length; i++) {
                templList.add(nums[i]);
                search(list, templList, nums, remain - nums[i], i);
                templList.remove(templList.size() - 1);
            }
        }
    }
}

public class combination_sum {
    public static void main(String[] args) {
        Solution108 s = new Solution108();
        System.out.println(s.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
