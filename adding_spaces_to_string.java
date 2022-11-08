import java.util.ArrayList;

class Solution16 {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1, j = spaces.length - 1; i >= 0; --i) {
            ans.append(s.charAt(i));
            if (j >= 0 && spaces[j] == i) {
                --j;
                ans.append(' ');
            }
        }
        return ans.reverse().toString();
    }
}

public class adding_spaces_to_string {
    public static void main(String[] args) {
        Solution16 s = new Solution16();
        System.out.println(s.addSpaces("LeetcodeHelpsMeLearn", new int[] {8,13,15}));
    }
}
