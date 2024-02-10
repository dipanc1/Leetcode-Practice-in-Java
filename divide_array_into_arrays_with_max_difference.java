import java.util.Arrays;

class Solution195 {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int index = 0;
        int n = nums.length;
        int[][] result = new int[nums.length / 3][3];

        for (int i = 0; i < n; i += 3) {
            int first = nums[i];
            int second = nums[i + 1];
            int third = nums[i + 2];
            if (third - first <= k) {
                result[index][0] = first;
                result[index][1] = second;
                result[index][2] = third;
                index++;
            } else {
                return new int[0][0];
            }
        }
        return result;
    }
}


public class divide_array_into_arrays_with_max_difference {
    public static void main(String[] args) {
        Solution195 s = new Solution195();
        System.out.println(Arrays.deepToString(s.divideArray(new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 2)));
    }
}
