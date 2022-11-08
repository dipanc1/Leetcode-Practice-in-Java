import java.util.HashSet;
import java.util.Set;

class Solution12 {

    Set<String> visited = new HashSet<String>();
    int count = 0;
    public void traverse (int row, int column, int[][] stones) {
        String key = row +"-" + column;

        if (visited.contains(key)) return;

        visited.add(key);

        for (int[] stone: stones) {
            if (row == stone[0] || column == stone[1]) traverse(stone[0], stone[1], stones);
        }

    }

    public int removeStones(int[][] stones) {

        for (int[] stone: stones) {
            String key = stone[0] +"-"+ stone[1];

            if(visited.contains(key)) continue;

            traverse(stone[0], stone[1], stones);

            count++;

        }

        return stones.length - count;
    }
}

public class most_stones_removed {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        System.out.println(s.removeStones(new int[][] {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}}));
    }
}

