import java.util.ArrayList;

class Solution15 {
    public int findMin(int[] nums) {
        int smallest = Integer.MAX_VALUE;

        for (int num:nums) {
            if (num < smallest){
                smallest = num;
            }
        }

        return smallest;

    }
}

public class find_minimum_rotated_sorted_array {
    public static void main(String[] args) {
        Solution15 s = new Solution15();
        System.out.println(s.findMin(new int[] {3,4,5,1,2}));
    }
}
