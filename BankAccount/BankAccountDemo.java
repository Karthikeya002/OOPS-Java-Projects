/**
 * BankAccountDemo.java
 * Demonstrates the BankAccount class with various operations
 * Shows encapsulation through account management
 */

public class BankAccountDemo {
    public static void main(String[] args) {
        System.out.println("=== Bank Account Management System ===");
        System.out.println();
        
        // Create first account
        BankAccount account1 = new BankAccount("ACC001", "Karthikeya K", 50000);
        System.out.println("Account 1 Created: " + account1.getAccountHolderName());
        System.out.println("Initial Balance: " + account1.getBalance());
        System.out.println();
        
        // Perform operations on account1
        System.out.println("--- Account 1 Operations ---");
        account1.deposit(10000);
        System.out.println("After depositing 10,000: " + account1.getBalance());
        
        account1.withdraw(5000);
        System.out.println("After withdrawing 5,000: " + account1.getBalance());
        
        account1.withdraw(100000);
        System.out.println("Attempted to withdraw 100,000");
        System.out.println();
        
        // Create second account
        BankAccount account2 = new BankAccount("ACC002", "Venkata Rama Krishna", 75000);
        System.out.println("Account 2 Created: " + account2.getAccountHolderName());
        System.out.println("Initial Balance: " + account2.getBalance());
        System.out.println();
        
        // Perform operations on account2
        System.out.println("--- Account 2 Operations ---");
        account2.deposit(25000);
        System.out.println("After depositing 25,000: " + account2.getBalance());
        
        account2.withdraw(30000);
        System.out.println("After withdrawing 30,000: " + account2.getBalance());
        System.out.println();
        
        // Display final account summary
        System.out.println("=== Final Account Summary ===");
        System.out.println(account1.getAccountHolderName() + " - Balance: " + account1.getBalance());
        System.out.println(account2.getAccountHolderName() + " - Balance: " + account2.getBalance());
    }
}
