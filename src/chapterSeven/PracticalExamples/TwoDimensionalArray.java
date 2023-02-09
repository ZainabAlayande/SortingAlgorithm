package chapterSeven.PracticalExamples;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] arrayOne = {{1, 2, 3}, {4, 5, 6}};
        int[][] arrayTwo = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array One by row are");
        outputArray(arrayOne);

        System.out.println("Values in array Two by row are");
        outputArray(arrayTwo);

    }
    public static void outputArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d ", array[row][column]);
            }
            System.out.println();

        }
    }
}
