package chapterSeven.SevenSegmentDisplay;

import java.util.Scanner;

public class SevenSegmentApplication {

    static Scanner scanner = new Scanner(System.in);
    static int[][] array = new int[7][4];


    public static void prompt() {
        System.out.println("Enter binary number: ");
        String binaryNumber = scanner.next();
        SevenSegmentApplication.setValue(binaryNumber);
        SevenSegmentApplication.display();
    }


    public static void display() {
        for (int[] row: array) {
            for (int column: row) {
                if (column == '1') {
                    System.out.println("#");
                } else {
                    System.out.println(" ");
                }
                System.out.println();
            }
        }
    }




    public static void setValue(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                switch (i) {
                    case 1:
                        lineA();
                    case 2:
                        lineB();
                    case 3:
                        lineC();
                    case 4:
                        lineD();
                    case 5:
                        lineE();
                    case 6:
                        lineF();
                    case 7:
                        lineG();
                }
            }
        }
    }



    public static void lineA() {
        array[0][0] = 1;
        array[0][1] = 1;
        array[0][2] = 1;
        array[0][3] = 1;
    }



    public static void lineB() {
        array[1][2] = 1;
        array[1][3] = 1;
        array[2][2] = 1;
        array[2][3] = 1;
        array[3][2] = 1;
        array[3][3] = 1;
    }



    public static void lineC() {
        array[4][2] = 1;
        array[4][3] = 1;
        array[5][2] = 1;
        array[5][3] = 1;
    }



    public static void lineD() {
        array[6][0] = 1;
        array[6][1] = 1;
        array[6][2] = 1;
        array[6][3] = 1;
    }


    public static void lineE() {
        array[4][0] = 1;
        array[4][1] = 1;
        array[5][0] = 1;
        array[5][1] = 1;
    }


    public static void lineF() {
        array[1][0] = 1;
        array[1][1] = 1;
        array[2][0] = 1;
        array[2][1] = 1;
    }



    public static void lineG() {
        array[3][0] = 1;
        array[3][1] = 1;
        array[3][2] = 1;
        array[3][3] = 1;
    }
    }