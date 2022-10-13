
class Solution2 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x == 0) return true;
        String s = String.valueOf(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

public class isPalindrome {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.isPalindrome(121));
    }
}
