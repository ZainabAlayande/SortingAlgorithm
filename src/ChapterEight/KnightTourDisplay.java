package ChapterEight;
import static ChapterEight.ChessBoard.*;


public class KnightTourDisplay {


    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.displayBoard();
        chessBoard.setBoard();
        System.out.println("========================");
        chessBoard.displayBoard();

    }
}

