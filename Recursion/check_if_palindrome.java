class solution2 {
    public boolean palindrome(String s) {
        return check(s, 0);
    }

    private boolean check(String s, int i) {
        if (i >= s.length() / 2) return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return check(s, i + 1);
    }
}

public class check_if_palindrome {
    public static void main(String[] args) {
        solution2 s = new solution2();
        System.out.println(s.palindrome("MADAM"));
    }
}
