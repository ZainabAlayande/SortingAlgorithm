package tdd;

public class Account {

    private int balance;

    private String pin = "1234";

    public Account(int initialDeposit) {
        balance = initialDeposit;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }

    }

    public int getBalance() {
        return balance;
    }



    public void withdraw(int amount, String pin) {
        int minimumBalance = 1000;
        if(pin.equals(this.pin))
        if (amount < (balance - minimumBalance))   {
            System.out.print("Withdrawal exceeded balance");
        }

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }

    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}


