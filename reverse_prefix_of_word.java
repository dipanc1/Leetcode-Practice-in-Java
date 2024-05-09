class Solution263 {
    public String reversePrefix(String word, char ch) {
        char[] wordCharArray = word.toCharArray();

        StringBuilder s = new StringBuilder();

        if (word.indexOf(ch) == -1) return word;

        for (char w : wordCharArray) {
            if (w != ch) s.append(w);
            else {
                s.append(ch);
                break;
            }
        }

        s.reverse();

        String left = word.substring(word.indexOf(ch) + 1);

        s.append(left);

        return s.toString();
    }
}

public class reverse_prefix_of_word {
    public static void main(String[] args) {
        Solution263 s = new Solution263();
        System.out.println(s.reversePrefix("abcdefd", 'z'));
    }
}
