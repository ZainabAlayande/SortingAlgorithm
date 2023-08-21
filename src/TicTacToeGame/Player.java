package TicTacToeAgain;

import java.util.Objects;
import java.util.Random;

public class Player {
    int count = 2;
    private String name;
    private String currentPlayer = TicTacEnum.O.getName();
    private String nextPlayer = "Robot";
    Player[] arrayOfPlayer = new Player[2];

    public Player() {
    }

    public int getCount() {
        return count;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNextPlayer() {

        if (currentPlayer.equals("O")) {
            currentPlayer = "X";
        } else {
            currentPlayer = "O";
        }
        return currentPlayer;
    }

    public int generateRandomNumber() {
        Random random = new Random();
        return 1 + random.nextInt(9);
    }
//    public String getNextBetweenComputerAndPlayer() {
//       if (nextPlayer.equals("X"))
//           nextPlayer = ""
//
//       return null;
//    }
}