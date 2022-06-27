package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransactions) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initialTransactions);
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
