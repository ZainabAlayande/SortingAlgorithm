package TicTacToePackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    private TicTacToe ticTacToe;

    @BeforeEach

    public void setUp() {
        String[][] playingBoard = new String[3][3];
        ticTacToe = new TicTacToe(playingBoard);
    }

    @Test
    public void testThatThePlayBoardIsInitializedToZero() {
        ticTacToe.initializeBoardElementToZero();
        ticTacToe.printArray();
    }

    @Test
    public void testThatICanOnlyHaveTwoPlayers() {
        int length = ticTacToe.player.length;
        assertEquals(2, length);
    }

    @Test
    public void testThatPlayersCanTakePosition() {
        ticTacToe.takePosition(3);
        ticTacToe.printArray();
    }

    @Test
    public void testThatPlayerCanWinOnLine123() {
        ticTacToe.takePosition(1);
        ticTacToe.takePosition(2);
        ticTacToe.takePosition(3);
        ticTacToe.printArray();




    }

    @Test
    public void testThatPlayerCanWinOnLine456() {

    }

    @Test
    public void testThatPlayerCanWinOnLine789() {

    }

    @Test
    public void testThatPlayerCanWineOnLine159() {

    }

    @Test
    public void testThatPlayerCanWinOnLine357() {

    }

    @Test
    public void testThatPlayerCanWinOnLine147() {

    }

    @Test
    public void testThatPlayerCanWinOnLine258() {

    }

    @Test
    public void testThatPlayerCanWinOnLine369() {

    }
}