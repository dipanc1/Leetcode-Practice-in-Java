import java.util.Arrays;

class Solution288 {
    public int heightChecker(int[] heights) {
        int res = 0;
        int n = heights.length;
        int[] sortedArr = sorted(heights.clone());

        System.out.println(Arrays.toString(sortedArr));
        for (int i = 0; i < n; i++) {
            if (sortedArr[i] != heights[i]) res++;
        }

        return res;
    }

    private int[] sorted(int[] a) {
        int[] s = new int[a.length];
        Arrays.sort(a);
        System.arraycopy(a, 0, s, 0, a.length);

        return s;

    }
}

public class height_checker {
    public static void main(String[] args) {
        Solution288 s = new Solution288();
        System.out.println(s.heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
    }
}
