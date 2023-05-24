import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

class Solution74 {
    public String predictPartyVictory(String senate) {
        Queue<Integer> queue1 = new LinkedList<>(), queue2 = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (Objects.equals(senate.split("")[i], "R")) queue1.add(i);
            else queue2.add(i);
        }

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            int r = queue1.poll();
            int d = queue2.poll();

            if (r < d) queue1.add(r + n);
            else queue2.add(d + n);
        }

        return queue1.isEmpty() ? "Dire" : "Radiant";
    }
}

public class dota2_senate {
    public static void main(String[] args) {
        Solution74 s = new Solution74();
        System.out.println(s.predictPartyVictory("RD"));
    }
}
