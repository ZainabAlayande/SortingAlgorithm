package Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Binary {
    static int temp;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> array = new ArrayList<>();



    public static void main(String[] args) {
            collectNumberAndAddToArrayList();
            PrintingOutArrayItems();
    }



    private static void collectNumberAndAddToArrayList() {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        temp = number;
        int remainder;
        int index = 0;

        while (!(number == 0)) {
            remainder = number % 2;
            array.add(index, remainder);
            number = number/2;
            index++;
        }
    }

    private static void PrintingOutArrayItems() {
        System.out.println();
        System.out.print("Binary number of " + temp + " is (ascending order)-> ");
        for (Integer arr:array) {
            System.out.print(arr);
        }

        System.out.println();
        System.out.println();
        System.out.print("Binary number of " + temp + " is (descending order)-> ");
        for (int i = array.size() - 1; i >= 0; i--) {
            System.out.print(array.get(i));
        }
    }
}
