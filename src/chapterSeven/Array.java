package chapterSeven;

import tdd.Account;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /**int[] numbers = new int[10];

        numbers[0] = 9;
        numbers[1] = 8;
        numbers[9] = 100;
        numbers[4] = 29;*/

        //IT prints the address in memory
        //when you print out the variable referencing an object, You don't get the value like you will get in primitive types,
        //you get the address
        //System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many scores you wan add?");
        int numberOfScores = scanner.nextInt();
        int [] scores = new int[numberOfScores];
        int sum = 0;

        for(int index = 0; index < numberOfScores; index++) {
            System.out.println("Enter score " + (index + 1));
            scores[index] = scanner.nextInt();
        }

        for (int index = 0; index < scores.length; index++) {
            sum += scores[index];

        }
        //System.out.println(scores.length);
        System.out.println("sum ==> " + sum);
        //System.out.println("\n".repeat(4));
    }
}
