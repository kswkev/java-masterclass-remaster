package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        int selection;
        boolean quit = false;

        while (!quit) {
            printMenu();
            selection = scanner.nextInt();
            System.out.println("");
            switch (selection) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    mobilePhone.printContacts();
                    break;
                case 3:
                    mobilePhone.addContact();
                    break;
                case 4:
                    mobilePhone.editContact();;
                    break;
                case 5:
                    mobilePhone.deleteContact();
                    break;
                case 6:
                    mobilePhone.findContact();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("");
        System.out.println("Please select from one of the following options:");
        System.out.println("\t 1 - Repeat options");
        System.out.println("\t 2 - View contacts");
        System.out.println("\t 3 - Create a contact");
        System.out.println("\t 4 - Edit a contact");
        System.out.println("\t 5 - Delete a contact");
        System.out.println("\t 6 - Find a contact");
        System.out.println("\t 7 - Quit");
    }
}
