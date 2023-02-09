package chapterSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class CreditCardValidatorServer {

    private enum Status {VALID, INVALID}

    private static int[] digit;

    private static final Scanner scanner = new Scanner(System.in);




    /**public CreditCardValidatorServer() {

        CreditCardValidatorServer.cardNumber = cardNumber;
    }*/

    static ArrayList<Integer> doubledDigit = new ArrayList<>();
    static int sumOfDoubledDigit;
    static int sumOfDigitInOddPlaces;
    static int sumOfDoubledDigitAndOddPlaces;
    static String userCardNumber;

    static Status cardStatus;

    public static void check(){
        System.out.println(Arrays.toString(digit));
        System.out.println(doubledDigit);
    }


    public static int[] collectCardDetails() {

        System.out.println("Hello, Kindly enter card details to verify");
        userCardNumber = scanner.next();
        digit = new int[userCardNumber.length()];

        for (int element = 0; element < userCardNumber.length(); element++) {
            digit[element] = Integer.parseInt(String.valueOf(userCardNumber.charAt(element)));
        }
        return digit;
    }



    public static int doubleEverySecondDigitFromTheBack() {

        int index = 0;
        for (int element = digit.length - 2; element >= 0; element -= 2) {
            doubledDigit.add(index, digit[element] * 2);
            index++;

        }
        return index;
    }





    public static int addOddPositionNumbersFromTheBack() {


            for (int element = 0; element <= digit.length; element++) {
                if (element % 2 != 0) {
                    sumOfDigitInOddPlaces += digit[element];
                }
            }
        return sumOfDigitInOddPlaces;
    }



    public static void checkIfCardIsValid() {

        //int status = addCardNumberFromTheBack() + addOddPositionNumbersFromTheBack();


        sumOfDoubledDigitAndOddPlaces = sumOfDigitInOddPlaces + sumOfDoubledDigit;
        System.out.println(sumOfDoubledDigitAndOddPlaces);




            //sumOfDoubledDigit = sumOfDoubledDigit + element;
        }


    public static void typeOfCard() {

        if (digit[0] == 4) {
            System.out.println("Visa Card");
        } else if (digit[0] == 5) {
            System.out.println("Master Card");
        } else if (digit[0] == 3 && digit[1] == 7) {
            System.out.println("American Visa Card");
        } else if (digit[0] == 6) {
            System.out.println("Discover Card");
        }

    }


        public static void displayCardDetails () {
            System.out.println();
            System.out.println("******************************************");
            System.out.print("**Credit Card Type: ");
                    typeOfCard();
            System.out.println("**Credit Card Number: " + cardNumber());
            System.out.println("**Credit Card Length: " + cardLength());
            System.out.println("**Credit Card Validity Status: " + getCardStatus());
            System.out.println("******************************************");
        }



    public static Status getCardStatus() {

        if (sumOfDoubledDigitAndOddPlaces % 10 == 0) {
            cardStatus = Status.VALID;
        }
        else  {
            cardStatus = Status.INVALID;
        }

        return cardStatus;

    }



    public static int cardLength() {

        return digit.length;
    }



    public static String cardNumber() {

        return userCardNumber;
    }
}






