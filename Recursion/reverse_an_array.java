import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class solution {

    public int[] swap(int[] arr) {
//        int l = 0, r = arr.length - 1;
//        List<Integer> newrr = new ArrayList<>();
//
//        while (l <= r) {
//            newrr[r] = arr[l];
//            newrr[l] = arr[r];
//            l++;
//            r--;
//        }
//


//        for (int k = arr.length - 1; k >= 0; k--) {
//            newrr.add(arr[k]);
//        }
//
//        return newrr.stream().mapToInt(i -> i).toArray();
        int j = arr.length - 1;
        rec(arr, 0, j);
        return arr;

    }

    private void rec(int[] arr, int l, int r) {
        if (l >= arr.length / 2) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;
        r--;
        rec(arr, l, r);
    }


}

public class reverse_an_array {
    public static void main(String[] args) {
        solution s = new solution();
        System.out.println(Arrays.toString(s.swap(new int[]{1, 2, 3, 4, 5})));
    }
}
