import java.util.HashSet;
import java.util.Locale;

class Solution58 {
    public int partitionString(String s) {
        int count = (s.isEmpty() ? 0 : 1);

        HashSet<Character> hashSet = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (hashSet.contains(s.charAt(i))){
                hashSet.clear();
                count++;
            }
            hashSet.add(s.charAt(i));
        }
        return count;
    }
}
public class optimal_partition_of_string {
    public static void main(String[] args) {
        Solution58 s = new Solution58();
        System.out.println(s.partitionString("abacaba"));
    }
}
