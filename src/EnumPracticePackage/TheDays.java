package EnumPracticePackage;

public class TheDays {
    public static void main(String[] args) {
        System.out.println(DaysOfTheWeek.friday);
        System.out.println();

        for (DaysOfTheWeek days: DaysOfTheWeek.values()) {
            System.out.println(days);
        }
    }
}
