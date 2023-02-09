package PersonalPractice;

public class StarPracticing {
    public static void main(String[] args) {
        for (int row = 1; row <= 8; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();

        for (int row = 1; row <= 8; row++) {
            for (int column = 8; column >= row; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int blanks = 8;
        for (int row = 1; row <= 7; row++) {
            for (int space = 1; space < blanks; space++) {
                System.out.print("  ");
            }

            for (int column = 1; column < row * 2; column++) {
                System.out.print("* ");
            }

            System.out.println();
            blanks--;
        }

        int number = 6;
        int blank = 1;
        for (int row = 1; row <= number; row++) {
            for (int rowTwo = 1; rowTwo <= number; rowTwo++) {
                System.out.print("* ");
            }
            for (int column = row; column <= number + 3; column++) {
                System.out.print("* ");
            }
            System.out.println();
            blanks--;
            for (int space = 1; space <= row; space++) {
                System.out.print("  ");
            }

        }
    }
}