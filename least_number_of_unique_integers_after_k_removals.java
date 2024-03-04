import java.util.Arrays;
import java.util.HashMap;

class Solution209 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int[] sortedFreq = new int[map.size()];
        int i = 0;

        for (Integer key : map.values()) {
            sortedFreq[i++] = key;
        }

        Arrays.sort(sortedFreq);

        for (i = 0; i < sortedFreq.length; i++) {
            if (k < sortedFreq[i]) break;
            k -= sortedFreq[i];
        }


        return sortedFreq.length - i;
    }
}

public class least_number_of_unique_integers_after_k_removals {
    public static void main(String[] args) {
        Solution209 s = new Solution209();
        System.out.println(s.findLeastNumOfUniqueInts(new int[]{5, 5, 4}, 1));
    }
}
