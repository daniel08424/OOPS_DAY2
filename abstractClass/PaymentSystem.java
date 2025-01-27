package oops_concepts.abstractClass;

public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment("12345678", "John", "12/23", "123");
        Payment payment2 = new DebitCardPayment("87654321", "Jane", "11/22", "4567");
        Payment payment3 = new PayPalPayment("jane@example.com", "password123");

        payment1.processPayment(100.0);
        payment2.processPayment(200.0);
        payment3.processPayment(150.0);
    }
}
abstract class Payment {
    public abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
class DebitCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String pin;

    public DebitCardPayment(String cardNumber, String cardHolderName, String expiryDate, String pin) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.pin = pin;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing debit card payment of $" + amount);
    }
}
class PayPalPayment extends Payment {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

