class Solution99 {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        int i = 1;
        while (i < n) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}

public class check_if_array_is_sorted_and_rotated {
    public static void main(String[] args) {
        Solution99 s = new Solution99();
        System.out.println(s.arraySortedOrNot(new int[]{3, 4, 5, 1, 2}, 5));
    }
}
