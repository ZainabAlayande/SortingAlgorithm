package PersonalPractice;

public class EqualIgnoreCase {
    public static void main(String[] args) {
        String nameOne = "Zainab";
        String nameTwo = "ZAinab";

        String compareOne = "Alade";
        String compareTwo = "Alade";

        String schoolOne = "Al-miyzan";
        String schoolTwo = "AL-MiyZan";

        if (nameOne.equals(nameTwo)) {
            System.out.println(nameOne + "is equal to " + nameTwo);
        } else {
            System.out.println(nameOne + " is NOT equal to " + nameTwo);
        }

        System.out.println();

        if (compareOne.compareTo(compareTwo) == 0)
            System.out.println("They are the same");
        else {
            System.out.println("They are not the same");
        }

        System.out.println();

        if (schoolOne.equalsIgnoreCase(schoolTwo)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println();
    }
}
