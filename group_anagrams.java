import java.util.*;

class Solution110 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>(); // mapping character count to list of anagrams

        for (String s : strs) {
            char[] ss = s.toCharArray();

            Arrays.sort(ss);
            String key = new String(ss);

            if (!map.containsKey(key)) map.put(key, new ArrayList<>());

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());

    }
}

public class group_anagrams {
    public static void main(String[] args) {
        Solution110 solution110 = new Solution110();
        System.out.println(solution110.groupAnagrams(new String[]{
                "eat", "tea", "tan", "ate", "nat", "bat"
        }));
    }
}
