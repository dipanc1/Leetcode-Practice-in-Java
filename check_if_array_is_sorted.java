class Solution115 {
    public boolean check(int[] nums) {
        // iterate through the array
        int countIfNot = 0;
        for (int i = 0; i < nums.length; i++) {
            // check if it is in ascending order
            if (nums[i] > nums[(i + 1) % nums.length]) {
                countIfNot++;
            }
        }

        // if it breaks the condition more than once return false
        return (countIfNot <= 1);

    }
}

public class check_if_array_is_sorted {
    public static void main(String[] args) {
        Solution115 s = new Solution115();
        System.out.println(s.check(new int[]{2, 1, 3, 4}));
    }
}
