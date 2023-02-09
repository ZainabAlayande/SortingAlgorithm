package chapterSeven;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        //To create a multidimensional array

        //int[][] numbers = new int[3][3];

        //To populate the array inside the multidimensional array
        //Say I want put something at index 0
        //numbers[0][0] = 7;
        //numbers[0][1] = 8;
        //numbers[0][2] = 9;

        //numbers[1][0] = 10;
        //numbers[1][1] = 11;
        //numbers[1][2] = 12;

        //numbers[2][0] = 13;
        //numbers[2][1] = 14;
        //numbers[2][2] = 15;

        int[][] numbers = new int[5][];
        int[][] num = {{1,2,3},{4,5},{7},{10,11,12}};
        numbers[0] = new int[4];
        numbers[1] = new int[5];
        numbers[2] = new int[6];
        numbers[3] = new int[0];

        for (int[] row:num) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
        System.out.println(Arrays.deepToString(num));
        System.out.println(Arrays.deepToString(numbers));
        //System.out.println(Arrays.toString(numbers));
    }
}
