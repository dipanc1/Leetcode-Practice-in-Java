import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution189 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int j : arr) {
            hashMap.put(j, hashMap.getOrDefault(j, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(hashMap.values());

        return hashMap.size() == set.size();
    }
}

public class unique_number_of_occurrences {
    public static void main(String[] args) {
        Solution189 s = new Solution189();
        System.out.println(s.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }
}
