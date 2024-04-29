import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution245 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();

        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            minDiff = Math.min(minDiff, (b - a));
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            if ((b - a) == minDiff) {
                List<Integer> insert = new ArrayList<>();
                insert.add(a);
                insert.add(b);
                res.add(insert);
            }
        }


        return res;

    }
}

public class minimum_absolute_difference {
    public static void main(String[] args) {
        Solution245 s = new Solution245();
        System.out.println(s.minimumAbsDifference(new int[]{3, 8, -10, 23, 19, -4, -14, 27}));
    }
}
