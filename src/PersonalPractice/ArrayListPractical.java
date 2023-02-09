package PersonalPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numbers = {{2,3,4}, {5,6,7}};
        int[] arr = {5, 2, 2, 0};

        int iterator = 0;
        for (int num:arr) {
            System.out.println(num + " " + iterator);
            iterator++;
        }

        System.out.println();
        System.out.println();
        System.out.print(numbers[0][0] + " ");
        System.out.print(numbers[0][1] + " ");
        System.out.print(numbers[0][2] + " ");

        System.out.println();

        System.out.print(numbers[1][0] + " ");
        System.out.print(numbers[1][1] + " ");
        System.out.print(numbers[1][2] + " ");

        System.out.println();
        System.out.println();

        System.out.println("Enter some numbers: ");
        String intake = scanner.nextLine();
        String[] num = intake.split(" ");

        //System.out.println(Arrays.toString(num));
        System.out.println();

        System.out.printf("Number of elements: %d%nThe tokens are:%n",
                num.length);
        for (String token: num) {
            System.out.println(token);
        }

    }
}
