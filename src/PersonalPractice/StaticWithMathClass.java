package PersonalPractice;

import java.util.Scanner;

public class StaticWithMathClass {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Second Number: ");
        int secondNumber = scanner.nextInt();

        System.out.println();
        System.out.println(Math.min(firstNumber, secondNumber));
    }
}
