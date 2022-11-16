package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UTMEDrillerTest {


    @Test
    public void firstSetOfCopies() {
        UTMEDriller copies = new UTMEDriller();
        int firstSet = copies.CalculateTotalPriceOf(1);
        assertEquals(2_000, firstSet);
    }

    @Test
    public void secondSetOfCopies() {
        UTMEDriller copies = new UTMEDriller();
        int secondSet = copies.CalculateTotalPriceOf(5);
        assertEquals(9_000, secondSet);
    }

    @Test
    public void thirdSetOfCopies() {
        UTMEDriller copies = new UTMEDriller();
        int thirdSet = copies.CalculateTotalPriceOf(10);
        assertEquals(16_000, thirdSet);
    }

    @Test
    public void fourthSetOfCopies() {
        UTMEDriller copies = new UTMEDriller();
        int fourthSet = copies.CalculateTotalPriceOf(30);
        assertEquals(45_000, fourthSet);
    }

    @Test
    public void fifthSetOfCopies() {
        UTMEDriller copies = new UTMEDriller();
        int fifthSet = copies.CalculateTotalPriceOf(50);
        assertEquals(65_000, fifthSet);
    }

    @Test
    public void sixthSetOfCopies() {
        UTMEDriller copies = new UTMEDriller();
        int sixthSet = copies.CalculateTotalPriceOf(100);
        assertEquals(120_000, sixthSet);
    }

    @Test
    public void seventhSetOfCopies() {
        UTMEDriller copies = new UTMEDriller();
        int seventhSet = copies.CalculateTotalPriceOf(200);
        assertEquals(220_000, seventhSet);
    }

    @Test
    public void eighthSetOfCopies() {
        UTMEDriller copies = new UTMEDriller();
        int eighthSet = copies.CalculateTotalPriceOf(500);
        assertEquals(500_000, eighthSet);
    }


}
