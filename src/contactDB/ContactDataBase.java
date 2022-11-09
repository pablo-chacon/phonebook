package contactDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactDataBase implements DataBase<Contact>, Search {
    static public int id = 2;
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

        while (true) {

            boolean findContent = false;
            List<Contact> findContacts = new ArrayList<>();

            System.out.print("Enter a first name: ");
            String userInput = sc.next().toLowerCase();

            for (int i = 0; i < contacts.size(); i++) {

                Contact contact = contacts.get(i);
                String firstName = contact.getFname().toLowerCase();

                if (userInput.equals(firstName)) {

                    int id = contact.getId();
                    Contact findContact = contacts.get(id);
                    findContacts.add(findContact);
                }
            }
            if (findContacts.isEmpty()) {
                System.out.println("Invalid search");
            } else {
                for (Contact findContact : findContacts) {
                    int id = findContact.getId();
                    System.out.println("[" + (id) + "] " + findContact);
                }

                break;
            }
        }


    }

    @Override
    public void searchByLastName() {

        while (true) {

            List<Contact> findContacts = new ArrayList<>();
            System.out.print("Enter a last name: ");
            String userInput = sc.next().toLowerCase();

            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                String lastName = contact.getLname().toLowerCase();


                if (userInput.equals(lastName)) {
                    int id = contact.getId();
                    Contact findContact = contacts.get(id);
                    findContacts.add(findContact);
                }
            }

            if (findContacts.isEmpty()) {
                System.out.println("Invalid search");
            } else {
                for (Contact findContact : findContacts) {
                    int id = findContact.getId();
                    System.out.println("[" + (id) + "] " + findContact);
                }

                break;
            }
        }


    }

    @Override
    public void searchByAddress() {

        while (true) {

            List<Contact> findContacts = new ArrayList<>();
            System.out.print("enter a Address: ");
            String userInput = sc.next().toLowerCase();

            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                String address = contact.getStreetAddress().toLowerCase();

                if (userInput.equals(address)) {
                    int id = contact.getId();
                    Contact findContact = contacts.get(id);
                    findContacts.add(findContact);
                }
            }
            if (findContacts.isEmpty()) {
                System.out.println("Invalid search");
            } else {
                for (Contact findContact : findContacts) {
                    int id = findContact.getId();
                    System.out.println("[" + (id) + "] " + findContact);
                }

                break;
            }
        }
    }

    @Override
    public void freeSearch() {

        while (true) {
            List<Contact> findContacts = new ArrayList<>();
            System.out.print("enter a free search: ");
            String userInput = sc.next().toLowerCase();
            int letters = userInput.length();

            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);

                for (int j = 0; j < 8; j++) {

                    String text = contact.groupOfStrings().get(j).toLowerCase();
                    try {
                        text = text.substring(0, letters);

                    } catch (StringIndexOutOfBoundsException ignored) {

                    }
                    if (userInput.equals(text)) {
                        int id = contact.getId();
                        Contact findContact = contacts.get(id);
                        findContacts.add(findContact);
                    }
                }

            }
            if (findContacts.isEmpty()) {
                System.out.println("Invalid search");
            } else {
                for (Contact findContact : findContacts) {
                    int id = findContact.getId();
                    System.out.println("[" + (id) + "] " + findContact);
                }

                break;
            }
        }

    }

    public Contact pickContact(){
        System.out.print("Pick a contact: ");
        int id = sc.nextInt();
        return getContact(id);

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
    public void  addContact() {
        while (true) {
            Contact contact = new Contact(id);
            id++;
            contacts.add(contact);
            for (int i = 0; i < contacts.size(); i++) {
                getContact(i);

            }
            System.out.print("\nCreate another Contact (y/n): ");
            String userInput = sc.next();

            if (userInput.equals("n")) {
                break;
            }
        }
    }

    public void readContacts(String choice) {

        if (choice.equals("1")) {
            searchByFirstName();
        } else if (choice.equals("2")) {
            searchByLastName();
        } else if (choice.equals("3")) {
            searchByAddress();
        } else if (choice.equals("4")) {
            freeSearch();
        }
    }


    @Override
    public void update(Contact contact) {

        contact.setFname();
        contact.setLname();
        contact.setAge();
        contact.setPhone();
        contact.setStreetAddress();
        contact.setStreetNum();
        contact.setCounty();
        contact.setZipCode();
    }

    @Override
    public void delete(Contact contact) {
        contacts.remove(contact);
    }
}
