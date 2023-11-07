import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution140 {

    public boolean sumPossible(int amount, List<Integer> numbers) {

        return sumPossible(amount, numbers, new HashMap<>());
    }

    public boolean sumPossible(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
        // base case(s)
        if (amount == 0) return true;
        if (amount < 0) return false;

        if (memo.containsKey(amount)) memo.get(amount);

        // recursive (brute force)
//        for (int num : numbers) {
//            int sumAmount = amount - num;
//            return sumPossible(sumAmount, numbers);
//        }

        // memoization - DP
        for (int num : numbers) {
            int sumAmount = amount - num;

            memo.put(amount, true);

            return sumPossible(sumAmount, numbers, memo);
        }
        memo.put(amount, false);
        return false;
    }
}

public class sum_possible {
    public static void main(String[] args) {
        Solution140 s = new Solution140();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(10);
//        System.out.println(arrayList);
        System.out.println(s.sumPossible(15, arrayList));
    }
}
