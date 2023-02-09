package KnightsTour;

import java.util.Scanner;

public class KnightGame {

    ChessBoard board = new ChessBoard();
    private static Scanner scanner = new Scanner(System.in);

    public  int makeL_Shape() {
        System.out.println("Take a stand: ");
        int stand = scanner.nextInt();
        switch (stand){
            case 1:
                board.chessBoard[3][4] = "k";

            case 2:
                board.chessBoard[1][3] = "K";

            case 3:
                board.chessBoard[2][2] = "k";

            case 4:
                board.chessBoard[4][2] = "k";

            case 5:
                board.chessBoard[5][3] = "k";

            case 6:
                board.chessBoard[5][5] = "k";

            case 7:
                board.chessBoard[4][6] = "k";
        }
        return stand;
    }


    public int startGame(int i) {
        return i;
    }

}