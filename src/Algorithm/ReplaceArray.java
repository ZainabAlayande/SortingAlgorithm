package Algorithm;

import chapterSeven.Array;

import java.util.Arrays;

public class ReplaceArrayWithOneAndZero {

    public static void main(String[] args) {
        populateTheBoard();
        displayTheBoard();
        addNewLine();

        replaceLettersInTheBoard();

    }
    private static char[][] board = new char[3][3];

    public static void populateTheBoard() {
        board[0][0] = 'X';
        board[0][1] = 'O';
        board[0][2] = 'X';

        board[1][0] = 'O';
        board[1][1] = 'O';
        board[1][2] = 'X';

        board[2][0] = 'X';
        board[2][1] = 'X';
        board[2][2] = 'O';
    }

    public static void displayTheBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void replaceLettersInTheBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'X')
                    board[i][j] = '1';
                else
                    board[i][j] = '0';
                System.out.print(board[i][j] + "   ");

            }
            System.out.println();

        }
    }

    public static void addNewLine() {
        System.out.println();
        System.out.println();
        System.out.println();

    }

}
