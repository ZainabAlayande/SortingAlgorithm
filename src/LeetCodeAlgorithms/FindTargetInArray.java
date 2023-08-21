package Algorithms;

import java.util.Scanner;

public class FindTargetInArray {

    static Scanner keyboardInputCollector = new Scanner(System.in);
    public static void main(String[] args) {

        int[] array = {2, 5, 5, 7, 2, 8, 9};
        int target = 11;

        function(array, target);
    }

    public static void function(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] + array[i + 1] == target) {
                System.out.println("Addition of target is found at index -> " + i + " and " + (i+1));
            }
            else {
                System.out.println("No two elements sum up target in the array");
            }
            break;

        }
    }

    public static void display(int prompt) {
        System.out.println(prompt);

    }

    public static String input(String prompt) {
        System.out.println(prompt);
        return keyboardInputCollector.nextLine();

    }


}
