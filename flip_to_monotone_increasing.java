class Solution29 {
    public int minFlipsMonoIncr(String s) {
        int ans = 0, noOfFlips = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') ans = Math.min(noOfFlips, ans+1);
            else noOfFlips++;
        }
        return ans;
    }
}
public class flip_to_monotone_increasing {
    public static void main(String[] args) {
        Solution29 s = new Solution29();
        System.out.println(s.minFlipsMonoIncr("00110"));
    }
}
