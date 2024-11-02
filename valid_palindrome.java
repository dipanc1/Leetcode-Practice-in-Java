class Solution153 {
    public boolean isPalindrome(String s) {
//        if (s.isEmpty()) return true;
//
//        int left = 0, right = s.length() - 1;
//
//        while (left <= right){
//            char currFirst = s.charAt(left);
//            char currLast = s.charAt(right);
//
//            if (!Character.isLetterOrDigit(currFirst)) left++;
//            else if (!Character.isLetterOrDigit(currLast)) right--;
//            else {
//                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) return false;
//
//                left++;
//                right--;
//            }
//        }
//        return true;

//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (char ch :s.toCharArray()) {
//            if (Character.isLetterOrDigit(ch)) stringBuilder.append(Character.toLowerCase(ch));
//        }
//
//        return stringBuilder.toString().equals(stringBuilder.reverse().toString());

        if (s.isEmpty()) return true;

        StringBuilder sw = new StringBuilder();


        System.out.println(sw.toString());

        return rec(sw.toString(), 0);
    }

    public boolean rec(String s, int i) {
        int n = s.length();

        if (i >= n / 2) return true;

        char currFirst = s.charAt(i);
        char currLast = s.charAt(n - i - 1);

        if (currFirst != currLast) return false;

        return rec(s, i + 1);
    }
}

public class valid_palindrome {
    public static void main(String[] args) {
        Solution153 s = new Solution153();
        System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
