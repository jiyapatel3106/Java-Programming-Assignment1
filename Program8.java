// Program 8:
// Create custom exception handling for bank withdrawal
// scenario

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0); // initial balance
        System.out.println("Welcome to Bank System!");
        account.checkBalance();
        System.out.println("Enter amount to withdraw:");
        double amount = sc.nextDouble();
        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        account.checkBalance();
        sc.close();
    }
}