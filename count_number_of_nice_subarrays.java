class Solution102 {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0;
        int oddCount = 0;
        int i = 0;
        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 1) {
                oddCount++;
                count = 0;
            }
            while (oddCount == k) {
                if (nums[i++] % 2 == 1) oddCount--;
                count++;
            }
            res += count;
        }
        return res;
    }
}

public class count_number_of_nice_subarrays {
    public static void main(String[] args) {
        Solution102 solution102 = new Solution102();
        System.out.println(solution102.numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3));
    }
}
