package chapterSeven.PracticalExamples;

import java.util.Arrays;
import java.util.Scanner;

public class LoopIntoAttay {
    public static void main(String[] args) {
        int[] array = new int[30];
        int[] arr = {};

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        for (int index = 0; index < array.length; index++) {
            System.out.println("Enter number " + counter);
            array[index] = scanner.nextInt();
            counter++;
        }
        System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.deepToString());

        String[] str = new String[5];
        for (int index = 0; index < str.length; index++) {
            str[index] = scanner.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
