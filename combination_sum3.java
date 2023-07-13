import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution118 {
    public List<List<Integer>> combinationSum3(int k, int target) {
        List<List<Integer>> list = new ArrayList<>();

        search(list, new ArrayList<>(), k, target, 1);

        return list;
    }

    private void search(List<List<Integer>> list, List<Integer> tempList, int nums, int remain, int start) {
        if (remain == 0 && tempList.size() == nums) list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i <= 9; i++) {
                tempList.add(i);
                search(list, tempList, nums, remain - i, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

public class combination_sum3 {
    public static void main(String[] args) {
        Solution118 s = new Solution118();
        System.out.println(s.combinationSum3(3, 7));
    }
}
