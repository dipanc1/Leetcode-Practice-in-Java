import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution200 {
    public String frequencySort(String s) {
        // bucket sort
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        List<Character> characters = new ArrayList<>(hashMap.keySet());
        characters.sort((a, b) -> hashMap.get(b) - hashMap.get(a));

        StringBuilder str = new StringBuilder();
        for (Character c : characters) {
            for (int j = 0; j < hashMap.get(c); j++) {
                str.append(c);
            }
        }


        return str.toString();

    }
}

public class sort_characters_by_frequency {
    public static void main(String[] args) {
        Solution200 s = new Solution200();
        System.out.println(s.frequencySort("tree"));
    }
}
