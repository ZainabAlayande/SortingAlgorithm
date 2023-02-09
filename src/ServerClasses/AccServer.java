package ServerClasses;

public class AccServer {

    private String name;
    private double balance;

    public AccServer(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    public void withdrawal(double withdraw) {
        if (withdraw < balance) {
            balance = balance - withdraw;
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
