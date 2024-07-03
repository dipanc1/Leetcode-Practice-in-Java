import java.util.Arrays;

class Solution3{
    public String longestCommonPrefix(String[] strs) {
        StringBuilder r = new StringBuilder();
        int n = strs.length;

        Arrays.sort(strs);
        String shortest = strs[0];
        String longest = strs[n-1];

        for (int i = 0; i < shortest.length(); i++) {
            if (shortest.charAt(i) != longest.charAt(i)) break;
            r.append(shortest.charAt(i));
        }
        return r.toString();
    }
}

public class longest_common_prefix {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}
