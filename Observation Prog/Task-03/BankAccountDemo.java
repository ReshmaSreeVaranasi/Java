package javacore;

class Account {
    int accountNumber;
    String holderName;
    double balance;
    String accountType;

    Account(int number, String name, double balance, String type) {
        accountNumber = number;
        holderName = name;
        this.balance = balance;
        accountType = type;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful");
            return true;
        }

        System.out.println("Insufficient balance");
        return false;
    }

    void transfer(Account receiver, double amount) {
        if (receiver == null || receiver == this) {
            System.out.println("Invalid receiver");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid transfer amount");
            return;
        }

        if (withdraw(amount)) {
            receiver.deposit(amount);
            System.out.println("Transfer successful");
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int number, String name, double balance,
                   double rate) {
        super(number, name, balance, "Savings");
        interestRate = rate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest: " + interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int number, String name, double balance,
                   double limit) {
        super(number, name, balance, "Current");
        overdraftLimit = limit;
    }

    @Override
    boolean withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful");
            return true;
        }

        System.out.println("Overdraft limit exceeded");
        return false;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(
                101, "Suresh", 10000, 5);

        CurrentAccount c = new CurrentAccount(
                102, "Ramesh", 5000, 2000);

        System.out.println("Before Transactions");
        s.displayAccountDetails();
        c.displayAccountDetails();

        System.out.println("\nTransactions");

        s.deposit(2000);
        s.withdraw(1000);
        s.calculateInterest();

        c.deposit(3000);
        c.withdraw(7000);

        s.transfer(c, 2000);

        System.out.println("\nAfter Transactions");
        s.displayAccountDetails();
        c.displayAccountDetails();
    }
}
/*
Output
    Before Transactions
Account Number: 101
Holder Name: Suresh
Account Type: Savings
Balance: 10000.0
Account Number: 102
Holder Name: Ramesh
Account Type: Current
Balance: 5000.0

Transactions
Deposit successful
Withdrawal successful
Interest: 550.0
Deposit successful
Withdrawal successful
Withdrawal successful
Deposit successful
Transfer successful

After Transactions
Account Number: 101
Holder Name: Suresh
Account Type: Savings
Balance: 9550.0
Account Number: 102
Holder Name: Ramesh
Account Type: Current
Balance: 8000.0
