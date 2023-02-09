package chapterSeven;


import static chapterSeven.CreditCardValidatorServer.*;

public class CreditCardValidator {
    public static void main(String[] args) {

        CreditCardValidatorServer creditCard = new CreditCardValidatorServer();
        collectCardDetails();
        //displayCardDetails();
        //checkIfCardIsValid();
        check();
        doubleEverySecondDigitFromTheBack();



    }
}
