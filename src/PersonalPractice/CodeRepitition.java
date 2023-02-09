package PersonalPractice;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CodeRepitition {

    public static void main(String[] args) {


        int[][] number = new int[2][3];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = j + 1;
            }
        }

        System.out.println(Arrays.deepToString(number));


        int sum;
        for (int row = 0; row < number.length; row++) {
            sum = 0;
            for (int column = 0; column < number[row].length; column++) {
                sum = sum + number[row][column];
            }

            System.out.println("Sum of row " + row + " is " + sum);

        }


        /**Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number within 0 and 100: ");
        int number = scanner.nextInt();

        int counter = 1;
        while (counter < 10) {
            System.out.println("Enter number within 0 and 100: " + counter);
            number = scanner.nextInt();

            if (number > 100){


            }

            counter++;


        }
    }*/
}
}