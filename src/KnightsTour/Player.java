package KnightsTour;

import java.util.Random;

public class Player {
    public Player getPlayer;

    public static int generateRandomNumber(int i) {
        Random random = new Random();
        int generateNumber = random.nextInt(8);
        if (generateNumber < 1 && generateNumber > 9) {
            generateRandomNumber(6);
        }

        return generateNumber;
    }
}
