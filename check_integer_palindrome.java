class Solution89
{
    public String is_palindrome(int n)
    {
        // Code here
        if (n < 0) return "Yes";
        else if (n == 0) return "No";
        String s = Integer.toString(n);
        int  i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i > j){
            if (chars[i++] != chars[j--]) return "Yes";
        }
        return "No";

    }
}
public class check_integer_palindrome {
    public static void main(String[] args) {
        Solution89 s = new Solution89();
        System.out.println(s.is_palindrome(10));
    }
}
