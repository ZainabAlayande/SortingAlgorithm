package chapterSeven;

import java.util.Arrays;

public class PassValueInto2DArray {
    public static void main(String[] args) {
        int[][] array = {{0,0,0,}, {0,0,0,}, {0,0,0}};


        int number = 1;

        for (int[] ints : array) {
            Arrays.fill(ints, number);
            number++;
        }
        System.out.println(Arrays.deepToString(array));



    }
}
