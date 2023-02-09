package chapterSeven.PracticalExamples;

public class ArrayDeclaration {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 100;

        int[] array = new int[ARRAY_LENGTH];

        System.out.printf("%s%10s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter=+10) {
            array[counter] = 10 + (1 * counter);
        }

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%s%10s%n", counter, array[counter]);
        }
    }


        }


