import java.util.Scanner;

public class EndAndStartSwitch {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter a string starting with number: ");
        String address = Scanner.next();

        System.out.println("Enter a string starting with yahoo.com: ");
        String endWith = Scanner.next();

        if (address.startsWith("1") || address.startsWith("2") || address.startsWith("3") || address.startsWith("4") ||
                address.startsWith("5") || address.startsWith("6") || address.startsWith("7") ||
                address.startsWith("8") || address.startsWith("9") || address.startsWith("0")) {
            System.out.println("Valid number");
        } else {
            System.out.println("Invalid character to start with: ");
        }

        if (endWith.endsWith("@yahoo.com") || endWith.equals("@gmail.com")) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Email address must end it yahoo or gmail.com");
        }


    }
}
