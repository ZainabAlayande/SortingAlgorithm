package Algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestCommonFactorsTest {

    @Test public void getTheFactorsOf_10Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(10);
        int[] expected = {2, 5};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf_6Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(6);
        int[] expected = {2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf_0Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(0);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf1_000_000Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(1000000);
        int[] expected = {2, 2, 4, 4, 5, 5, 5, 5, 5, 5};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf_520Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(520);
        int[] expected = {2, 4, 5, 13};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf_100Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(100);
        int[] expected = {2, 2, 5, 5};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf_20Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(20);
        int[] expected = {2, 2, 5};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf_15Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(15);
        int[] expected = {3, 5};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf_Minus20Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(-20);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf_50Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(50);
        int[] expected = {2, 5, 5};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf_28Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(28);
        int[] expected = {2, 2, 7};
        assertArrayEquals(expected, actual);
    }

    @Test public void getTheFactorsOf_18Test() {
        int[] actual = HighestCommonFactors.getFactorsOfNumber(18);
        int[] expected = {2, 3, 3};
        assertArrayEquals(expected, actual);
    }

}