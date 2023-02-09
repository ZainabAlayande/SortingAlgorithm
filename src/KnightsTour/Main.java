package KnightsTour;

public class Main {

    public static void main(String[] args) {

        ChessBoard theChessBoard = new ChessBoard();
        KnightGame knightGame = new KnightGame();
        theChessBoard.setArray();
        theChessBoard.displayArray();
        knightGame.makeL_Shape();
        theChessBoard.displayArray();
    }
}
