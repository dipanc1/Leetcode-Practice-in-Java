import java.util.Arrays;

class Solution254 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);

        return median(arr);


    }

    private double median(int[] arr) {
        double a;
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            a = (double) (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2;
        } else {
            a = arr[arr.length / 2];
        }

        return a;
    }
}

public class median_of_two_sorted_arrays {
    public static void main(String[] args) {
        Solution254 s = new Solution254();
        System.out.println(s.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
