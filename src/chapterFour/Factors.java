package chapterFour;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int numberCounter = number;
        int counter = 0;

         while (number % numberCounter != 0 ) {

             if (number/number == 0)
                 counter = counter + 1;

             System.out.printf("%d has %d factors", number, counter);
         }

    }
}
