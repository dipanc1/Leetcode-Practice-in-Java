import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

class Solution142 {

    public int countPaths(List<List<String>> grid) {
        return countPaths(0, 0, grid, new HashMap<>());
    }

    public int countPaths(int r, int c, List<List<String>> grid, HashMap<List<Integer>, Integer> memo) {
        if (r == grid.size() || c == grid.get(0).size()) return 0;

        if (Objects.equals(grid.get(r).get(c), "X")) return 0;

        if (r == grid.size() - 1 && c == grid.get(0).size() - 1) return 1;

        List<Integer> pos = List.of(r, c);
        if (memo.containsKey(pos)) memo.get(pos);

        // recursive solution (brute force)
//        return countPaths(r + 1, c, grid) + countPaths(r, c + 1, grid);

        // memoization solution
        int result = countPaths(r + 1, c, grid, memo) + countPaths(r, c + 1, grid, memo);

        memo.put(pos, result);

        return result;
    }
}


public class count_paths {
    public static void main(String[] args) {
        Solution142 s = new Solution142();
        List<List<String>> listOfLists = new ArrayList<>();
        ArrayList<String> singleList1 = new ArrayList<String>();
        ArrayList<String> singleList2 = new ArrayList<String>();
        ArrayList<String> singleList3 = new ArrayList<String>();
        ArrayList<String> singleList4 = new ArrayList<String>();
        ArrayList<String> singleList5 = new ArrayList<String>();
        ArrayList<String> singleList6 = new ArrayList<String>();
        singleList1.add("O");
        singleList1.add("O");
        listOfLists.add(singleList1);
        singleList2.add("O");
        singleList2.add("O");
        listOfLists.add(singleList2);
        singleList3.add("O");
        singleList3.add("O");
        listOfLists.add(singleList3);
        singleList4.add("O");
        singleList4.add("O");
        listOfLists.add(singleList4);
        singleList5.add("O");
        singleList5.add("O");
        listOfLists.add(singleList5);
        singleList6.add("X");
        singleList6.add("O");
        listOfLists.add(singleList6);
        System.out.println(listOfLists);
        System.out.println(s.countPaths(listOfLists));
    }
}
