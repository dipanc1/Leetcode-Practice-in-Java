class Solution86 {
    int isPalindrome(String S) {
        // code here
        int i = 0, j = S.length() - 1;
        char[] chars = S.toCharArray();
        while (i < j) {
            if (chars[i++] != chars[j--]) return 0;
        }
        return 1;
    }
};

public class palindromeString {
    public static void main(String[] args) {
        Solution86 s = new Solution86();
        System.out.println(s.isPalindrome("abc"));
    }
}
