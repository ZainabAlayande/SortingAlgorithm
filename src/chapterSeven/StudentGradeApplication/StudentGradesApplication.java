package chapterSeven.StudentGradeApplication;

public class StudentGradesApplication {
    public static void main(String[] args) {

        StudentGrades studentGrades = new StudentGrades();
        studentGrades.welcomeMessage();
        studentGrades.displaySummaryTable();
        studentGrades.subjectSummary();


    }
}

    //double total = getTotalOnARow(scoreArray[student]);
//            System.out.printf(" %10.2f", total);
//            //totalArray[student] = (int) getTotalOnARow(scoreArray[student]);
//
//
//            double average = getAverageOnARow(scoreArray[student]);
//            System.out.printf(" %10.2f", average);
//
//            int[] position = getPosition();
//            System.out.printf(" %10.2s%n", Arrays.toString(position));

            //index++;