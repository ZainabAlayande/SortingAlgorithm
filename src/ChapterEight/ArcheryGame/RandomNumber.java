package ChapterEight.ArcheryGame;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    Random randomNumber = new Random();
    int firstNumber;
    int secondNumber;
    int thirdNumber;
    int[] scoreArray = new int[4];


    public int getRandomNumber() {
         firstNumber = 1 + randomNumber.nextInt(10);
         secondNumber = 1 + randomNumber.nextInt(10);
         thirdNumber = 1 + randomNumber.nextInt(10);


        System.out.println( "Played " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " + addRandomNumber());
        System.out.println();

        for (int i = 0; i < scoreArray.length; i++) {
            scoreArray[i] = (firstNumber + secondNumber + thirdNumber);
        }


        return 0;
    }

    public int addRandomNumber() {
        return firstNumber + secondNumber + thirdNumber;
    }

    public void theArray() {
        System.out.println(Arrays.toString(scoreArray));

    }



    public int getMaximumRandomNumber() {
        int maximum = firstNumber;

        if (maximum > secondNumber) {

        }

        return maximum;
    }
}
