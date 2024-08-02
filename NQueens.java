import java.util.Arrays;
import java.util.List;

public class NQueens {
    // Method to print the board
    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to check if it's safe to place a queen at board[row][col]
    public static boolean isSafe(String[][] board, int row, int col) {
        // Check this row on left side
        for (int j = 0; j < col; j++) {
            if (board[row][j].equals("Q")) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }

        // Check lower diagonal on left side
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }

        return true;
    }

    // Recursive method to solve the N-Queens problem
    public static boolean solveNQueens(String[][] board, int col) {
        if (col >= board.length) {
            printBoard(board);
            return true;
        }

        boolean res = false;
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = "Q"; // Place queen
                res = solveNQueens(board, col + 1) || res;
                board[i][col] = "."; // Backtrack
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int N = 4; // Size of the board
        String[][] board = new String[N][N];

        // Initialize the board with dots (.)
        for (String[] row : board) {
            Arrays.fill(row, ".");
        }

        if (!solveNQueens(board, 0)) {
            System.out.println("Solution does not exist");
        }
    }
}

            