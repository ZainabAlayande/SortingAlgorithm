package DiaryApp;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Diary diary = new Diary("1234");



    public static void main(String[] args) {
        unlockDiary();
        mainMenu();
    }


    private static String input(String prompt) {
       return JOptionPane.showInputDialog(prompt);
    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }

    private static void unlockDiary() {
        try {
            String password = input("Enter your password: ");
            diary.validateThatEmptyStringCanNotBreakCode(password);
            if (Objects.equals(password, diary.getPassword())) {
                display("Diary Unlocked");
                display("");
            } else  {
                display("Incorrect password");
                unlockDiary();
            }

        } catch (Exception e) {
            display(e.getMessage());
        }
    }

    private static void lockDiary() {
        try {
            String lockDiary = input("Enter password to lock your diary: ");
            diary.validateThatEmptyStringCanNotBreakCode(lockDiary);
            if (lockDiary.equals(diary.getPassword())) {
                display("Diary locked");
            }
            else {
                display("Incorrect password");
                lockDiary();
            }
        } catch (Exception e) {
            display(e.getMessage());
        }
    }
    private static void mainMenu() {
        try {
            String mainmenu = ("""
                    =========================
                    Welcome to Friendly Diary App
                    1 -> Create moment
                    2 -> View moment
                    3 -> Delete moment
                    4 -> Count moments
                    5 -> Edit moment
                    6 -> Read All Moments
                    7 -> Exit
                    """);

            String userInput = input(mainmenu);
            diary.validateThatEmptyStringCanNotBreakCode(userInput);
            switch (userInput.charAt(0)) {
                case '1' -> createEntry();
                case '2' -> ViewEntry();
                case '3' -> deleteEntry();
                case '4' -> countEntry();
                case '5' -> editEntry();
                case '6' -> readAllEntry();
                case '7' -> exit();
                default -> mainMenu();
            }
        } catch (Exception e) {
            display(e.getMessage());
        }
    }


    private static void createEntry() {
        try {
            String title = input("Write Title of Entry: ");
            diary.validateThatEmptyStringCanNotBreakCode(title);
            String body = input("Body of Entry: ");
            diary.validateThatEmptyStringCanNotBreakCode(body);
            diary.createEntry(title, body);
            display("Diary successfully created");
            display("");
            mainMenu();
        } catch (Exception e) {
            display(e.getMessage());
        }
        createEntry();
    }



    private static void editEntry() {
        try {
            String momentToBeEdited = input("Enter memory to be edited: ");
            diary.validateThatEmptyStringCanNotBreakCode(momentToBeEdited);
            diary.validateIdentificationNumber(Integer.parseInt(momentToBeEdited));
            String title = input("Write a new Title for Entry: " + momentToBeEdited);
            String body = input("Write a new Body for Entry: " + momentToBeEdited);
            diary.editEntry(Integer.parseInt(momentToBeEdited), title, body);
            display("You edited moment " + momentToBeEdited);
            display("");
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
        }
        mainMenu();

    }



        private static void countEntry() {
                display("");
                display("You have created " + diary.getCountOfDiaryCreated() + " moments so far");
                display("""
                        Keep creating moments
                        Moments are always memorable""");
                display("");
                mainMenu();
        }

        private static void deleteEntry() {
        try {
            String indexToBeDeleted = input("Enter moment to be deleted");
            diary.validateThatEmptyStringCanNotBreakCode(indexToBeDeleted);
            diary.validateIdentificationNumber(Integer.parseInt(indexToBeDeleted));
            display("You are about to delete moment " + indexToBeDeleted);
            display(diary.viewEntry(Integer.parseInt(indexToBeDeleted)));
            String numberToBeDeleted = input("""
                Press 1 --> to proceed
                Press 2 --> to stop delete: """);
            diary.validateThatEmptyStringCanNotBreakCode(numberToBeDeleted);
            switch (numberToBeDeleted) {
                case "1":
                    diary.deleteEntry(Integer.parseInt(indexToBeDeleted));
                    display("Diary " + indexToBeDeleted + " successfully deleted");
                case "2":
                    mainMenu();
            }
            display("");
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
        }

        mainMenu();
    }

    private static void ViewEntry() {
        try {
            String view = input("Enter moment to be viewed");
            diary.validateThatEmptyStringCanNotBreakCode(view);
            System.out.println(diary.viewEntry(Integer.parseInt(view)));
            display("");
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
        }
        mainMenu();
    }


    public static void readAllEntry() {
        diary.readAllTheEntries();
        mainMenu();
    }

    private static void exit() {
        display("");
        lockDiary();
        display("======================================");
        display("Thank you for using Frendly Diary App");
        display("======================================");
        System.exit(0);
    }
}
