package src;
// import java.util.Scanner;

// ATM.java

public class ATM extends BankAccount {
    private int pin;

    public ATM(String accountHolder, double initialBalance, int pin) {
        super(accountHolder, initialBalance);
        this.pin = pin;
    }

    public boolean authenticate(int inputPin) {
        return this.pin == inputPin;
    }

    public void displayMenu() {
        System.out.println("\nWelcome, " + getAccountHolder());
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
}
