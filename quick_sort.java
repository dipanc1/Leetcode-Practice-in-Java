class Solution97 {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to sort an array using quick sort algorithm.
    static void quickSort(int[] arr, int low, int high) {
        // code here
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        // your code here
        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
}

public class quick_sort {
    public static void main(String[] args) {
        System.out.println(Solution97.partition(new int[]{4, 1, 3, 9, 7}, 0, 5));
    }
}
