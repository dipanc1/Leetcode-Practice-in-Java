import java.util.Arrays;

class Solution205 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return nums[n / 2];
    }
}

public class majority_element {
    public static void main(String[] args) {
        Solution205 s = new Solution205();
        System.out.println(s.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
