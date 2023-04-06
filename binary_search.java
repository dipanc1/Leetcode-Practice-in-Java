class Solution57 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}

public class binary_search {
    public static void main(String[] args) {
        Solution57 s = new Solution57();
        System.out.println(s.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}
