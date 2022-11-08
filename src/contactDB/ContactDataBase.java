package contactDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactDataBase implements DataBase<Contact>, Search {
    static public Scanner sc = new Scanner(System.in);

    private List<Contact> contacts = new ArrayList<>();

    public ContactDataBase() {
        storingDefaultContacts();
    }

    public void storingDefaultContacts() {
        Contact contact1 = new Contact(0, "Marcus", "Groth", "23", "0845678954",
                "Skolvägen", "3", "Country", "09854");
        Contact contact2 = new Contact(1, "Lisa", "Groth", "23", "0845678954",
                "Marcusvägen", "3", "Country", "09854");
        Contact contact3 = new Contact(2, "lasse", "Marcusson", "23", "0845678954",
                "Skolvägen", "3", "Country", "09854");
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
    }

    @Override
    public void searchByFirstName() {
        System.out.print("Enter a first name: ");
        String userInput = sc.next();


        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            String firstName = contact.getFname();

            if (userInput.equals(firstName)) {
                System.out.println("[" + (1+i) + "]" + contact);
            }
        }
    }

    @Override
    public void searchByLastName() {
        System.out.print("Enter a last name: ");
        String userInput = sc.next();
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            String lastName = contact.getLname();


            if (userInput.equals(lastName)) {
                System.out.println("[" + (1+i) + "]" + contact);
            }
        }
    }

    @Override
    public void searchByAddress() {
        System.out.print("enter a Address: ");
        String userInput = sc.next();

        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            String address = contact.getStreetAddress();

            if (userInput.equals(address)) {
                System.out.println("[" + (1+i) + "]" + contact);
            }
        }
    }

    @Override
    public void freeSearch() {
        System.out.print("enter a free search: ");
        String userInput = sc.next();
        int letters = userInput.length();

        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);

            for (int j = 0; j < 8; j++) {
                String text = contact.groupOfStrings().get(j);
                try {
                    text = text.substring(0, letters);

                } catch (StringIndexOutOfBoundsException ignored) {

                }
                if (userInput.equals(text)) {
                    System.out.println("[" + (1+i) + "]" + contact);
                }
            }
        }
    }

    @Override
    public Contact getContact(int id) {
        return contacts.get(id);
    }

    @Override
    public List<Contact> getAll() {
        return contacts;
    }

    @Override
    public Contact addContact(Contact contact) {
        contacts.add(contact);
        return contact;
    }

    @Override
    public void update(Contact contact, String[] params) {
        contact.setFname();
        contact.setLname();
        contact.setPhone();
        contact.setStreetAddress();
        contact.setStreetNum();
        contact.setCounty();
        contact.setZipCode();
        contacts.add(contact);
    }

    @Override
    public void delete(Contact contact) {
        contacts.remove(contact);
    }
}
