class Solution114 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) return mid;

            if (nums[mid] >= nums[left]) {
                if (target < nums[left] || target > nums[mid]) left = mid + 1;
                else right = mid - 1;
            } else {
                if (target < nums[mid] || target > nums[right]) right = mid - 1;
                else left = mid + 1;
            }
        }

        return -1;
    }
}

public class search_in_rotated_sorted_array {
    public static void main(String[] args) {
        Solution114 s = new Solution114();
        System.out.println(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
