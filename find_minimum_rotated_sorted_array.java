import java.util.ArrayList;

class Solution15 {
    public int findMin(int[] nums) {
//        int smallest = Integer.MAX_VALUE;
//
//        for (int num : nums) {
//            if (num < smallest) {
//                smallest = num;
//            }
//        }
//
//        return smallest;

        int l = 0, r = nums.length - 1, smallest = nums[0];

        while (l <= r) {
            // if already sorted
            if (nums[l] < nums[r]) {
                smallest = Math.min(smallest, nums[l]);
                break;
            }

            int mid = l + (r - l) / 2;
            smallest = Math.min(smallest, nums[mid]);

            if (nums[mid] >= nums[l]) l = mid + 1;

            else r = mid - 1;
        }

        return smallest;

    }
}

public class find_minimum_rotated_sorted_array {
    public static void main(String[] args) {
        Solution15 s = new Solution15();
        System.out.println(s.findMin(new int[]{3, 4, 5, 1, 2}));
    }
}
