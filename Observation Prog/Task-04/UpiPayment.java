// PaymentService Interface
interface PaymentService {

    void pay(String upiId, double amount);

    void checkBalance();
}


// Custom Exception for insufficient balance
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}


// Custom Exception for invalid UPI ID
class InvalidUPIException extends Exception {

    public InvalidUPIException(String message) {
        super(message);
    }
}


// Custom Exception for invalid amount
class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }
}


// Wallet Class
class Wallet {

    // Private data members to demonstrate encapsulation
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor
    public Wallet(String userName, String mobileNumber, String upiId) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = 0.0;
    }

    // Method to add money
    public void addMoney(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Money added successfully: ₹" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }

    // Method to deduct money
    public void deductMoney(double amount) {
        balance = balance - amount;
    }

    // Method to display wallet details
    public void displayWalletDetails() {

        System.out.println("\n----- Wallet Details -----");
        System.out.println("User Name    : " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("UPI ID       : " + upiId);
        System.out.println("Balance      : ₹" + balance);
    }
}


// UPI Payment Class
class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Constructor
    public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Pay method
    @Override
    public void pay(String upiId, double amount) {

        try {

            // Validate UPI ID
            if (upiId == null ||
                !upiId.contains("@") ||
                upiId.startsWith("@") ||
                upiId.endsWith("@")) {

                throw new InvalidUPIException(
                    "Invalid UPI ID: " + upiId
                );
            }

            // Validate payment amount
            if (amount <= 0) {

                throw new InvalidAmountException(
                    "Payment amount must be greater than zero."
                );
            }

            // Check sufficient balance
            if (amount > wallet.getBalance()) {

                throw new InsufficientBalanceException(
                    "Insufficient balance for this payment."
                );
            }

            // Deduct payment amount
            wallet.deductMoney(amount);

            System.out.println("\nPayment Successful!");
            System.out.println("Receiver UPI ID: " + upiId);
            System.out.println("Amount Paid     : ₹" + amount);

        }

        catch (InvalidUPIException e) {

            System.out.println("Transaction Failed: "
                               + e.getMessage());

        }

        catch (InvalidAmountException e) {

            System.out.println("Transaction Failed: "
                               + e.getMessage());

        }

        catch (InsufficientBalanceException e) {

            System.out.println("Transaction Failed: "
                               + e.getMessage());

        }

        finally {

            System.out.println("Transaction processing completed.");
        }
    }


    // Check balance method
    @Override
    public void checkBalance() {

        System.out.println(
            "Available Wallet Balance: ₹"
            + wallet.getBalance()
        );
    }
}


// Main Class
public class UpiPayment {

    public static void main(String[] args) {

        // Create Wallet object
        Wallet wallet = new Wallet(
            "Lalitha",
            "987673210",
            "lalitha@upi"
        );

        // Display initial wallet details
        wallet.displayWalletDetails();

        // Add money to wallet
        wallet.addMoney(5000);

        // Create UPI Payment object
        PaymentService payment = new UPIPayment(wallet);

        // Check balance
        payment.checkBalance();

        // Make a valid payment
        System.out.println("\n--- Valid Payment ---");
        payment.pay("rahul@upi", 1500);

        // Check balance after payment
        payment.checkBalance();

        // Invalid UPI test
        System.out.println("\n--- Invalid UPI Test ---");
        payment.pay("rahulupi", 500);

        // Invalid amount test
        System.out.println("\n--- Invalid Amount Test ---");
        payment.pay("rahul@upi", -100);

        // Insufficient balance test
        System.out.println("\n--- Insufficient Balance Test ---");
        payment.pay("rahul@upi", 5000);

        // Display final wallet details
        wallet.displayWalletDetails();
    }
}

/*Output:
----- Wallet Details -----
User Name    : Lalitha
Mobile Number: 9876732100
UPI ID       : lalitha@upi
Balance      : ₹0.0
Money added successfully: ₹5000.0
Available Wallet Balance: ₹5000.0

--- Valid Payment ---

Payment Successful!
Receiver UPI ID: rahul@upi
Amount Paid     : ₹1500.0
Transaction processing completed.
Available Wallet Balance: ₹3500.0

--- Invalid UPI Test ---
Transaction Failed: Invalid UPI ID: rahulupi
Transaction processing completed.

--- Invalid Amount Test ---
Transaction Failed: Payment amount must be greater than zero.
Transaction processing completed.

--- Insufficient Balance Test ---
Transaction Failed: Insufficient balance for this payment.
Transaction processing completed.

----- Wallet Details -----
User Name    : Lalitha
Mobile Number: 9876732100
UPI ID       : lalitha@upi
Balance      : ₹3500.0
  */
