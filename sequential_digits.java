import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution196 {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = List.of(
                12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456, 4567, 5678, 6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678, 3456789, 12345678, 23456789, 123456789
        );
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (i < 36 && list.get(i) <= high) {
            if (list.get(i) >= low) arrayList.add(list.get(i));
            i++;
        }
        return arrayList;

//        List<Integer> res = new ArrayList<>();
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        queue.add(6);
//        queue.add(7);
//        queue.add(8);
//        queue.add(9);
//
//        while (!queue.isEmpty()) {
//            int n = queue.peek();
//            if (n > high) continue;
//            if (low <= n && n >= high) {
//                res.add(n);
//            }
//            int ones = n % 10;
//
//            if (ones < 9) {
//                queue.add(n * 10 + (ones + 1));
//            }
//        }
//
//        return res;
    }
}

public class sequential_digits {
    public static void main(String[] args) {
        Solution196 s = new Solution196();
        System.out.println(s.sequentialDigits(100, 300));
    }
}
