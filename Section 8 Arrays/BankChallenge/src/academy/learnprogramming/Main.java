package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank;

    public static void main(String[] args) {

        System.out.println("Please enter a name for your bank");
        String bankName = scanner.nextLine();
        bank = new Bank(bankName);

        int selectedOption = -1;
        printOptions();
        while (selectedOption != 9) {
            System.out.println("Please enter an option:");
            selectedOption = scanner.nextInt();
            scanner.nextLine();

            switch (selectedOption) {
                case 1:
                    printOptions();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    addTransaction();
                    break;
                case 5:
                    printCustomers();
                    break;
                case 6:
                    printBranches();
                    break;
                case 9:
                    break;
            }

            System.out.println("");
        }

    }

    private static void printOptions() {
        System.out.println("1 - print options");
        System.out.println("2 - add branch");
        System.out.println("3 - add customer");
        System.out.println("4 - add transaction to customer");
        System.out.println("5 - print customers for branch");
        System.out.println("6 - print branches");
        System.out.println("9 - exit system");
    }

    private static void addBranch() {
        System.out.println("Please enter a branch name:");
        String branchName = scanner.nextLine();
        bank.addBranch(branchName);
    }

    private static void addCustomer() {
        System.out.println("Please enter the following:");
        System.out.println("Customer's name:");
        String customerName = scanner.nextLine();
        System.out.println("Initial customer amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Add customer to which branch: ");
        String branchName = scanner.nextLine();

        bank.addCustomerToBranch(customerName, branchName, amount);
    }

    private static void addTransaction() {
        System.out.println("Please enter the following:");
        System.out.println("Customer's name:");
        String customerName = scanner.nextLine();
        System.out.println("Transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Branch name: ");
        String branchName = scanner.nextLine();

        bank.addTranascationToCusomerAtBranch(amount, customerName, branchName);
    }

    private static void printCustomers() {
        System.out.println("Please enter the branch name:");
        String branchName = scanner.nextLine();
        System.out.println("Print transactions? y/n");
        String withTranscations = scanner.nextLine();

        if (withTranscations.toLowerCase().equals("y")) {
            bank.printCustomerListForBranch(branchName, true);
        } else {
            bank.printCustomerListForBranch(branchName, false);
        }
    }

    private static void printBranches() {
        bank.printBranchList();
    }
}
