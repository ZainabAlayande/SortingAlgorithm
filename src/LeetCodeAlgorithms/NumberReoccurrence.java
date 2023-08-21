package Algorithms;

import java.util.Arrays;

public class NumberReoccurrence {
    public static void main(String[] args) {
        int[][] array = {{2,4,5,6}, {2, 4, 5, 6, 7}};

        System.out.println(Arrays.toString(loop(array)));;

    }

    private static int[] loop(int[][] array) {
        int[] newArray = new int[5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int numberToSearch = array[i][j];
               if (numberToSearch == array[j + 1][j]) {
                   newArray[i] = array[i][j];
                   //break;
               }
            }
        }

        return newArray;
    }
}
