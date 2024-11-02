import java.util.HashMap;
import java.util.Map;

class Solution306 {
    public String kthDistinct(String[] arr, int k) {
        // Step 1: Count the occurrences of each string
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : arr) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        // Step 2: Identify distinct strings
        int distinctCount = 0;
        for (String s : arr) {
            if (countMap.get(s) == 1) {
                distinctCount++;
                if (distinctCount == k) {
                    return s;
                }
            }
        }

        // If there are fewer than k distinct strings, return an empty string
        return "";
    }
}

public class kth_distinct_string_in_an_array {
    public static void main(String[] args) {
        Solution306 s = new Solution306();
        System.out.println(s.kthDistinct(new String[]{"d", "b", "c", "b", "c", "a"}, 2));
    }
}
