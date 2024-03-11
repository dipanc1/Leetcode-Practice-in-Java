import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution229 {
    public int firstMissingPositive(int[] nums) {
        int[] ans = new int[nums.length + 1];

        for (int n : nums) {
            if (n > 0 && n <= nums.length) ans[n] = 1;
        }


        for (int i = 1; i < ans.length; i++) {
            if (ans[i] == 0) return i;
        }

        return ans.length;

    }
}

public class first_missing_positive {
    public static void main(String[] args) {
        Solution229 s = new Solution229();
        System.out.println(s.firstMissingPositive(new int[]{1, 2, 0}));
    }
}
