// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.HashSet;

class Solution172 {
    public int solution(int[] A) {
        // Implement your solution here
        int n = A.length;
        HashSet<Integer> set = new HashSet<>();

        // Add all positive integers to the set
        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }

        // Find the smallest positive integer not in the set
        for (int i = 1; i < n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 1;
    }
}

public class codility_demo {
    public static void main(String[] args) {
        Solution172 s = new Solution172();
        System.out.println(s.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
}
