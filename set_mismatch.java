import java.util.Arrays;

class Solution191 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] v = new int[n + 1];
        int missing = 0, duplicate = 0;

        for (int num : nums) {
            v[num]++;
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] == 2) duplicate = i;
            if (v[i] == 0) missing = i;
        }

        return new int[]{duplicate, missing};
    }
}

public class set_mismatch {
    public static void main(String[] args) {
        Solution191 s = new Solution191();
        System.out.println(Arrays.toString(s.findErrorNums(new int[]{1, 2, 2, 4})));
    }
}
