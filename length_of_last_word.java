import java.util.Arrays;

class Solution7 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String lastWord = arr[arr.length -1];
        return lastWord.length();
    }
}

public class length_of_last_word {
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        System.out.println(s.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
