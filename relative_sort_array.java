import java.util.Arrays;

class Solution289 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // get the length
        int length = 0;
        // iterate arr1 and get the max
        for (int a : arr1) {
            length = Math.max(length, a);
        }

        // initialize count array
        int[] count = new int[length + 1];
        // count arr1
        for (int a : arr1) {
            count[a]++;
        }


        // declare ans array and index
        int[] ans = new int[arr1.length];
        int idx = 0;

        // loop through arr2 and insert in ans
        for (int a : arr2) {
            while (count[a] > 0) {
                ans[idx] = a;
                idx++;
                count[a]--;
            }
        }

        System.out.println(Arrays.toString(count));

        // loop through count and add the remaining in ans
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ans[idx] = i;
                idx++;
                count[i]--;
            }
        }

        return ans;

    }
}

public class relative_sort_array {
    public static void main(String[] args) {
        Solution289 s = new Solution289();
        System.out.println(Arrays.toString(s.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
    }
}
