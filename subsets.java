import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution128 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        subset(list, new ArrayList<>(), nums, 0);
        return list;
    }

    public void subset(List<List<Integer>> list, List<Integer> templList, int[] nums, int start) {
        list.add(new ArrayList<>(templList));
        for (int i = start; i < nums.length; i++) {
            templList.add(nums[i]);
            subset(list, templList, nums, i + 1);
            templList.remove(templList.size() - 1);
        }
    }
}


public class subsets {
    public static void main(String[] args) {
        Solution128 s = new Solution128();
        System.out.println(s.subsets(new int[]{1, 2, 3}));
    }
}
