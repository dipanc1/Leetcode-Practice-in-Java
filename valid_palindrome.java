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

        StringBuilder stringBuilder = new StringBuilder();

        for (char ch :s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) stringBuilder.append(Character.toLowerCase(ch));
        }

        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }
}

public class valid_palindrome {
    public static void main(String[] args) {
        Solution153 s = new Solution153();
        System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
