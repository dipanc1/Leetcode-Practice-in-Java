class Solution236 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        if (word.length() > m * n) return false;

        if (!canFormWord(board, word)) return false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0, visited)) return true;
            }
        }

        return false;
    }

    private boolean canFormWord(char[][] board, String word) {
        int[] boardFreq = new int[256];
        for (char[] row : board) {
            for (char c : row) {
                boardFreq[c]++;
            }
        }

        int[] wordFreq = new int[256];
        for (char c : word.toCharArray()) {
            wordFreq[c]++;
            if (wordFreq[c] > boardFreq[c]) return false;
        }

        return true;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int start, boolean[][] visited) {
        int m = board.length;
        int n = board[0].length;

        if (start == word.length()) return true;

        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(start) || visited[i][j]) return false;

        visited[i][j] = true;

        boolean found = dfs(board, word, i - 1, j, start + 1, visited) || dfs(board, word, i + 1, j, start + 1, visited) || dfs(board, word, i, j - 1, start + 1, visited) || dfs(board, word, i, j + 1, start + 1, visited);

        visited[i][j] = false;

        return found;
    }
}

public class word_search {
    public static void main(String[] args) {
        Solution236 s = new Solution236();
        System.out.println(s.exist(new char[][]{new char[]{'A', 'B', 'C', 'E'}, new char[]{'S', 'F', 'C', 'S'}, new char[]{'A', 'D', 'E', 'E'}}, "ABCCED"));
    }
}
