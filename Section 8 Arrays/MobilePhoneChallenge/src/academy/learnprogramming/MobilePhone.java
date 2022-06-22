package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void printContacts() {
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName() + " Phone number: " + contact.getPhoneNumber());
        }
    }

    public void addContact() {
        System.out.println("Please provide the following");
        System.out.print("Contact name: ");
        String name = scanner.nextLine();
        System.out.print("Contact phone number: ");
        String phoneNumber = scanner.nextLine();

        if (findContactByName(name) != null) {
            System.out.println("This contact already exists");
        } else {
            Contact newContact = new Contact(name, phoneNumber);
            contacts.add(newContact);
            System.out.println("Contact added");
        }
    }

    public void editContact() {
        System.out.print("Please enter the name of the contact you wish to edit: ");
        String nameToChange = scanner.nextLine();

        Contact contact = findContactByName(nameToChange);
        if (contact == null) {
            System.out.println("No contact with the name " + nameToChange + " found");
        } else {
            System.out.print("Please enter an updated name:");
            String name = scanner.nextLine();
            System.out.print("Please enter an updated number: ");
            String phoneNumber = scanner.nextLine();

            contact.setName(name);
            contact.setPhoneNumber(phoneNumber);
        }
    }

    public void deleteContact() {
        System.out.print("Please enter the name of the contact you wish to delete: ");
        String name = scanner.nextLine();

        Contact contact = findContactByName(name);
        if (contact == null) {
            System.out.println("No contact with the name " + name + " found");
        } else {
            contacts.remove(contact);
            System.out.println("Contact removed");
        }
    }

    public void findContact() {
        System.out.print("Please enter the name of the contact you wish to find: ");
        String name = scanner.nextLine();

        Contact contact = findContactByName(name);
        if (contact == null) {
            System.out.println("No contact with the name " + name + " found");
        } else {
            System.out.println("Name: " + contact.getName() + " Phone number: " + contact.getPhoneNumber());
        }
    }

    private Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

}
