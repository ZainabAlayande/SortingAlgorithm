package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest() {
        //given
        Account deborahAccount = new Account(0);

        //when I deposit 5000
        deborahAccount.deposit(5000);

        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();

        // method that exist in the JUNIT library
        assertEquals(5000, deborahAccountBalance);


    }


    @Test
    public void depositTwiceTest() {


        // given there is an account
        Account deborahAccount = new Account(4000);

        // given that initial balance is 4000
        deborahAccount.deposit(4000);

        // when I deposit 2000
        deborahAccount.deposit(2000);

        // check that balance is 6000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(6000, deborahAccountBalance);
    }

    @Test
    public void depositNegativeAmountTest () {

        // given there is an account
        Account deborahAccount = new Account(4000);

        // given that initial balance is 4000
        deborahAccount.deposit(4000);

        // when I deposit -2000
        deborahAccount.deposit(-2000);

        // check that balance is 4000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(4000, deborahAccountBalance);
    }

    @Test
    public void withdrawalTest() {

        //there is an account
        Account deborahAccount = new Account(10000);

        //I have money before
        deborahAccount.deposit(10000);

        //withdraw 5000
        deborahAccount.withdraw(5000, "1234");

        //What's now my balance
        deborahAccount.getBalance();
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(5000, deborahAccountBalance);
    }

    @Test
    public void NegativeWithdrawal() {

        //There is an account
        Account deborahAccount = new Account(10000);

        deborahAccount.deposit(10000);

        deborahAccount.withdraw(-2000, "1234");

        int deborahBalance = deborahAccount.getBalance();
        assertEquals(10000, deborahBalance);

    }

    @Test
    public void WithdrawBeyondAmount() {

        //Given that I have an account
        Account deborahAccount = new Account(20000);

        //Deposit 200000
        deborahAccount.deposit(200000);

        //Withdraw 500000
        deborahAccount.withdraw(500000, "1234");

        int deborahBalance = deborahAccount.getBalance();
        assertEquals(200000, deborahBalance);

    }

    @Test
    public void withdrawWithWrongPinFailsTest() {

        //Given that I have an account
        Account ugoAccount = new Account(50000);

        //Given that I set my pin to 2345
        ugoAccount.setPin("2345");

        //Given that i deposit 50_000
        ugoAccount.deposit(50_000);

        //Given that i withdraw with wrong pin
        ugoAccount.withdraw(20_000, "1234");

        //Check that my balance is 50k
        Account UgoAccount;
        assertEquals(50_000, ugoAccount.getBalance());
    }

    @Test
    public void createAccountWithInitialBalanceTest() {
        Account ugoAccount = new Account(1200);
        assertEquals(1200, ugoAccount.getBalance());

    }
}





