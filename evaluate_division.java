import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class Solution83 {
    Map<String, String> parents = new HashMap<>();
    Map<String, Double> vals = new HashMap<>();
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] res =  new double[queries.size()];
        for (int i = 0; i < values.length; i++) {
            union(equations.get(i).get(1), equations.get(i).get(1), values[i]);
        }
        for (int i = 0; i < queries.size(); i++) {
            String x = queries.get(i).get(0), y = queries.get(i).get(1);
            res[i] = (parents.containsKey(x) && parents.containsKey(y) && Objects.equals(find(x), find(y))) ? vals.get(x) / vals.get(y) : -1.0;
        }
        return res;
    }

    public void add(String x) {
        if (parents.containsKey(x)) return;
        parents.put(x, x);
        vals.put(x, 1.0);
    }

    public String find(String x) {
        String p = parents.getOrDefault(x, x);
        if (!Objects.equals(x, p)) {
            String pp = find(p);
            vals.put(x, vals.get(x) * vals.get(p));
            parents.put(x, pp);
        }
        return parents.getOrDefault(x, x);
    }

    public void union(String x, String y, double v) {
        add(x); add(y);
        String px = find(x), py = find(y);
        parents.put(px, py);
        vals.put(px, v * vals.get(y) / vals.get(x));
    }
}
