package chapterSeven.StudentGradeApplication;

import java.util.Scanner;

public class StudentGrades {

    private final Scanner scanner = new Scanner(System.in);


    int numberOfStudents;
    int numberOfSubjects;
    int[] total = new int[numberOfStudents];
    int[] average = new int[numberOfStudents];
    int[] position = new int[numberOfStudents];


    int largest;
    int smallest;
    int highestScoringStudent;
    int passes = 0;
    int failures = 0;
    int countOfStudents = 1;
    int countOfSubjects = 1;
    int[][] score;


    public StudentGrades() {
    }

    public void welcomeMessage() {

        System.out.println();
        System.out.println("================================================================================      ");
        System.out.println("*****************   WELCOME TO LAGBAJA STUDENTS GRADE PORTAL   *****************      ");
        System.out.println("================================================================================      ");
        System.out.println();


        System.out.println("How many students do you have?");
        numberOfStudents = scanner.nextInt();

        System.out.println("How many subjects do they offer?");
        numberOfSubjects = scanner.nextInt();

        score = new int[numberOfStudents][numberOfSubjects];

        System.out.println();
        System.out.println();
        System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Successfully saved");
        System.out.println();
        System.out.println();


        for (int row = 0; row < numberOfStudents; row++) {
            System.out.println("ENTERING SCORE FOR STUDENT  " + countOfStudents);

            for (int column = 0; column < numberOfSubjects; column++) {
                System.out.println("Enter score for subject  " + (column + 1));
                score[row][column] = scanner.nextInt();
            }
            System.out.println();
            countOfStudents++;
        }
    }

    public void displaySummaryTable() {
        System.out.println("=======================================================================================");
        System.out.print("STUDENT        ");

        for (int sub = 0; sub < score[0].length; sub++) {
            System.out.printf("SUB%d%8s", (sub + 1), "");

        }
        System.out.print("TOT");
        System.out.print("       AVE");
        System.out.println("       POS");
        System.out.println("=======================================================================================");

        for (int student = 0; student < score.length; student++) {
            System.out.printf("Student%2d", (student + 1));

            for (int sub : score[student]) {
                System.out.printf(" %10d", sub);
            }


            int sum = 0;
            for (int row = 0; row < 1; row++) {
                for (int column = 0; column < score[student].length; column++) {
                    sum = sum + score[student][column];
                }
                System.out.printf(" %10d", sum);
                double ave = 0;
                ave = (double) sum / numberOfSubjects;
                System.out.printf(" %10.2f", ave);
                sum = 0;

            }

            System.out.println();

        }

        System.out.println();
        System.out.println("========================================================================================");
        System.out.println("========================================================================================");

    }

    public void subjectSummary() {
        System.out.println();
        System.out.println();
        System.out.println("SUBJECT SUMMARY");

        int totalSubject = 0;
        double averageScore = 0;


        largest = score[0][0];
        highestScoringStudent = 0;
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < score.length; column++) {
                //for (int column = 0; column < score[row].length; column++) {

                if (score[column][row] > largest) {
                    largest = score[column][row];
                    highestScoringStudent = row;
                }
            }
        }




        int column = 0;
        for (int row = 0; row < numberOfSubjects; row++) {
            for (column = 0; column < numberOfStudents; column++) {
                totalSubject = totalSubject + score[column][row];

                if (score[column][row] >= 50) {
                    passes++;
                } else {
                    failures++;
                }

            }



            System.out.printf("Subject %2d%n", (column + 1));
            System.out.printf("Highest Scoring Student is: Student %d scoring %d%n", highestScoringStudent, largest);
            System.out.printf("Lowest Scoring Student is: Student %d scoring %d%n", column, smallest);
            System.out.printf("Total Score is: %d%n", totalSubject);
            System.out.printf("Average Score is: %d%n", (totalSubject / numberOfSubjects));
            System.out.printf("Number of Passes is: %d%n", passes);
            System.out.printf("Number of Failures is: %d%n", failures);
            System.out.println();
            totalSubject = 0;
            passes = 0;
            failures = 0;
            //largest = 0;
            smallest = 0;

        }


        System.out.println();
        System.out.println();
        System.out.printf("The hardest subject is Subject %d with %d failures%n", 2, 2);
        System.out.printf("The easiest subject is Subject %d with %d passes%n", 2, 2);
        System.out.printf("The overall Highest score is scored by Student %d in subject %d scoring %d%n", 2, 2, 99);
        System.out.printf("The overall Lowest score is scored by Student %d in subject %d scoring %d%n", 2, 2, 99);
        System.out.println("=============================================================================");
        System.out.println();
        System.out.println("CLASS SUMMARY");
        System.out.println("=============================================================================");
        System.out.printf("Best Graduating Student is: Student %d score %d%n", 3, 229);
        System.out.println("=============================================================================");
        System.out.println();
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.printf("Worst Graduating Student is: Student %d score %d%n", 3, 229);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println();
        System.out.println("=============================================================================");
        System.out.printf("Class total score is: %d%n", 233);
        System.out.printf("Class Average score is: %d%n", (233 / numberOfStudents));
        System.out.println("=============================================================================");

    }


    /**
     * public int[] getPosition() {
     * <p>
     * int position = 0;
     * <p>
     * if (position >= 75) {
     * System.out.println("1");
     * }
     * else if (position >= 65 && position <= 74) {
     * System.out.println("2");
     * }
     * else if (position >= 55 && position <= 64) {
     * System.out.println("3");
     * }
     * else if (position >= 45 && position <= 54) {
     * System.out.println("4");
     * }
     * else {
     * System.out.println("5");
     * }
     * return position;
     * }
     */


    /**public int largestNumberInARow() {

        int large = 0;
        for (int row = 0; row < numberOfStudents; row++) {

            large = score[row][0];
            for (int column = 0; column < numberOfSubjects; column++) {

                if (score[row][column] > large) {
                    large = score[row][column];
                }
            }
        }

        return large;
    }*/
        }


