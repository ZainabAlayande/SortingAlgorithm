package chapterSeven.PracticalExamples;

public class CardShufflingAndSimulation {
    private final String face;
    private final String suit;


    public CardShufflingAndSimulation(String cardFace, String CardSuit) {
        this.face = cardFace;
        this.suit = cardFace;
    }

    public String toString() {
        return face + " of " + suit;
    }
}
