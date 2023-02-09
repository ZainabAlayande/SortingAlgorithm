package ChapterEight.MethodInput;

import java.util.Scanner;

public class RefactorScanner {
    private static Scanner KeyboardInput = new Scanner(System.in);
    public static void main(String[] args) {
        display("Hi there!  ");


    }

    public static void display(String prompt) {
        System.out.println(prompt);
    }

    public static String input(String prompt) {
        display(prompt);
        return KeyboardInput.nextLine();
    }

}
