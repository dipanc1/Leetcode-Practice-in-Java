import java.util.HashSet;
import java.util.List;

class Solution164 {
    private int rows;
    private int columns;

    public void solve(char[][] board) {
        rows = board.length;
        columns = board[0].length;
        // capture un-surrounded regions (O -> T)
        for (int i = 0; i < columns; i++) {
            if (board[0][i] == 'O') {
                capture(0, i, board);
            }//first row
            if (board[rows - 1][i] == 'O') {
                capture(rows - 1, i, board);
            }//last row
        }
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                capture(i, 0, board);
            }//first col
            if (board[i][columns - 1] == 'O') {
                capture(i, columns - 1, board);
            }//last col
        }
        // capture the surrounded regions (O -> X)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
            }
        }
        // un-capture un-surrounded regions (T -> O)

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] == 'T') board[i][j] = 'O';
            }
        }
    }

    public void capture(int i, int j, char[][] b) {
        if (i < 0 || j < 0 || i >= rows || j >= columns || b[i][j] != 'O') return;

        b[i][j] = 'T';
        capture(i + 1, j, b);
        capture(i - 1, j, b);
        capture(i, j + 1, b);
        capture(i, j - 1, b);
    }


}

public class surrounded_regions {
    public static void main(String[] args) {
        Solution164 s = new Solution164();
        s.solve(new char[][]{new char[]{'X', 'X', 'X', 'X'}, new char[]{'X', 'O', 'O', 'X'}, new char[]{'X', 'X', 'O', 'X'}, new char[]{'X', 'O', 'X', 'X'}});
    }
}
