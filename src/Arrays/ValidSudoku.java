package Arrays;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        //Leetcode 36
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
    static boolean isValidSudoku(char[][] board) {
        // Check all rows
        for (int row = 0; row < 9; row++) {
            HashSet<Character> seen = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char ch = board[row][col];
                if (ch == '.') continue;
                if (seen.contains(ch)) return false;
                seen.add(ch);
            }
        }

        // Check all columns
        for (int col = 0; col < 9; col++) {
            HashSet<Character> seen = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char ch = board[row][col];
                if (ch == '.') continue;
                if (seen.contains(ch)) return false;
                seen.add(ch);
            }
        }

        // Check all 3x3 sub-boxes
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {
                if (!isValidBox(board, startRow, startRow + 2, startCol, startCol + 2)) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isValidBox(char[][] board, int sr, int er, int sc, int ec){
        HashSet<Character> seen = new HashSet<>();

        for (int row = sr; row <= er; row++) {
            for (int col = sc; col <= ec; col++) {
                char ch = board[row][col];
                if (ch == '.') continue;
                if (seen.contains(ch)) return false;
                seen.add(ch);
            }
        }
        return true;
    }
}
