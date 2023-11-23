import java.util.Arrays;

class Solution154 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int[] ans = new int[2];

        while (left < right) {
            int currSum = numbers[left] + numbers[right];

            if (currSum > target) right--;

            else if (currSum < target) left++;

            else {
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            }
        }

        return ans;
    }

}

public class twosumII_input_array_is_sorted {
    public static void main(String[] args) {
        Solution154 s = new Solution154();
        System.out.println(Arrays.toString(s.twoSum(new int[]{0, 0, 3, 4}, 0)));
    }
}
