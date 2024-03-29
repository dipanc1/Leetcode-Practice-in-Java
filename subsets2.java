import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution120 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        result.add(new ArrayList<>());
        subsets(0, nums, numList, result, true);
        return result;
    }

    private void subsets(int offset, int[] nums, List<Integer> numList, List<List<Integer>> result, boolean isPicked) {
        if (offset >= nums.length) return;

        int val = nums[offset];
        if (offset == 0 || nums[offset - 1] != nums[offset] || isPicked) {

            numList.add(val);

            subsets(offset + 1, nums, numList, result, true);

            result.add(new ArrayList<>(numList));

            numList.remove(numList.size() - 1);
        }

        subsets(offset + 1, nums, numList, result, false);
    }
}

public class subsets2 {
    public static void main(String[] args) {
        Solution120 s = new Solution120();
        System.out.println(s.subsetsWithDup(new int[]{1, 2, 3}));
    }
}
