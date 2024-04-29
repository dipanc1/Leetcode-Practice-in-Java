import java.util.HashMap;

class Solution249 {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            mp.put(indices[i], i);
        }

        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (mp.containsKey(i)) {
                int indie = mp.get(i);
                if (s.substring(indices[indie], sources[indie].length() + indices[indie]).equals(sources[indie])) {
                    sb.append(targets[indie]);
                    i += sources[indie].length() - 1;
                    continue;
                }
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}

public class find_and_replace_in_string {
    public static void main(String[] args) {
        Solution249 s = new Solution249();
        System.out.println(s.findReplaceString("abcde", new int[]{2, 2}, new String[]{"cde", "cdef"}, new String[]{"fe", "f"}));
    }
}
