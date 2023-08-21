package Algorithm;

public class FibonacciSeries {
    
    public static long getSumOfFibonacci(int number) {
        int first_Number = 0;
        int second_Number = 1;
        int temp;
        int sum = 1;

        for (int i = 0; i < number - 2; i++) {
            temp = first_Number + second_Number;
            first_Number = second_Number;
            second_Number = temp;
            sum = sum + temp;
        }
        System.out.println();
        return sum;
    }
}
