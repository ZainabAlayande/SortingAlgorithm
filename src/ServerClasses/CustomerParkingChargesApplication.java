package ServerClasses;

import ChapterSix.ParkingCharges;
import PersonalPractice.ServerTabularFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CustomerParkingChargesApplication {
    static List<ParkingCharges> parking = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    private static int hoursParked;
    static String nameOfCustomer;
    static int customerCount;
    static double parkingCharges;
    static int numberOfCustomers;


    public static void displayName() {
        System.out.println("How many customers parked in the garage yesterday: ");
        numberOfCustomers = scanner.nextInt();

        for (ParkingCharges number : parking) {
            System.out.print(number);
        }

        System.out.println();

        customerCount = 1;
        while (customerCount != 1 + numberOfCustomers) {
            System.out.println("Enter Name of Customer " + customerCount);
            nameOfCustomer = scanner.next();
            customerCount++;
        }

        System.out.println();

        int customerCountTwo = 1;
        while (customerCountTwo != 1 + numberOfCustomers) {
            System.out.println("Enter hours parked for Customer " + customerCountTwo);
            hoursParked = scanner.nextInt();
            customerCountTwo++;

            if (hoursParked == 0) {
                System.out.println("Number of hours not valid");
                break;
            }
        }
    }


    public static double calculateCharges() {
        double parkingCharges = 2.00;
        double additionalCharges = 0.50;

        switch (hoursParked) {
            case 1:
                System.out.println(parkingCharges / 3);
                break;

            case 2:
                double anHour = parkingCharges / 3;
                System.out.println(anHour * 2);
                break;

            case 3:
                System.out.println(parkingCharges);
                break;

            case 4:
                System.out.println(parkingCharges + additionalCharges);
                break;

            case 5:
                System.out.println(parkingCharges + (additionalCharges * 2));
                break;

            case 6:
                System.out.println(parkingCharges + (additionalCharges * 3));
                break;

            case 7:
                System.out.println(parkingCharges + (additionalCharges * 4));
                break;

            case 8:
                System.out.println(parkingCharges + (additionalCharges * 5));
                break;

            case 9:
                System.out.println(parkingCharges + (additionalCharges * 6));
                break;

            case 10:
                System.out.println(parkingCharges + (additionalCharges * 7));
                break;

            case 11:
                System.out.println(parkingCharges + (additionalCharges * 8));
                break;

            case 12:
                System.out.println(parkingCharges + (additionalCharges * 9));
                break;

            case 13:
                System.out.println(parkingCharges + (additionalCharges * 10));
                break;

            case 14:
                System.out.println(parkingCharges + (additionalCharges * 11));
                break;

            case 15:
                System.out.println(parkingCharges + (additionalCharges * 12));
                break;

            case 16:
                System.out.println(parkingCharges + (additionalCharges * 13));
                break;

            case 17:
                System.out.println(parkingCharges + (additionalCharges * 14));
                break;

            case 18:
                System.out.println(parkingCharges + (additionalCharges * 15));
                break;

            case 19:
                System.out.println(parkingCharges + (additionalCharges * 16));
                break;

            case 20:
                System.out.println(parkingCharges + (additionalCharges * 17));
                break;

            case 21:
                System.out.println(parkingCharges + (additionalCharges * 18));
                break;

            case 22:
                System.out.println(parkingCharges + (additionalCharges * 19));
                break;

            case 23:
                System.out.println(parkingCharges + (additionalCharges * 20));
                break;

            case 24:
                System.out.println(parkingCharges + (additionalCharges * 21));
                break;

            default:
                System.out.println("Invalid number of hours!!!");

        }

        return parkingCharges;
    }



    public static void displayCharges() {
        System.out.println();
        for (int row = 1; row <= 65; row++) {
            System.out.print("=");
        }
        System.out.println();

        var park = new ParkingCharges();
        parking.add(park);

        System.out.printf("%s%20s%20s%20s%n", "S/N", "Name Of Customer", "Hours Parked", "Parking Charges");
        System.out.println();

        for (ParkingCharges std : parking) {
            System.out.printf("%d%20s%20d%20f%n",customerCount - 1, nameOfCustomer, hoursParked, parkingCharges);
            System.out.println();

        }

        for (int row = 1; row <= 65; row++) {
            System.out.print("=");
        }



    }
}



