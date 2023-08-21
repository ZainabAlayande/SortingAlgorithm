package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class HighestCommonFactors {

    public static int[] getFactorsOfNumber(int number) {
        if (number <= 0)
            return new int[0];
        int temp = number;

        int[] array = new int[10];
        int count = 0;
        int[] newArray = new int[0];
        int[] arrayToReturn = new int[1];

        for (int divisor = 2; divisor < number; divisor++) {
            if (count == array.length)
                newArray = new int[array.length];
            System.arraycopy(array, 0, newArray, 0, newArray.length);
            newArray = array;

            if (number % divisor == 0) {
                array[count] = divisor;
                count++;
                number = number / divisor;
                divisor = 2;
            }
        }

        int sum = 1;
        for (int element : newArray) {
            if (element == 0) break;
            sum *= element;
        }

        int otherElement;
        if (sum != temp) {
            otherElement = temp / sum;
            arrayToReturn = new int[newArray.length + 1];
            System.arraycopy(newArray, 0, arrayToReturn, 0, newArray.length);
            arrayToReturn[arrayToReturn.length - 1] = otherElement;
        }

        Arrays.sort(arrayToReturn);
        boolean hasZeros = false;
        for (int i = 0; i < arrayToReturn.length; i++) {
            if (arrayToReturn[i] == 0) {
                hasZeros = true;
                break;
            }
        }
        if (!hasZeros) {
            return arrayToReturn;
        } else {
            int[] result = new int[arrayToReturn.length];
            int index = 0;
            for (int i = 0; i < arrayToReturn.length; i++) {
                if (arrayToReturn[i] != 0) {
                    result[index] = arrayToReturn[i];
                    index++;
                }
            }
            return Arrays.copyOf(result, index);


        }
    }
}
