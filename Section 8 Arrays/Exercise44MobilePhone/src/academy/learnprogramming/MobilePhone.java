package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
             myContacts.add(contact);
             return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position == -1) {
            return false;
        }

        myContacts.set(position, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position == -1) {
            return false;
        }

        myContacts.remove(contact);
        return true;
    }

    private int findContact(Contact contact) {
        for (int i=0; i <= myContacts.size()-1; i++) {
            if (myContacts.get(i).getName().equals(contact.getName())) {
                return i;
            }
        }

        return -1;
    }

    private int findContact(String name) {
        for (int i=0; i <= myContacts.size()-1; i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public Contact queryContact(String name) {
        for (int i=0; i <= myContacts.size()-1; i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return myContacts.get(i);
            }
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i=0; i <= myContacts.size()-1; i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
