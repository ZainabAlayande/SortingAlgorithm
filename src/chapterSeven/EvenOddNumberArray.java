package chapterSeven;

public class EvenOddNumberArray {

    public static int[] getListOfEvenNumbers(int[] numbers) {
        int count = 0;
        int[] evenNumbers;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index]%2==0)count++;
        }
        System.out.println(count);
        evenNumbers = new int[count];
        int counter = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index]%2==0){
                evenNumbers[counter] = numbers[index];
                counter++;
            }

        }
        return evenNumbers;
    }
}
