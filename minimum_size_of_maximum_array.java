class Solution59 {
    public int minimizeArrayValue(int[] nums) {
        long minmax = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            minmax = Math.max(minmax, (sum + i) / (i + 1));
        }

        return (int) minmax;
    }
}

public class minimum_size_of_maximum_array {
    public static void main(String[] args) {
        Solution59 s = new Solution59();
        System.out.println(s.minimizeArrayValue(new int[]{3, 7, 1, 6}));
    }
}
