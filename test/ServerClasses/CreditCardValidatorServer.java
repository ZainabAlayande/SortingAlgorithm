package ServerClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreditCardValidatorServer {

    private enum Status {VALID, INVALID}

    private static String cardNumber;

    public CreditCardValidatorServer() {

        CreditCardValidatorServer.cardNumber = cardNumber;
    }

    static ArrayList<Integer> doubledDigit = new ArrayList<>();
    static int[] number;
    int sumOfDoubledDigit;
    int sumOfDigitInOddPlaces;
    int sumOfDoubledDigitAndOddPlaces;

    public void collectCardDetails() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, Kindly enter card details to verify");
        cardNumber = scanner.next();
        System.out.println();





    }



    public boolean isValid() {
        int[] digit = new int[cardNumber.length()];

        for (int element = 0; element < cardNumber.length(); element++) {
            digit[element] = Integer.parseInt(String.valueOf(cardNumber.charAt(element)));
        }

        int index = 0;
        for (int element = cardNumber.length() - 2; element >= 0; element-=2) {
            digit[element] = Integer.parseInt(String.valueOf(cardNumber.charAt(element)));
            doubledDigit.add(index, digit[element] * 2);
            index++;
        }


        for (int element: doubledDigit) {
            int firstDigit = 0;
            int secondDigit;
            if (element >= 10)
                firstDigit = element/10;
                secondDigit = element%10;
                element = firstDigit + secondDigit;
                sumOfDoubledDigit = sumOfDoubledDigit + element;

            System.out.print(element + " ");

        }
        System.out.println();


        for (int element = 0; element <= digit.length; element++) {
            if (element % 2 != 0) {
                sumOfDigitInOddPlaces+=digit[element];
            }
        }

        sumOfDoubledDigitAndOddPlaces = sumOfDigitInOddPlaces + sumOfDoubledDigit;


        System.out.println();
        System.out.println("Sum of Digit in Odd Places = " + sumOfDigitInOddPlaces);
        System.out.println("Sum of Doubled Digit = " + sumOfDoubledDigit);
        System.out.println(Arrays.toString(digit));
        System.out.println("Array of Doubled Digit = " + doubledDigit);

        return true;
    }

    public Object getCardStatus() {
        String valid = "VALID";
        String invalid = "INVALID";

        if (sumOfDoubledDigitAndOddPlaces % 10 == 0) {
            System.out.println(valid);
        } else {
            System.out.println(invalid);

        }
        return null;
    }



    public void visaCard() {
        System.out.println("**********************************************");
        System.out.println("**Credit Card Type: VisaCard");
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Credit Card Length: " + cardNumber.length());
        System.out.printf("Credit Card Validity Status: " + getCardStatus());
        System.out.println("**********************************************");
    }

    public void masterCard() {
        System.out.println("**********************************************");
        System.out.println("**Credit Card Type: MasterCard");
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Credit Card Length: " + cardNumber.length());
        System.out.println("Credit Card Validity Status: " + getCardStatus());
        System.out.println("**********************************************");
    }

    public void americanExpressCard() {
        System.out.println("**********************************************");
        System.out.println("**Credit Card Type: AmericanExpressCard");
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Credit Card Length: " + cardNumber.length());
        System.out.println("Credit Card Validity Status: " + getCardStatus());
        System.out.println("**********************************************");
    }

    public void discoverCard() {
        System.out.println("**********************************************");
        System.out.println("**Credit Card Type: DiscoverCard");
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Credit Card Length: " + cardNumber.length());
        System.out.println("Credit Card Validity Status: " + getCardStatus());
        System.out.println("**********************************************");
    }

}





