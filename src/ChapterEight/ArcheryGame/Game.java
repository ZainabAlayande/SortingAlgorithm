package ChapterEight.ArcheryGame;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    RandomNumber randomNumber = new RandomNumber();

    String[] players = new String[4];
    int[] scoreArray;

    public void welcome() {
        System.out.println();
        System.out.println("                           ARCHERY GAME");
        System.out.println("          Are you Ready!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public void player() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Enter player " + (i+1) + " name");
            players[i] = scanner.next();
            System.out.println();
        }
    }

    public void playGame() {
        for (int i = 0; i < players.length; i++) {
            scoreArray = new int[4];
            for (int j = 0; j < 1; j++) {
                System.out.print(players[i] + " is playing");
                //time();
                randomNumber.getRandomNumber();
            }
            scoreArray[i] = randomNumber.getRandomNumber();

        }
    }

    public void printArray() {
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.println(scoreArray[i]);

        }
    }

    public void time() {
            for (int i = 0; i < 5; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        System.out.println();
        }
    }

