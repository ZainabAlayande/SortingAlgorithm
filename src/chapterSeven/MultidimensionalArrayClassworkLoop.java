package chapterSeven;

import java.util.Arrays;

import static java.util.Arrays.*;

import java.util.Scanner;

public class MultidimensionalArrayClassworkLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] number = new int[3][3];
        int[][] array = new int[4][4];

        int rowe;
        for (rowe = 1; rowe < array.length; rowe++) {
            for (int column = 0; column <array[rowe].length; column++) {
                System.out.print("Enter value for array: ");
                array[rowe][column] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.toString(array[rowe]));

        int counter = 1;
        for (int row = 0; row < number.length; row++) {
            for (int column = 0; column < number[row].length; column++) {
                number[row][column] = counter;
                counter++;
            }
        }
        for (int[] rw:number) {
            System.out.println(Arrays.toString((rw)));
        }

        System.out.println();

        for (int row = 0; row < number.length; row++) {
            System.out.println(Arrays.toString(number[row]));

        }
            }


        }






