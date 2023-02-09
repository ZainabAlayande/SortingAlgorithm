package ChapterEight.ArcheryGame;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        RandomNumber randomNumber = new RandomNumber();
        game.welcome();
        game.player();
        game.playGame();
        //randomNumber.theArray();
        game.printArray();
    }
}
