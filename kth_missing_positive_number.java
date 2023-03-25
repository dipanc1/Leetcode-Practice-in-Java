import java.lang.reflect.Array;
import java.util.ArrayList;

class Solution52 {
    public int findKthPositive(int[] arr, int k) {
        // binary search
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if(arr[mid]-(mid+1) >= k){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low + k;

    }
}

public class kth_missing_positive_number {
    public static void main(String[] args) {
        Solution52 s = new Solution52();
        System.out.println(s.findKthPositive(new int[]{1, 2, 3, 4}, 2));
    }
}
