package PersonalPractice;

import java.util.Arrays;

public class AnotherBubbleSortAlgorithm {
    public static void main(String[] args) {

        int temp;
        int[] array = {24, 78, 97, 12, 4, 38};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
