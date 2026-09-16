
package javacore;

interface PaymentService {
    void pay(String upi, double amount)
            throws InvalidUPIException, InvalidAmountException,
            InsufficientBalanceException;

    void checkBalance();
}

// Custom exceptions
class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Wallet class
class Wallet {
    private String name;
    private String mobile;
    private String upi;
    private double balance;

    Wallet(String name, String mobile, String upi, double balance) {
        this.name = name;
        this.mobile = mobile;
        this.upi = upi;
        this.balance = balance;
    }

    public void addMoney(double amount)
            throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }

        balance = balance + amount;
        System.out.println("Money added successfully");
    }

    public double getBalance() {
        return balance;
    }

    public void deductMoney(double amount) {
        balance = balance - amount;
    }

    public void displayWalletDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("UPI ID: " + upi);
        System.out.println("Balance: Rs." + balance);
    }
}

// Payment class
class UPIPayment implements PaymentService {
    private Wallet wallet;

    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    public void pay(String upi, double amount)
            throws InvalidUPIException, InvalidAmountException,
            InsufficientBalanceException {

        if (upi == null || !upi.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9]+")) {
            throw new InvalidUPIException("Invalid UPI ID");
        }

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }

        if (wallet.getBalance() < amount) {
            throw new InsufficientBalanceException(
                    "Insufficient balance");
        }

        wallet.deductMoney(amount);

        System.out.println("Payment successful");
        System.out.println("Paid to: " + upi);
        System.out.println("Amount: Rs." + amount);
    }

    public void checkBalance() {
        System.out.println("Balance: Rs." + wallet.getBalance());
    }
}

// Main class
public class UpiPayment {
    public static void main(String[] args) {

        Wallet w = new Wallet(
                "Rahul", "9876543210", "rahul@okaxis", 5000);

        UPIPayment p = new UPIPayment(w);

        try {
            w.addMoney(1000);
            p.checkBalance();
            p.pay("sneha@ybl", 2000);
        }
        catch (InvalidUPIException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction completed");
            w.displayWalletDetails();
        }
    }
}
