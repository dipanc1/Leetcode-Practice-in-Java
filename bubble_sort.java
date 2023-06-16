class Solution96 {
    //Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n) {
        //code here

        if (n == 1) return;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }

        if (count == 0) return;

        bubbleSort(arr, n - 1);
    }
}

public class bubble_sort {
    public static void main(String[] args) {
        Solution96.bubbleSort(new int[]{4, 1, 3, 9, 7}, 5);
    }
}
