import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;

class Solution255 {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                p.add(ints[j]);
            }
        }
        while (k-- > 1){
            p.poll();
        }
        return p.poll();
    }
}

public class kth_smallest_element_in_a_sorted_matrix {
    public static void main(String[] args) {
        Solution255 s = new Solution255();
        System.out.println(s.kthSmallest(new int[][]{new int[]{1, 5, 9}, new int[]{10, 11, 13}, new int[]{12, 13, 15}}, 8));
    }
}
