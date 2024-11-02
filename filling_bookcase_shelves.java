import java.util.HashMap;

class Solution304 {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return helper(books, shelfWidth, 0, map);
    }

    private int helper(int[][] books, int sw, int i, HashMap<Integer, Integer> map) {
        if (i == books.length) return 0;
        if (map.containsKey(i)) return map.get(i);

        int cur_width = sw, max_height = 0;
        map.put(i, Integer.MAX_VALUE);

        for (int j = i; j < books.length; j++) {
            int width = books[j][0];
            int height = books[j][1];
            if (cur_width < width) break;
            cur_width -= width;
            max_height = Math.max(max_height, height);
            map.put(i, Math.min(map.get(i), helper(books, sw, j + 1, map) + max_height));
        }

        return map.get(i);
    }
}

public class filling_bookcase_shelves {
    public static void main(String[] args) {
        Solution304 s = new Solution304();
        System.out.println(s.minHeightShelves(new int[][]{{1, 1}, {2, 3}, {2, 3}, {1, 1}, {1, 1}, {1, 1}, {1, 2}}, 4));
    }
}
