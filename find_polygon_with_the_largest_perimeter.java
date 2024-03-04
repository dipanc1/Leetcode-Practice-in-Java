import java.util.Arrays;

class Solution208 {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        long res = -1;
        long total = 0;

        for (int n : nums) {
            if (total > n) res = total + n;
            total += n;
        }

        return res;
    }
}

public class find_polygon_with_the_largest_perimeter {
    public static void main(String[] args) {
        Solution208 s = new Solution208();
        System.out.println(s.largestPerimeter(new int[]{1, 12, 1, 2, 5, 50, 3}));
    }
}
