import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution269 {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
//        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(arr[a[0]] * arr[b[1]], arr[a[1]] * arr[b[0]]));
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            pq.add(new int[]{i, arr.length - 1});
//        }
//
//        for (int i = 1; i < k; i++) {
//            int[] frac = pq.poll();
//            assert frac != null;
//            int numeratorIndex = frac[0];
//            int denominatorIndex = frac[1];
//
//            if (denominatorIndex - 1 > numeratorIndex) pq.add(new int[]{numeratorIndex, denominatorIndex - 1});
//        }
//
//        int[] result = pq.poll();
//        assert result != null;
//        return new int[]{arr[result[0]], arr[result[1]]};
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingDouble(a -> (double) a[0] / a[1]));

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                minHeap.offer(new int[]{arr[i], arr[j]});
            }
        }
        int[] result = null;

        for (int i = 0; i < k; i++) {
            result = minHeap.poll();
        }

        return result;
    }
}

public class k_th_smallest_prime_fraction {
    public static void main(String[] args) {
        Solution269 s = new Solution269();
        System.out.println(Arrays.toString(s.kthSmallestPrimeFraction(new int[]{1, 2, 3, 5}, 3)));
    }
}
