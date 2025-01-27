package oops_concepts.Inheritance2;

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0);
        account.display();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.display();
        account.getName();
        account.getBalance();
    }
}
class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + name + ", Balance: " + balance);
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}

