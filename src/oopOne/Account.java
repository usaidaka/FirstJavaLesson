package oopOne;

public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

//    constructor
    public Account () {
        this(50, 50.0, "lol own", "lol@gmail", "(089) 000-000"); // <- harus di line pertama
        System.out.println("empty constructor");
    }

    public Account(int accountNumber, double balance, String name, String email, String phoneNumber) {
        // constructor bisa di overloading
        System.out.println("account constructor with parameter called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public static void main(String[] args) {

    }

    public void depositingFunds (double depositAmount) {
        balance += depositAmount;
        System.out.println("deposit of $" + depositAmount + " made. new balace is " + this.balance);
    }

    public void withdrawingFunds (double withdrawalAmout) {
        if (balance - withdrawalAmout < 0) {
            System.out.println("Insufficient funds! you only have $" + balance + " in your account");
        } else {
            balance -= withdrawalAmout;
            System.out.println("withdrawal of $" + withdrawalAmout + " processed, remaining balance = $" + balance );
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName () {
        return name;
    }

    public String getEmail () {
        return email;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
