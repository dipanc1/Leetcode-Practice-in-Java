import java.util.HashMap;
import java.util.HashSet;

class Solution283 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int res = 0;

//        for (char c : s.toCharArray()) {
//            mp.put(c, mp.getOrDefault(c, 0) + 1);
//            if (mp.get(c) % 2 == 0) res += 2;
//        }
//
//        for (int c : mp.values()) {
//            if (c % 2 != 0) {
//                res++;
//                break;
//            }
//        }

        HashSet<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                seen.remove(c);
                res += 2;
            } else seen.add(c);
        }

        return !seen.isEmpty() ? res + 1 : res;
    }
}

public class longest_palindrome {
    public static void main(String[] args) {
        Solution283 s = new Solution283();
        System.out.println(s.longestPalindrome("abccccdd"));
    }
}
