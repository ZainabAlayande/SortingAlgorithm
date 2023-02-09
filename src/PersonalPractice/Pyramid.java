package PersonalPractice;

public class Pyramid {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int spaces = 10;
        for (int row = 1; row <= 10; row++) {
            for (int blanks = 1; blanks <= spaces; blanks++) {
                System.out.print(" ");
            }

            for (int astericks = 1; astericks <= row; astericks++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;

        }

        System.out.println();

        int spacess = 10;
        for (int row = 1; row <= 10; row++) {
            for (int blanks = 1; blanks <= spacess; blanks++) {
                System.out.print(" ");
            }

            for (int column = 1; column <= row; column++) {
                    System.out.print("*");
                }
                System.out.println();
                spacess--;
        }
    }
}


