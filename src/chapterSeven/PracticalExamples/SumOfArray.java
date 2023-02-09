package chapterSeven.PracticalExamples;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 4, 5, 6, 7, 2, 1};

        int total = 0;

        for (int counter = 0; counter < array.length; counter++) {
                total = total + array[counter];
        }

        System.out.println("Sum total of Array length is: " + total);
    }
}
