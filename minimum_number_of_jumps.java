import java.util.Arrays;

class Solution92 {
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int[] arr, int N, int P)
    {
        // code here
        int[] hash = new int[P];

        for (int i = 0; i < N; i++) {
            hash[arr[i] - 1]++;
        }
        System.out.println(Arrays.toString(hash));

        for (int i = 0; i < N; i++) {
            if (i < hash.length){
                arr[i] = hash[i];
            } else {
                arr[i] = 0;
            }
        }
    }
}

public class minimum_number_of_jumps {
    public static void main(String[] args) {
        Solution92.frequencyCount(new int[]{2, 3, 2, 3, 5}, 5, 5);
    }
}
