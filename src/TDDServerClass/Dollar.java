package TDDServerClass;

public class Dollar extends Money {
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public Dollar(int amount) {
        this.amount = amount;

    }
}
