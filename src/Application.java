import contactDB.Contact;
import contactDB.*;

import java.util.HashMap;
import java.util.Scanner;

public class Application {

    private static DataBase<Contact> contactdb;
    //static public List<HashMap<Contact,Address>> phoneBook = new ArrayList<>();

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String[] inputParams = new String[]{sc.next()};
        contactdb = new ContactDataBase();
        Contact contact = contactdb.addContact(new Contact(inputParams.toString()));


        /*"First Name", "Last name", "Age",
                "Phone number", "Street", "Number", "County", "Zip code"*/
        // get by first name, loop through.
        contactdb.getAll().forEach(contacts -> System.out.println(contact.getFname()));
        // Last name,
        contactdb.getAll().forEach(contacts -> System.out.println(contact.getLname()));
        // Street address,
        contactdb.getAll().forEach(contacts -> System.out.println(contact.getStreetAddress()));
        // Phone.
        contactdb.getAll().forEach(contacts -> System.out.println(contact.getPhone()));
        // Update contact by parameters Array.
        contactdb.update(contact, new String[]{"firstname", "lname", "age", "077005485", "street", "num", "county", "zip"});
        System.out.println(contact.getFname());

        System.out.println(contactdb.getContact(0));
        System.out.println(contactdb.getAll());

        contactdb.delete(contact);


    // Start of the program

    boolean isRunning = true;

        while(isRunning){

    }

    {
        printOutMainMenu();
        String userInput = askUserForInput();
        //Log in as Admin
        if (userInput.equals("1")) {
            confirmPassword();
            printOutAdminOptions();
            userInput = askUserForInput();
            if (userInput.equals("1")) {
                //Create
                while (true) {
                    System.out.println("Create Contact (y/n)");
                    userInput = askUserForInput();
                    if (userInput.equals("y")) {
//                        HashMap contact = createContact();
//                        phoneBook.add(contact);
//                        printAllContacts();
                    } else {
                        break;
                    }
                }
                // ask user to input: firstName, surname, contactAge, adress, phone-number
                // if phone-number is not similar to a phone-number already exist in phone book
                //add new contact to phone book
                // else
                // deny the request and print out an error messages
            } else if (userInput.equals("2")) {
                // read contacts
                String input = askUserForInput();
            } else if (userInput.equals("3")) {
                //Update - att kunna uppdatera en profils kontaktuppgifter
            } else if (userInput.equals("4")) {
                //Delete - att kunna ta bort en profil
            } else if (userInput.equals("5")) {
                //Go backward to previous menu
            }
            //Log in as Guest
        } else if (userInput.equals("2")) {
            printOutGuestOptions();
            userInput = askUserForInput();
            if (userInput.equals("1")) {
                //Create a contact
            } else if (userInput.equals("2")) {
                //Read contacts
                String input = askUserForInput();
            } else if (userInput.equals("3")) {
                //Go backward to previous menu
            }
            // Exit Program
        } else if (userInput.equals("3")) {
            isRunning = false;
            System.out.println("\nHave a nice day my friend");
        }
    }
    }
    // End of the program


    static public void printOutMainMenu() {
        System.out.println("""
                Select one of following options
                [1] Login as Admin
                [2] Login as Guest
                [3] Exit
                """);
    }

    static public String askUserForInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        return sc.nextLine();
    }

    static public void printOutAdminOptions() {
        System.out.println("""
                \nSelect one of following options
                [1] Create contact
                [2] Read contact
                [3] Update contact
                [4] Delete contact
                [5] Go back
                """);
    }

    static public void printOutGuestOptions() {
        System.out.println("""
                \nSelect one of following options
                [1] Create contact
                [2] Read contact
                [3] Go back
                """);
    }

    public static void confirmPassword() {
        Scanner scanner = new Scanner(System.in);
        String userName = "Admin";
        String password = "1234";
        System.out.print("Please enter your user name: ");
        String inputUserName = scanner.nextLine();
        System.out.print("Please enter your password: ");
        String inputPassword = scanner.nextLine();
        if (inputUserName.equalsIgnoreCase(userName) && (inputPassword.equals(password))) {
            System.out.println("You are logged in");
        } else {
            System.out.println("Invalid user name or password");
        }
    }

    // public ContactDB findContactDB(int phoneNo) {
//    for (ContactDB l: list) {
//    if(l.getPhoneNo() == phoneNo) {
//    return l;
//    }
//    }
//    return null;
//}
//
//public void updateContact(int phoneNo) {
//        if(find(phoneNo)) {
//            ContactDB c = findContactDB(phoneNo);
//
//            System.out.print("Write contact's new first name: ");
//            String firstName = scanner.nextLine();
//
//            System.out.print("Write contact's new last name: ");
//            String lastName = scanner.nextLine();
//
//            System.out.print("Write contact's new age: ");
//            int age = scanner.nextInt();
//
//            System.out.print("Write contact's new address: ");
//            String address = scanner.nextLine();
//
//            System.out.print("Write contact's new phone number: ");
//            String phoneNo = scanner.nextLine();
//
//            c.setFirstName(firstName);
//            c.setLastName(lastName);
//            c.setAge(age);
//            c.setAddress(address);
//            c.setPhoneNo(phoneNo);
//            System.out.println("Contact updated successfully");
//        } else {
//            System.out.print("Contact not found");
//
//        }
//    }
//    static public HashMap createContact() {
//        Contact contactInfo = new Contact.ContactBuilder("Marcus", "Groth",
//                2, "4535353", "", "", "")
//                .fName("foo")
//                .lName("bar")
//                .age(4)
//                .streetAddress("bargatan")
//                .streetNum("23")
//                .county("lään")
//                .zipCode("111222")
//                .build();
//        /*Address addressInfo = new Address.AddressBuilder("Skolvägen", "6", "Sweden", "98432")


        /*LinkedHashMap<String, String> contact = new LinkedHashMap<>();
        contact.put("First Name", contactInfo.getFirstName());
        contact.put("Last Name", contactInfo.getLastName());
        contact.put("Age", contactInfo.getAge());
        contact.put("Phone", contactInfo.getPhoneNo());
        contact.put("StreetAddress ", contactInfo.streetAddress + contactInfo.streetNum);
        contact.put("Country", contactInfo.county);
        contact.put("Zip Code", contactInfo.zipCode);
        HashMap<String, Contact> contact = new HashMap<>();
        contact.put("Test ", contactInfo);
        return contact;
    }
    static public void printAllContacts(){
        System.out.println();
        for (int i = 0; i < phoneBook.size() ; i++) {
            HashMap contact = phoneBook.get(i);
            System.out.println(contact);
        }
    }
    static public void removeContact(){
         int input = Integer.parseInt(askUserForInput());
         phoneBook.remove(input);
    }*/


    }


