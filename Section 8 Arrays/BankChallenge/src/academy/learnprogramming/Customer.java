package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initialTransaction);
        System.out.println("Customer " + name + " added with amount " + initialTransaction);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public void printName() {
        System.out.println("Customer name: " + this.name);
    }

    public void printTransactions() {
        System.out.println("Transactions:");
        for (Double transaction : this.transactions) {
            System.out.println("\t" + transaction);
        }
    }

    public String getName() {
        return name;
    }
}
