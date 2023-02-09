package tdd;

public class Mp3Player {
   private boolean powerButton;
   private boolean play;
   private boolean pause;
   private int increaseVolume;
   private int decreaseVolume;
   private int previous;
   private int next;

    public Mp3Player(boolean powerButton, boolean play, boolean pause, int increaseVolume, int decreaseVolume, int previous, int next) {
        this.powerButton = powerButton;
        this.play = play;
        this.pause = pause;
        this.increaseVolume = increaseVolume;
        this.decreaseVolume = decreaseVolume;
        this.previous = previous;
        this.next = next;
    }

    public void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }

    public boolean getPowerButton() {
        return powerButton;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public boolean nowPlaying() {
        return play;
    }


    public void setPause(boolean pause) {
        this.pause = pause;
    }

    public boolean nowPaused() {
        return pause;
    }

    public void setIncreaseVolume(int increaseVolume) {
        this.increaseVolume = increaseVolume;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }


    public void setDecreaseVolume(int decreaseVolume) {
        this.decreaseVolume = decreaseVolume;
    }


    public int getDecreaseVolume() {
        return decreaseVolume;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    public int getPrevious() {
        return previous;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getNext() {
        return next;
    }


}
