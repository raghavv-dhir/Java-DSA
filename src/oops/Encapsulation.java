package oops;

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000.0); // Create a new bank account with an initial balance
        acc.deposit(500);
        System.out.println("Balance: "+acc.getBalance());
    }
}

class BankAccount{
    private double balance;

    BankAccount(double balance
    ) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
}

/*
Encapsulation in Java

Think of it as putting all your data and the methods that operate on it into one secure box and giving people controlled access to that box.

Definition

Wrapping data (variables) and code (methods) into a single unit (class).

Restricting direct access to data and exposing it only through getter and setter methods.

Key Points

Achieved using:

Private variables (hide the data)

Public getter/setter methods (controlled access)

Improves data security and code maintainability.

You control who can read/write your data.>
 */
