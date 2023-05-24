import java.util.*;

class Solution73 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet set1 = new HashSet<Integer>();
        HashSet set2 = new HashSet<Integer>();
        HashSet ans = new HashSet<Integer>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num :nums2) {
            if (set1.contains(num)) {
                set1.remove(num);
                ans.add(num);
            } else if (!ans.contains(num)) {
                set2.add((num));
            }
        }

        return new ArrayList<>() {{
            add(new ArrayList<>(set1));
            add(new ArrayList<>(set2));
        }};
    }

}

public class find_the_difference_of_two_arrays {
    public static void main(String[] args) {
        Solution73 s = new Solution73();
        System.out.println(s.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
    }
}
