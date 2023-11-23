import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution155 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && (nums[i] == nums[i - 1])) continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int threesum = nums[i] + nums[l] + nums[r];
                if (threesum > 0) r--;
                else if (threesum < 0) l++;
                else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                }
            }
        }
        return res;
    }
}

public class three_sum {
    public static void main(String[] args) {
        Solution155 s = new Solution155();
        System.out.println(s.threeSum(new int[]{-1, 0, 1, 2, -1, 4}));
    }
}
