import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution128 {
    public List<List<Integer>> subsets(int[] nums) {
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


public class subsets {
    public static void main(String[] args) {
        Solution128 s = new Solution128();
        System.out.println(s.subsets(new int[]{1, 2, 3}));
    }
}
