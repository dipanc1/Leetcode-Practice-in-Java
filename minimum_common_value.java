import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution218 {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0, l1 = nums1.length, l2 = nums2.length;

        while (i < l1 && j < l2) {
            if (nums1[i] == nums2[j]) return nums1[i];
            else if (nums1[i] > nums2[j]) j++;
            else i++;
        }

        return -1;
    }

}

public class minimum_common_value {
    public static void main(String[] args) {
        Solution218 s = new Solution218();
        System.out.println(s.getCommon(new int[]{2, 4}, new int[]{1, 2}));
    }
}
