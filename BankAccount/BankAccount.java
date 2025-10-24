// BankAccount.java - Demonstrates Encapsulation
// This class shows how to encapsulate bank account data with private attributes
// and provide controlled access through public methods

public class BankAccount {
    // Private variables - Encapsulation
    private String accountHolder;
    private double balance;
    private String accountNumber;
    private double interestRate;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance, double interestRate) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        }
        System.out.println("Invalid withdrawal amount");
        return false;
    }

    // Calculate interest
    public void applyInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest applied. New balance: $" + balance);
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
