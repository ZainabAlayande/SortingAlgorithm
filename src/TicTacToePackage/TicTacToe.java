package TicTacToePackage;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    Scanner scanner = new Scanner(System.in);
    TicTacValues ticTacValues;
    String nameOfPlayerOne;
    String nameOfPlayerTwo;
    String[][] ticTacArray;
    String[] player = new String[2];

    public TicTacToe(String[][] ticTacArray) {
        this.ticTacArray = ticTacArray;
    }
    private void beginner() {
        System.out.println("""
                ===============================
                   TIC TAC TOE -- TWO PLAYERS
                ===============================""");
    }

    private void infoAboutPlayer() {
        System.out.println("Enter name of player one");
        nameOfPlayerOne = scanner.next();
        player[0] = nameOfPlayerOne;

        System.out.println("Enter name player two");
        nameOfPlayerTwo = scanner.next();
        player[1] = nameOfPlayerTwo;

        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i] + " take position");
            initializeBoardElementToZero();
            printArray();

        }

    }
    public void initializeBoardElementToZero() {
        for (int i = 0; i < ticTacArray.length; i++) {
            for (int j = 0; j < ticTacArray.length; j++) {
                ticTacArray[i][j] = " ";
            }
        }
    }

    public void printArray() {
        for (String[] lists:ticTacArray) {
            System.out.println(Arrays.toString(lists));

        }
    }






    public static void main(String[] args) {
        String[][] ticTacArray = new String[3][3];
        TicTacToe ticTacToe = new TicTacToe(ticTacArray);

        ticTacToe.beginner();
        ticTacToe.infoAboutPlayer();

    }

    public void getPlayingBoard() {
    }

    public void takePosition(int position) {
        initializeBoardElementToZero();
                if (position == 1) {
                    ticTacArray[0][0] = String.valueOf(position);
                } else if (position == 2) {
                    ticTacArray[0][1] = String.valueOf(position);
                } else if (position == 3) {
                    ticTacArray[0][2] = String.valueOf(position);
                } else if (position == 4) {
                    ticTacArray[1][0] = String.valueOf(position);
                } else if (position == 5) {
                    ticTacArray[1][1] = String.valueOf(position);
                } else if (position == 6) {
                    ticTacArray[1][2] = String.valueOf(position);
                } else if (position == 7) {
                    ticTacArray[2][0] = String.valueOf(position);
                } else if (position == 8) {
                    ticTacArray[2][1] = String.valueOf(position);
                } else if (position == 9) {
                    ticTacArray[2][2] = String.valueOf(position);
                } else {
                    throw new IllegalArgumentException("Not a valid placement");
                }
    }
        }

