package tdd;

public class BankAccount {
    private String name;
    private String accountNumber;
    private double deposit;
    private double balance;
    private double transfer;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
    return this.balance;
    }

    public void deposit(double deposit) {
        this.deposit = deposit + balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void transfer(double amountTransfer) {
        this.transfer = getDeposit() - amountTransfer;
    }

    public double getTransfer() {
        return this.transfer;
    }

}

