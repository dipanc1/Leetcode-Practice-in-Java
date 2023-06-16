import java.util.Arrays;

class Solution98 {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int sec = 0;

        for (int i = 0; i < n; i++) {
            if (i == n-2) sec = arr[i];
        }
        return sec;
    }
}
public class second_largest {
    public static void main(String[] args) {
        Solution98 s = new Solution98();
        System.out.println(s.print2largest(new int[] {12, 35, 1, 10, 34, 1},6));
    }
}
