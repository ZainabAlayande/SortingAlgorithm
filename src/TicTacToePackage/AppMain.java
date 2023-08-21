package TicTacToePackage;

public class App {
        public static void main(String[] args) throws IllegalArgumentException {
            String[][] ticTacArray = new String[3][3];
            TicTacToe ticTacToe = new TicTacToe(ticTacArray);

            ticTacToe.welcomeToTicTacGame();
            ticTacToe.playGame();
        }
    }

