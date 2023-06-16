import java.util.Arrays;

class Solution94 {
    static void insert(int arr[], int i) {
        // Your code here
        for (int j = 0; j < i; j++) {
            int key = arr[j];
            int k = j - 1;
            while (k >= 0 && arr[k] > key) {
                arr[k + 1] = arr[k];
                k = k - 1;
            }
            arr[k + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Function to sort the array using insertion sort algorithm.
    public static void insertionSort(int[] arr, int n) {
        //code here
        insert(arr, n);
    }
}

public class insertion_sort {
    public static void main(String[] args) {
        Solution94.insertionSort(new int[]{4, 1, 3, 9, 7}, 5);
    }
}
