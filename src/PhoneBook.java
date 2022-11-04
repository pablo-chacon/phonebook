import contactDB.Address;
import contactDB.Contact;
import contactDB.Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PhoneBook implements Crud {

    static public List<HashMap<String, String>> phoneBook = new ArrayList<>();
    static public Scanner sc = new Scanner(System.in);


    public void defaultContact(){
        HashMap<String,String> defualtContact = new HashMap<>();
        defualtContact.put("First Name","Marcus");
        defualtContact.put("Last Name", "Groth");
        defualtContact.put("Age", "23");
        defualtContact.put("Phone", "1");
        defualtContact.put("Street Address", "Skolvägen");
        defualtContact.put("Street Number", "6");
        defualtContact.put("Country","Sweden");
        defualtContact.put("Zip Code", "496367");
        phoneBook.add(defualtContact);
    }


    @Override
    public void addContact() {
        Contact contactInfo = new Contact.ContactBuilder("foo", "bar", "age", "07775500022")
                .fName()
                .lName()
                .age()
                .phoneNo()
                .build();

        Address addressInfo = new Address.AddressBuilder("Street", "num", "county", "zip")
                .streetAddress()
                .streetNum()
                .county()
                .zipCode()
                .build();

        HashMap<String,String> contact = new HashMap<>();
        contact.put("First Name",contactInfo.getFirstName());
        contact.put("Last Name",contactInfo.getLastName());
        contact.put("Age",contactInfo.getAge());
        contact.put("Phone",contactInfo.getPhoneNo());
        contact.put("Street Address",addressInfo.getStreetAddress());
        contact.put("Street Number",addressInfo.getStreetNum());
        contact.put("Country",addressInfo.getCounty());
        contact.put("Zip Code",addressInfo.getZipCode());

        for (int i = 0; i <phoneBook.size() ; i++) {

            if (phoneBook.get(i).get("Phone").equals(contact.get("Phone"))){
                System.out.println("Phone Number already exist in List");
                break;

            }else {
                phoneBook.add(contact);
            }
        }
        printAllContacts();
    }

    static public void printAllContacts(){
        System.out.println();
        for (int i = 0; i < phoneBook.size() ; i++) {
            HashMap contact = phoneBook.get(i);
            System.out.println(contact);
        }
    }

    @Override
    public void readAll() {

    }

    @Override
    public void readContact() {

    }

    @Override
    public void updateContact() {

    }

    @Override
    public void deleteContact() {

    }
}
