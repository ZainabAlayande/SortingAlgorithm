package PersonalPractice;

import java.util.Arrays;

public class ArraySortMethod {
    public static void main(String[] args) {
        int[] array = new int[]{34,45,22,12,5,16,109,78,46,52,61,84,3,9,11};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
