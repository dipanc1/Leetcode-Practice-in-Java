import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution160 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> templList, int[] nums) {
        if (templList.size() == nums.length) list.add(new ArrayList<>(templList));

        for (int num : nums) {
            if (templList.contains(num)) continue;
            templList.add(num);
            backtrack(list, templList, nums);
            templList.remove(templList.size() - 1);
        }

    }
}

public class permutations {
    public static void main(String[] args) {
        Solution160 s = new Solution160();
        System.out.println(s.permute(new int[]{1, 2, 3}));
    }
}
