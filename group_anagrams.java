import java.util.*;

class Solution110 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] valArr = s.toCharArray();
            Arrays.sort(valArr);
            String key = new String(valArr);

            ArrayList<String> ll = map.getOrDefault(key, new ArrayList<String>());

            ll.add(s);
            map.put(key, ll);
        }

        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
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
