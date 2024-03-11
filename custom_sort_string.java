import java.util.HashMap;

class Solution220 {
    public String customSortString(String order, String s) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = s.toCharArray();
        char[] orders = order.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char ch : chars) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : orders) {
            if (hashMap.containsKey(ch)) {
                stringBuilder.append(String.valueOf(ch).repeat(Math.max(0, hashMap.get(ch))));
                hashMap.remove(ch);
            }
        }

        for (char ch : hashMap.keySet()) {
            stringBuilder.append(String.valueOf(ch).repeat(Math.max(0, hashMap.get(ch))));
        }

        return stringBuilder.toString();
    }
}

public class custom_sort_string {
    public static void main(String[] args) {
        Solution220 s = new Solution220();
        System.out.println(s.customSortString("cba", "abcd"));
    }
}
