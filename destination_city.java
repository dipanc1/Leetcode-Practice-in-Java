import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution171 {
    public String destCity(List<List<String>> paths) {
        Set<String> hashSet = new HashSet<>();

        for (List<String> path : paths) {
            hashSet.add(path.get(0));
        }


        for (List<String> path : paths) {
            if (!hashSet.contains(path.get(1))) return path.get(1);
        }
        return "";
    }
}

public class destination_city {
    public static void main(String[] args) {
        Solution171 s = new Solution171();
        System.out.println();
    }
}
