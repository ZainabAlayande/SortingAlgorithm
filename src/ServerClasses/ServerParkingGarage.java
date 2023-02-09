package ServerClasses;

import ChapterSix.ParkingCharges;

import java.util.Scanner;

public class ServerParkingGarage {
    public static Scanner scannerInt = new Scanner(System.in);
    public static Scanner scannerString = new Scanner(System.in);


    static int hoursParked;
    static String nameOfCustomer;
    static double parkingCharges;
    static int numberOfCustomers;
    static int count;


    public static void displayCustomerCount() {
        System.out.print("How many customers parked in the garage yesterday: ");
        numberOfCustomers = scannerInt.nextInt();

        System.out.println();

        count = 1;
        while (count != 1 + numberOfCustomers) {
            System.out.println("Enter name of Customer " + count);
            nameOfCustomer = scannerString.nextLine();

            System.out.println("Enter hours parked for Customer " + count);
            hoursParked = scannerInt.nextInt();
            count++;
            System.out.println();

            if (hoursParked == 0) {
                System.out.println("Number of hours not valid");
                break;
            }
        }
    }

    public static void calculateCharges() {
        parkingCharges = 2.00;
        double additionalCharges = 0.50;

        switch (hoursParked) {
            case 1 -> System.out.println(parkingCharges / 3);
            case 2 -> {
                double anHour = parkingCharges / 3;
                System.out.println(anHour * 2);
            }
            case 3 -> System.out.println(parkingCharges);
            case 4 -> System.out.println(parkingCharges + additionalCharges);
            case 5 -> System.out.println(parkingCharges + (additionalCharges * 2));
            case 6 -> System.out.println(parkingCharges + (additionalCharges * 3));
            case 7 -> System.out.println(parkingCharges + (additionalCharges * 4));
            case 8 -> System.out.println(parkingCharges + (additionalCharges * 5));
            case 9 -> System.out.println(parkingCharges + (additionalCharges * 6));
            case 10 -> System.out.println(parkingCharges + (additionalCharges * 7));
            case 11 -> System.out.println(parkingCharges + (additionalCharges * 8));
            case 12 -> System.out.println(parkingCharges + (additionalCharges * 9));
            case 13 -> System.out.println(parkingCharges + (additionalCharges * 10));
            case 14 -> System.out.println(parkingCharges + (additionalCharges * 11));
            case 15 -> System.out.println(parkingCharges + (additionalCharges * 12));
            case 16 -> System.out.println(parkingCharges + (additionalCharges * 13));
            case 17 -> System.out.println(parkingCharges + (additionalCharges * 14));
            case 18 -> System.out.println(parkingCharges + (additionalCharges * 15));
            case 19 -> System.out.println(parkingCharges + (additionalCharges * 16));
            case 20 -> System.out.println(parkingCharges + (additionalCharges * 17));
            case 21 -> System.out.println(parkingCharges + (additionalCharges * 18));
            case 22 -> System.out.println(parkingCharges + (additionalCharges * 19));
            case 23 -> System.out.println(parkingCharges + (additionalCharges * 20));
            case 24 -> System.out.println(parkingCharges + (additionalCharges * 21));
            default -> System.out.println("Invalid number of hours!!!");
        }
    }

    public static void displayInformation() {
        System.out.println();
        for (int row = 1; row <= 65; row++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.printf("%s%20s%20s%20s%n", "S/N", "Name Of Customer", "Hours Parked", "Parking Charges");

        for (int row = 1; row <= 65; row++) {
            System.out.print("=");
        }

        int[] number = new int[count];
        int[] numberTwo = new int[count];
        int[] hours = new int[hoursParked];
        int[] hoursTwo = new int[hoursParked];
        //String[] name = new String[Integer.parseInt(nameOfCustomer)];
        //int[] hours = new int[hoursParked];
        //double[] charges = new double[(int) parkingCharges];
        for (int i = 1; i < count; i++) {
            System.out.printf("%s%20s%20s%20s%n", number[i], numberTwo[i], hours[i], hoursTwo[i]);
        }


        for (int row = 1; row <= 65; row++) {
            System.out.print("=");
        }

    }

    public static void displayRunningTotal() {
        System.out.println();
        int runningTotal = hoursParked;
        System.out.println("Running Total of Yesterday is " + runningTotal);
    }
}