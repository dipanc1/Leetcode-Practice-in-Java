class Solution224 {
    public int reversePairs(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - i; j++) {
                if ((long) nums[i] > (long) nums[j] * 2) ans++;
            }
        }

        return ans;
    }
}

public class reverse_pairs {
    public static void main(String[] args) {
        Solution224 s = new Solution224();
        System.out.println(s.reversePairs(new int[]{1, 3, 2, 3, 1}));
    }
}
