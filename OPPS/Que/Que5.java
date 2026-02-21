/*
Question:

Create:

An abstract class BankAccount

Private variable: balance

Method: deposit()

Abstract method: withdraw()

Create subclasses:

SavingsAccount

CurrentAccount

Implement withdrawal rules:

Savings → Cannot withdraw more than balance

Current → Can withdraw with overdraft limit of 5000

👉 Focus:

Abstract class

Encapsulation (private + getter/setter)

Method overriding

Business logic */

public class Que5 {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount();
        b1.setBalance(5000);
        System.out.println("Initial Balance: " + b1.getBalance());

        b1.deposit(1000);
        System.out.println("After Deposit: " + b1.getBalance());

        b1.withdrawal(1200);
        System.out.println("After Withdrawal: " + b1.getBalance());

    }
}

abstract class BankAccount {

    private double balance;

    void deposit(double amount) {
        this.balance += amount;
        System.out.println("DEPOSITED AMOUNT IS : " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract void withdrawal(double amount);

}

class SavingsAccount extends BankAccount {

    void withdrawal(double amount) {
        if (amount > getBalance()) {
            System.out.println("ERORR! Insufficient balance");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("WITHDRAWAL AMOUNT IS : " + amount);
        }
    }
}

class CurrentAccount extends BankAccount {
    void withdrawal(double amount) {

        if (amount <= getBalance() + 5000) {
            System.out.println("Withdrawal Amount is : " + amount);
            setBalance(getBalance() - amount);
            System.out.println("BALANCE IS : " + getBalance());

        } else {
            System.out.println("ERORR! Insufficient balance");
        }
    }

}