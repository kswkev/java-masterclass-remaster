package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
        System.out.println("Branch with name " + name + " created");
    }

    public void addCustomer(String name, double initialTransaction) {
        if (!customerExists(name)) {
            Customer newCustomer = new Customer(name, initialTransaction);
            customers.add(newCustomer);
            System.out.println("Customer added");
        } else {
            System.out.println("Customer with name " + name + " already exists.");
        }
    }

    public void addTransaction(String name, double transaction) {
        if (customerExists(name)) {
            Customer customer = findCustomer(name);
            customer.addTransaction(transaction);
            System.out.println("Transaction added");
        } else {
            System.out.println("No customer with name " + name + " found at branch " + this.name);
        }
    }

    public void printCustomerList(boolean withTransaction) {
        System.out.println("Customer list:");
        for (Customer customer : this.customers) {
            customer.printName();
            if (withTransaction) {
                customer.printTransactions();
            }
        }
    }

    private boolean customerExists(String name) {
        if (findCustomer(name) == null) {
            return false;
        } else {
            return true;
        }
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }
}
