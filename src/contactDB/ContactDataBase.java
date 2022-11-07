package contactDB;

import java.util.ArrayList;
import java.util.List;

public class ContactDataBase implements DataBase<Contact> {

    private List<Contact> contacts = new ArrayList<>();

    public ContactDataBase() {
        /*contacts.add(new Contact("Surname", "Family name", "Age", "Phone",
                "Street", "Number",
                "County", "Zip"));*/
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
