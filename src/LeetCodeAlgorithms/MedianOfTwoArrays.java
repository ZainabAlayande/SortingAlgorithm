package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoArrays {
    static Scanner keyboardInputCollector = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrayOne = {1, 3};
        int[] arrayTwo = {2};


        supplyArray(arrayOne, arrayTwo);

    }


    public static void supplyArray(int[] arrayOne, int[] arrayTwo) {

        int[] newArray = new int[arrayOne.length + arrayTwo.length];

        System.arraycopy(arrayOne, 0, newArray, 0, arrayOne.length);
        System.arraycopy(arrayTwo, 0, newArray, arrayOne.length, arrayTwo.length);


        Arrays.sort(newArray);


        int resultOne;
        int resultTwo;
            if (newArray.length % 2 == 0) {
                   resultOne = newArray[newArray.length/2] + newArray[(newArray.length/2) - 1];
                System.out.print("Median of Array One and Array Two = ");
                display(resultOne);
            }

            else {
            resultTwo = newArray[newArray.length/2];
                System.out.print("Median of Array One and Array Two = ");
                display(resultTwo);


        }


    }




    public static void display(int prompt) {
        System.out.println(prompt);
    }

    public static String input(String prompt){
        display(Integer.parseInt(prompt));
        return keyboardInputCollector.nextLine();
    }
}
