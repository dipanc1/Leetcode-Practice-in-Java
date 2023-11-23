import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution157 {
    public int solution(int[] A) {
        // Implement your solution here
        HashSet<Integer> set = new HashSet<>();

        for (int a : A) {
            if (a > 0) set.add(a);
        }

        for (int i = 1; i < A.length; i++) {
            if (!set.contains(i)) return i;
        }
        return 0;
//        Arrays.sort(A);
//
//        int smallest = 1;
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == smallest) {
//                System.out.println(smallest);
//                smallest++;
//            }
//        }
//
//        return smallest;
    }
}

public class smallest_positive_integer_in_A {
    public static void main(String[] args) {
        Solution157 s = new Solution157();
        System.out.println(s.solution(new int[]{8, 3, 6, 4, 10, 2}));
    }
}
