// Program 4:
// Implement BankAccount class with deposit, withdraw
// and balance inquiry.

public class Program4 {
    private double balance;

    // Constructor
    public Program4(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }

    // Balance inquiry method
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Program4 account = new Program4(1000.0); // starting with 1000
        account.checkBalance(); // show initial balance
        account.deposit(500.0); // deposit money
        account.checkBalance(); // show updated balance
        account.withdraw(200.0); // withdraw money
        account.checkBalance(); // show updated balance
        account.withdraw(2000.0); // try invalid withdrawal
    }
}