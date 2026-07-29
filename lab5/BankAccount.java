package lab5;

/*
Assignment 2: Bank Account System
Question
Create a Java program that simulates a simple bank account.

Requirements:
1. Create a class named BankAccount.
2. The class should contain:
    - Account Number
    - Account Holder Name
    - Balance
3. Create a parameterized constructor to initialize all the values.
4. Create the following methods:
    - deposit(double amount) – Adds money to the account.
    - withdraw(double amount) – Deducts money only if sufficient balance is available.
    - displayBalance() – Displays the current balance.
5. In the main() method:
    - Create two BankAccount objects.
    - Perform deposit and withdrawal operations.
    - Display the final balance of each account.

## Bonus Challenge: Display the total number of bank accounts created using a static variable.
*/
public class BankAccount {

    static int counter;

    double accountNumber;
    String accountHolderName;
    double balance;

    BankAccount() {
    }

    public BankAccount(double accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        counter++;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit successful.");
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient Balance.");
            System.out.println("Current Balance: " + balance);
            return;
        }
        this.balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Current Balance: " + balance);
    }

    public double displayBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
                + balance + "]";
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Raman", 5000.0);
        BankAccount acc2 = new BankAccount(1002, "Priya", 12000.5);

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(
                "=======================================================================================================");

        acc1.deposit(2000);
        acc1.withdraw(100);
        System.out.println("accountHolderName: " + acc1.accountHolderName + " ,Final Balance: " + acc1.balance);
        System.out.println(
                "=======================================================================================================");

        acc2.deposit(3000);
        acc2.withdraw(100000);
        System.out.println("accountHolderName: " + acc2.accountHolderName + " ,Final Balance: " + acc2.balance);
        System.out.println(
                "=======================================================================================================");

        // Bonus Challenge
        System.out.println("Total Number of Bank Account Created: " + counter);

    }

}
