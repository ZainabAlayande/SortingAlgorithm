package SortingAlgorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test public void sortFiveNumberTest() {
        int[] array = {5, 3, 4, 1, 2};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = BubbleSort.bubbleSortArray(array);
        assertArrayEquals(expected, actual);
    }

    @Test public void sortTenNumberTest() {
        int[] array = {5, 3, 4, 1, 2, 9, 7, 6, 8, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actual = BubbleSort.bubbleSortArray(array);
        assertArrayEquals(expected, actual);
    }

    @Test public void sortFifteenNumberTest() {
        int[] array = {5, 3, 4, 1, 2, 15, 12, 9, 6, 7, 11, 10, 8, 14, 13};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] actual = BubbleSort.bubbleSortArray(array);
        assertArrayEquals(expected, actual);
    }

    @Test public void sortTwentyNumberTest() {
        int[] array = {5, 20, 17, 3, 4, 1, 2, 15, 12, 9, 6, 7, 11, 10, 8, 14, 13, 18, 16, 19};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] actual = BubbleSort.bubbleSortArray(array);
        assertArrayEquals(expected, actual);
    }


}