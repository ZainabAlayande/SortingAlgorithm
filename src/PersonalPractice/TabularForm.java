package PersonalPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TabularForm {
    public static void main(String[] args) {

        List<ServerTabularFormat> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            var input = new Scanner(System.in);

            System.out.println("Enter Name: ");
            String name = input.nextLine();

            System.out.println("Enter Location: ");
            String location = input.nextLine();

            System.out.println("Enter Age: ");
            int age = input.nextInt();

            var student = new ServerTabularFormat(name, age, location);
            students.add(student);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("%20s%15s%15s", "STUDENT NAME", "AGE", "LOCATION");
        System.out.println();
        System.out.println("----------------------------------------------------------");


        for (ServerTabularFormat std : students) {
            System.out.printf("%20s%15s%15s", std.getName(), std.getAge(), std.getLocation());
            System.out.println();
            System.out.println("----------------------------------------------------------");

        }

        }
    }
