package javacore;

// Parent class
class Account {

    int accNo;
    double balance;

    // Constructor of Account class
    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Amount");
        }
    }

    // Method to display account details
    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}


// Child class 1
// Inheritance: SavingsAccount inherits Account
class SavingsAccount extends Account {

    double interestRate;

    // Constructor of SavingsAccount
    SavingsAccount(int accNo, double balance, double interestRate) {

        // super() calls the constructor of parent class
        super(accNo, balance);

        this.interestRate = interestRate;
    }

    // Method to calculate interest
    void calInterest() {

        double interest = balance * interestRate / 100;

        balance = balance + interest;

        System.out.println("Interest: " + interest);
    }
}


// Child class 2
// Inheritance: CurrentAccount inherits Account
class CurrentAccount extends Account {

    double overDraftLimit;

    // Constructor of CurrentAccount
    CurrentAccount(int accNo, double balance, double overDraftLimit) {

        // Calling parent class constructor
        super(accNo, balance);

        this.overDraftLimit = overDraftLimit;
    }

    // Method Overriding
    // Same withdraw() method as parent class
    // but with different implementation
    @Override
    void withdraw(double amount) {

        // Balance + overdraft limit can be used
        if (amount <= balance + overDraftLimit) {

            balance = balance - amount;

            System.out.println("Withdrawn: " + amount);
        } 
        else {

            System.out.println("Overdraft limit exceeded");
        }
    }
}


// Main class
public class BankAccManagement {

    public static void main(String[] args) {

        // Creating SavingsAccount object
        SavingsAccount sa =
                new SavingsAccount(2347566, 99000, 9.0);

        System.out.println("Savings Account");

        sa.deposit(1800);

        sa.withdraw(100);

        sa.calInterest();

        sa.display();


        System.out.println();


        // Creating CurrentAccount object
        CurrentAccount ca =
                new CurrentAccount(44564, 300, 567);

        System.out.println("Current Account");

        ca.deposit(1000);

        ca.withdraw(3000);

        ca.display();
    }
}
Savings Account
Deposited: 1800.0
Withdrawn: 100.0
Interest: 9063.0
Account No: 2347566
Balance: 109763.0

Current Account
Deposited: 1000.0
Overdraft limit exceeded
Account No: 44564
Balance: 1300.0
