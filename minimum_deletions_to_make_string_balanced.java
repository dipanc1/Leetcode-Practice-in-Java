import java.util.Arrays;

class Solution303 {
    public int minimumDeletions(String s) {
        int a_count_right = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') a_count_right++;
        }

        int b_count_left = 0;
        int res = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') a_count_right--;
            res = Math.min(res, b_count_left + a_count_right);
            if (s.charAt(i) == 'b') b_count_left++;
        }

        return res;
    }
}

public class minimum_deletions_to_make_string_balanced {
    public static void main(String[] args) {
        Solution303 s = new Solution303();
        System.out.println(s.minimumDeletions("aababbab"));
    }
}
