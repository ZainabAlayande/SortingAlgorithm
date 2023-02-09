package PersonalPractice;

public class PrintingStarOnTheSameLine {

    public static void main(String[] args) {


    }

    public static void startOne() {
        for (int row = 1; row <= 8; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void starTwo() {
        for (int row = 1; row <= 8; row++) {
            for (int column = 8; column >= row; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void starThree() {
        int blanks = 8;
        for (int row = 1; row <= 7; row++) {
            for (int space = 1; space < blanks; space++) {
                System.out.print(" ");
            }

            for (int column = 1; column < row * 2; column++) {
                System.out.print("*");
            }

            System.out.println();
            blanks--;
        }
    }
}