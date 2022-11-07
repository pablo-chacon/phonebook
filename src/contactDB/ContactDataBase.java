package contactDB;

import java.util.ArrayList;
import java.util.List;

public class ContactDataBase implements DataBase<Contact> {

    private List<Contact> contacts = new ArrayList<>();

    public ContactDataBase() {
//        contacts.add(new Contact("Surname", "Family name", "Age", "Phone",
//                "Street", "Number",
//                "County", "Zip"));

    }

    @Override
    public Contact getContact(long id) {
        return contacts.get((int)id);
    }

    @Override
    public List<Contact> getAll() {
        return contacts;
    }

//    public void printOutContacts(){
//
//            System.out.println(contact.getFname());
//            System.out.println(contact.getLname());
//            System.out.println(contact.getAge());
//
//    }

    @Override
    public Contact addContact(Contact contact) {
        contact.setId(contacts.size()+1);
        contacts.add(contact);
        return contact;
    }

    @Override
    public void update(Contact contact, String[] params) {
        contact.setFname();
        contact.setStreetAddress();
        contact.setPhone();

        contacts.add(contact);
    }

    @Override
    public void delete(Contact contact) {
        contacts.remove(contact);
    }
}