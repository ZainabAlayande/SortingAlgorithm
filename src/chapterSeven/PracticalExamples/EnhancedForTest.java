package chapterSeven.PracticalExamples;

public class EnhancedForTest {
    public static void main(String[] args) {
        int[] array = {56, 98, 23, 45, 75, 12, 45, 89,34, 62};
        int total = 0;

        for (int number:array) {
            total = total + number;
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}
