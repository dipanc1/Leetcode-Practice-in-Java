import java.util.Arrays;

class Solution264 {
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        while (i < version1.length() || j < version2.length()) {
            int[] result1 = helper(version1, i);
            int[] result2 = helper(version2, j);

            int v1 = result1[0], v2 = result2[0];

            i = result1[1];
            j = result2[1];

            if (v1 > v2) return 1;
            else if (v1 < v2) return -1;
        }
        return 0;
    }

    public int[] helper(String s, int i) {
        int num = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') break;
            else num = num * 10 + (s.charAt(i) - '0');
            i++;
        }
        return new int[]{num, i + 1};
    }
}

public class compare_version_numbers {
    public static void main(String[] args) {
        Solution264 s = new Solution264();
        System.out.println(s.compareVersion("1.01", "1.001"));
    }
}
