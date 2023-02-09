package ServerClasses;

public class TicTacServer {

    public void sideOne() {
        int number = 1;
        for (int row = 1; row <= 3; row++) {
            for (int firstrow = 0; firstrow < number; firstrow++) {
                System.out.print("O    ");
            }
            for (int secondRow = 1; secondRow <= number; secondRow++) {
                System.out.print("X    ");
            }
            for (int firstrow = 1; firstrow <= number; firstrow++) {
                System.out.print("O    ");
            }
            System.out.println();
        }
    }

    public void sideTwo() {
        int numberTwo = 3;
        for (int row = 1; row <= 1; row++) {
            for (int i = 1; i <= numberTwo; i++) {
                System.out.print("O    ");
            }
            System.out.println();
            for (int j = 1; j <= numberTwo; j++) {
                System.out.print("X    ");
            }
            System.out.println();
            for (int i = 1; i <= numberTwo; i++) {
                System.out.print("O    ");
            }
            System.out.println();
        }
    }

    public void sideThree() {
        for (int row = 1; row <= 1; row++) {
            for (int i = 1; i <= 1; i++) {
                System.out.print("X    ");
            }
            for (int i = 0; i <= 1; i++) {
                System.out.print("O    ");
            }
            System.out.println();

            for (int i = 1; i <= 1; i++) {
                System.out.print("O    X    O");
            }

            System.out.println();

            for (int i = 1; i <= 1; i++) {
                System.out.print("O    O");
            }

            for (int i = 1; i <= 1; i++) {
                System.out.print("    X");

                System.out.println();
            }
        }

    }

    public void sideFour() {
        for (int row = 1; row <= 1; row++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print("O    ");
            }
            for (int i = 1; i <= 1; i++) {
                System.out.print("X");
            }
            System.out.println();
            for (int i = 1; i <= 1; i++) {
                System.out.print("O    X    O");
            }
            System.out.println();
            for (int i = 1; i <= 1; i++) {
                System.out.print("X");
            }
            for (int i = 1; i <= 1; i++) {
                System.out.print("    O    O");
            }

        }
    }
}
