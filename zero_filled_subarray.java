class Solution55 {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = 0;
            while (i < nums.length && nums[i] == 0){
                curr++;
                res += curr;
                i++;
            }
        }
        return res;
    }
}

public class zero_filled_subarray {
    public static void main(String[] args) {
        Solution55 s = new Solution55();
        System.out.println(s.zeroFilledSubarray(new int[]{0, 0, 0, 2, 0, 0}));
    }
}
