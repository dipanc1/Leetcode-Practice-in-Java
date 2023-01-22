
class Solution26 {
    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) return true;
        if (word.toUpperCase().equals(word)) return true;
        return word.substring(1).toLowerCase().equals(word.substring(1));
    }
}
public class detect_capital {
    public static void main(String[] args) {
        Solution26 s = new Solution26();
        System.out.println(s.detectCapitalUse("mL"));
    }
}