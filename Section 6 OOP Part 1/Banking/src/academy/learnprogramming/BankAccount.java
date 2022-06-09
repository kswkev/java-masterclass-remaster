package academy.learnprogramming;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //0 arg constructor
    public BankAccount() {
        this("Default", 0.00, "Default", "Default", "Default");
    }

    // constructor with args
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + " added to balance, new balance = " + this.balance);
        } else {
            System.out.println("Tried to deposit a negative amount");
        }
    }

    public String toString() {
        return "accountNumber: " + accountNumber + ", balance: " + balance + ", customerName: " + customerName + ", email: " + email + ", phoneNumber: " + phoneNumber;
    }

    public void withdrawFunds(double amount) {
        if (amount > 0) {
            if (this.balance - amount >= 0) {
                this.balance -= amount;
                System.out.println(amount + " withdrawn from balance, new balance = " + this.balance);
            } else {
                System.out.println("Cannot withdraw " + amount + " insufficient funds, balance = " + this.balance);
            }
        } else {
            System.out.println("Tried to withdraw a negative amount");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
