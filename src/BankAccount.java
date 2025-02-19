package src;


    public class BankAccount {
        private double balance;
        private String accountHolder;
    
        public BankAccount(String accountHolder, double initialBalance) {
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public String getAccountHolder() {
            return accountHolder;
        }
    
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
    
        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
                return true;
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
                return false;
            }
        }
    }
    
    

