import java.util.Arrays;

class Solution39 {
    public int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[n * 2];

        for (int i = 0; i < n; i++) {
            newArray[2 * i] = nums[i];
            newArray[2 * i + 1] = nums[i + n];
        }

        return newArray;
    }
}

public class shuffle_the_array {
    public static void main(String[] args) {
        Solution39 s = new Solution39();
        System.out.println(Arrays.toString(s.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }
}
