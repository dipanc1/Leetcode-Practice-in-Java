class Solution206 {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) return word;
        }
        return "";
    }

    private boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        for (int k = 0; k < s.length() / 2; k++) {
            char start = s.charAt(k);
            char end = s.charAt(s.length() - k - 1);
            if (start != end) return false;
        }
        return true;
    }
}

public class find_first_palindromic_string_in_the_array {
    public static void main(String[] args) {
        Solution206 s = new Solution206();
        System.out.println(s.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
    }
}
