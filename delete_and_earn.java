class Solution13 {
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            sum[nums[i]] += nums[i];
            max = Math.max(max, nums[i]);
        }

        for (int i = 2; i <= max ; i++) {
            sum[i] = Math.max(sum[i-1],sum[i-2] + sum[i]);
        }

        return sum[max];
    }
}

public class delete_and_earn {
    public static void main(String[] args) {
        Solution13 s = new Solution13();
        System.out.println(s.deleteAndEarn(new int[] {3,4,2}));
    }
}
