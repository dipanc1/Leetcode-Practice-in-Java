import java.util.*;

class Solution250 {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> hp = new HashMap<>();
        String combined = s1 + " " + s2;
        List<String> ans = new ArrayList<>();

        for (String s : combined.split(" ")) {
            hp.put(s, hp.getOrDefault(s, 0) + 1);
        }
        System.out.println(hp);

        for (Map.Entry<String, Integer> e : hp.entrySet()) {
            if (e.getValue() == 1) {
                ans.add(e.getKey());
            }
        }

        return ans.toArray(new String[] { });

//        int i = 0;
//        String[] a = new String[ans.size()];
//        for (String te : ans) a[i++] = te;
//
//        return a;
    }
}

public class uncommon_words_from_two_sentences {
    public static void main(String[] args) {
        Solution250 s = new Solution250();
        System.out.println(Arrays.toString(s.uncommonFromSentences("this apple is sweet", "this apple is sour")));
    }
}
