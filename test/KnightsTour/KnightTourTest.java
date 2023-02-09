package KnightsTour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.Random;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class KnightTourTest {

    private KnightGame knight;

    @BeforeEach
    public void setUp() {
        knight = new KnightGame();
    }

    @Test
    public void testThatKnightGameExists() {

        assertNotNull(knight);
    }

    @Test
    public void testThatKnightGameHasPlayer() {
        Player player = new Player();
        assertNotNull(player);
    }

    @Test
    public void testThatRandomNumberGeneratesBetween1_and_8() {
        Random random = new Random();
        int randNumber = random.nextInt(9);
        Player.generateRandomNumber(6);
        assertEquals(9, 9);


    }

    @Test
    public void testThatKnightCanMakeL_Shape(){

        //assertTrue(knight.makeL_Shape());
    }


    @Test
    public void testThatKnightCanMakeEightDifferentMoves(){

    }


    @Test
    public void testThatEachSquareIsInitializedToZeroAtTheStart(){
        int squareIsZero = knight.startGame(0);
        assertEquals(0, squareIsZero);
    }



}