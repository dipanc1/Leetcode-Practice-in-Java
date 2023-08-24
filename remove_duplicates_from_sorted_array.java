import java.util.Arrays;

class Solution100 {
    public int removeDuplicates(int[] nums) {
        int addIndex = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i - 1]) {
                addIndex++;
            }
            nums[i - addIndex] = nums[i];
        }
        return nums.length - addIndex;
    }
}

public class remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        Solution100 s = new Solution100();
        System.out.println(s.removeDuplicates(new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 5}));
    }
}
