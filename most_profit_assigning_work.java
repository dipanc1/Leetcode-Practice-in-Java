import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution292 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int res = 0, j = 0, best = 0;
        List<Pair<Integer, Integer>> temp = new ArrayList<>();

        for (int i = 0; i < worker.length; ++i) {
            temp.add(new Pair<>(difficulty[i], profit[i]));
        }

        temp.sort((a, b) -> a.getKey() - b.getKey());
        Arrays.sort(worker);

        for (int work : worker) {
            while (j < temp.size() && work >= temp.get(j).getKey()) {
                best = Math.max(best, temp.get(j++).getValue());
            }

            res += best;
        }

        return res;
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class most_profit_assigning_work {
    public static void main(String[] args) {
        Solution292 s = new Solution292();
        System.out.println(s.maxProfitAssignment(new int[]{2, 4, 6, 8, 10}, new int[]{10, 20, 30, 40, 50}, new int[]{4, 5, 6, 7}));
    }
}
