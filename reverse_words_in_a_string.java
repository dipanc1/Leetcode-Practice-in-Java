import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution19 {

    public ArrayList<String> reverseArrayList(ArrayList<String> alist)
    {
        // Arraylist for storing reversed elements
        // this.revArrayList = alist;
        for (int i = 0; i < alist.size() / 2; i++) {
            String temp = alist.get(i);
            alist.set(i, alist.get(alist.size() - i - 1));
            alist.set(alist.size() - i - 1, temp);
        }

        // Return the reversed arraylist
        return alist;
    }
    public String reverseWords(String s) {
        ArrayList<String> stack = new ArrayList<>(Arrays.asList(s.split(" ")));

        StringBuilder listString = new StringBuilder();

        for (String word: reverseArrayList(stack)){
            if(!word.isEmpty()){
                listString.append(word).append(" ");
            }
        }

        return listString.toString().trim();
    }
}

public class reverse_words_in_a_string {
    public static void main(String[] args) {
        Solution19 s = new Solution19();
        System.out.println(s.reverseWords("    hello        world  "));
    }
}
