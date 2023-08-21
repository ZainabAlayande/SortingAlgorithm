package searchAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearchTest_One() {
        int[] array = {1, 2, 4, 5, 7, 9, 11};
        int numberToSearch = 9;
        int expected = 5;
        int actual = BinarySearch.binarySearch(array, numberToSearch);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchTest_Two() {
        int[] array = {2, 4, 6, 8, 9, 10, 12, 14, 16, 18};
        int numberToSearch = 4;
        int expected = 1;
        int actual = BinarySearch.binarySearch(array, numberToSearch);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchTest_Three() {
        int[] array = {2, 4, 6, 8, 9, 10, 12, 14, 16};
        int numberToSearch = 9;
        int expected = 4;
        int actual = BinarySearch.binarySearch(array, numberToSearch);
        assertEquals(expected, actual);
    }


}