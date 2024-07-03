import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution296 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int[] a = new int[1001];

        for (int n : nums1) a[n]++;

        for (int n : nums2){
            if (a[n] > 0) {
                ans.add(n);
                a[n]--;
            }
        }

        int[] result = new int[ans.size()];

        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }
}

public class intersection_of_two_arrays_ii {
    public static void main(String[] args) {
        Solution296 s = new Solution296();
        System.out.println(Arrays.toString(s.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
