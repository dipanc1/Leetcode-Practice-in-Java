import java.util.Arrays;

class Solution180 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int max = 0, gc = g.length - 1, sc = s.length - 1;

        while (sc >= 0 && gc >= 0) {
            if (s[sc] >= g[gc]) {
                max++;
                sc--;
            }
            gc--;
        }

        return max;
    }
}

public class assign_cookies {
    public static void main(String[] args) {
        Solution180 s = new Solution180();
        System.out.println(s.findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
    }
}
