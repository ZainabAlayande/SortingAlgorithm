package PersonalPractice;

import java.util.Scanner;

public class AbdulmalikStarPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int temporary = 0;
        int digit = 0;
        int count = 0;


        System.out.print("Enter any number: ");
        number = scanner.nextInt();

        temporary = number;

        while(number > 0) {
            number = number / 10;
            count++;
        }

        while(temporary > 0) {
            digit = temporary % 10;

            System.out.println("Digit at place "+count+" is: "+digit);
            temporary = temporary / 10;
            count--;
        }
    }
}


