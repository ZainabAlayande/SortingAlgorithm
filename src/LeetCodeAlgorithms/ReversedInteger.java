package Algorithms;

public class ReversedInteger {


    public static void main(String[] args) {
        reverse(-528);

    }


    public static int reverse(int number) {
        if (number < 0) {
            int first = Math.abs(number) % 100 % 10;
            int second = Math.abs(number) % 100 / 10;
            int third = Math.abs(number) /100;

            System.out.print("Number in reversed other -> -");
            System.out.print(first);
            System.out.print(second);
            System.out.print(third);
        }

        else {
            int firstBreak = number % 100 % 10;
            int secondBreak = number % 100 / 10;
            int thirdBreak = number / 100;

            if (firstBreak == 0) {
                System.out.print("Number in reversed other -> ");
                System.out.print(secondBreak);
                System.out.print(thirdBreak);
                System.out.println();
                System.exit(0);
            }

            System.out.print("Number in reversed other -> ");
            System.out.print(firstBreak);
            System.out.print(secondBreak);
            System.out.print(thirdBreak);
        }
        return  number;
    }
}

