import java.util.HashMap;
import java.util.Map;

class Solution177 {
    Map<String, Integer> memo = new HashMap<>();

    public int getLengthOfOptimalCompression(String s, int k) {
        char c = Character.MIN_VALUE;
        return count(0, k, c, 0, s,  memo);
    }

    public int count(int i, int k, char previous_letter, int previous_count, String s, Map<String, Integer> memo) {
        int res;
        if (k < 0) return Integer.MAX_VALUE;
        if (i == s.length()) return 0;

        String key = previous_letter + ", " + previous_count + ", " + k + ", " + i;
        if (memo.containsKey(key)) return memo.get(key);

        if (s.charAt(i) == previous_letter) {
            int incr = 0;
            if (previous_count == 1 || previous_count == 9 || previous_count == 99) incr = 1;

            res = incr + count(i + 1, k, previous_letter, previous_count + 1, s, memo);

        } else {
            res = Math.min(count(i + 1, k - 1, previous_letter, previous_count, s, memo), 1 + count(i + 1, k, s.charAt(i), 1, s, memo));
        }
        memo.put(key, res);
        return res;
    }
}

public class string_compression_II {
    public static void main(String[] args) {
        Solution177 s = new Solution177();
        System.out.println(s.getLengthOfOptimalCompression("denammdfegkjechilepbckbhkahhhhpkoigjdnboblaoejdjhhgcngpicimbpnhjmafbajmjhffhkeolefpimjhahcnnndjnmknd", 42));
    }
}
