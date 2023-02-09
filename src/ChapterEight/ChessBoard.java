package ChapterEight;

import java.util.Arrays;

public class ChessBoard {
    private String[][] chessBoard = new String[8][8];
    private int currentRow;
    private int currentColumn;
    private static final int[][] possibleMovements = {
            {-1, -2},
            {-2, -1},
            {-2, 1},
            {-1, 2},
            {1, 2},
            {2, 1},
            {2, -1},
            {1, -2},
    };

    public ChessBoard() {
        for (String[] row : chessBoard) {
            Arrays.fill(row, " ");
        }
        currentRow = 3;
        currentColumn = 4;
        chessBoard[currentRow][currentColumn] = "K";
    }

    public void displayBoard() {
        for (String[] row : chessBoard) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void setBoard() {
        int count = 1;
        for (int i = 0; i < possibleMovements.length; i++) {
            int currentRowCopy = currentRow;
            int currentColumnCopy = currentColumn;
            currentRowCopy += possibleMovements[i][0];
            currentColumnCopy += possibleMovements[i][1];
            if (currentRowCopy >= 0 && currentRowCopy <8 && currentColumnCopy >= 0 && currentColumnCopy < 8){
                chessBoard[currentRowCopy][currentColumnCopy] = String.valueOf(count);
                count++;
            }
        }
    }
}
