package src;


import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM("John Doe", 1000, 1234); // Sample account

        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();

        if (!atm.authenticate(enteredPin)) {
            System.out.println("Invalid PIN. Exiting...");
            scanner.close();
            return;
        }

        while (true) {
            atm.displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance: $" + atm.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

