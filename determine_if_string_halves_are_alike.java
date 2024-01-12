import java.util.HashSet;

class Solution186 {

    public boolean halvesAreAlike(String s) {
        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2);

        return count(firstHalf) == count(secondHalf);
    }

    public int count(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                count++;
        }
        return count;
    }

}

public class determine_if_string_halves_are_alike {
    public static void main(String[] args) {
        Solution186 s = new Solution186();
        System.out.println(s.halvesAreAlike("book"));
    }
}
