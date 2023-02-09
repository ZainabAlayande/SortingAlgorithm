package chapterSeven.PracticalExamples;

import java.util.Arrays;

public class ArrayObject {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayInitializer = {24, 22, 33, 45, 12, 34, 89, 13, 43, 89};

        System.out.printf("%s%15s%n", "Index", "Values");

        for (int counter = 0; counter < arrayInitializer.length; counter++) {
            System.out.printf("%s%15s%n", counter, arrayInitializer[counter]);
        }

        System.out.println();

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%s%15s%n", counter, array[counter]);
        }
    }
}
