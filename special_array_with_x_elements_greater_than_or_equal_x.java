import java.util.Arrays;

class Solution280 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            int count = countGreaterOrEqual(mid, nums);

            if (count == mid) return mid;
            else if (mid > count) right = mid - 1;
            else left = mid + 1;
        }

        return -1;
    }

    private int countGreaterOrEqual(int num, int[] nums) {
        int count = 0;

        for (int n : nums) {
            if (num <= n) count++;
        }

        return count;
    }
}

public class special_array_with_x_elements_greater_than_or_equal_x {
    public static void main(String[] args) {
        Solution280 s = new Solution280();
        System.out.println(s.specialArray(new int[]{0, 0, 3, 4, 5}));
    }
}
