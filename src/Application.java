import contactDB.Contact;
import contactDB.*;

import java.lang.reflect.Array;
import java.util.*;

public class Application {
    static public Scanner sc = new Scanner(System.in);
    static public boolean isRunning = true;

    static public String userInput = "";
    static public ContactDataBase contactdb = new ContactDataBase();


    public static void main(String[] args) {

        printMainMenu();
        userInput = askUserForInput();

        if (userInput.equals("1"))
        {
            confirmPassword();
        }

        while (true){

            if (userInput.equals("1")){
                runAsAdmin();
            } else if (userInput.equals("2")) {
                runAsGuest();
            }else if (userInput.equals("3")){
                break;
            }
        }

        // End of the program
    }

    static public void runAsAdmin() {
        //Log in as Admin

            printOutUserOptions("Select one of following options",
                    Arrays.asList("Create Contacts", "Read Contacts"));
            userInput = askUserForInput();

            // Create Contact
            if (userInput.equals("1")) {
                contactdb.addContact();


                // Read Contact
            } else if (userInput.equals("2")) {

                printOutSearchOptions();
                contactdb.readContacts(askUserForInput());
                Contact contact = contactdb.pickContact();

                printOutUserOptions("Select one of following options"
                        , Arrays.asList("Update Contact", "Delete Contact"));
                userInput = askUserForInput();

                // Update Contact
                if (userInput.equals("1")) {
                    contactdb.update(contact);

                    // Delete Contact
                } else if (userInput.equals("2")) {
                    contactdb.delete(contact);
                }
            }else {
                System.out.println("Invalid input");
                runAsAdmin();
            }
        }

    static public void runAsGuest() {
        //Log in as Admin

            printOutUserOptions("Select one of following options",
                    Arrays.asList("Create Contacts", "Read Contacts"));
            userInput = askUserForInput();

            // Create Contact
            if (userInput.equals("1")) {
                contactdb.addContact();


                // Read Contact
            } else if (userInput.equals("2")) {

                printOutSearchOptions();
                contactdb.readContacts(askUserForInput());

            }else {
                System.out.print("Invalid input");
                runAsGuest();
            }
        }

    static public String askUserForInput() {

        System.out.print("Input: ");
        String userInput = sc.next();
        if (userInput.equals("log out")) {
            main(null);
        }
        return userInput;
    }

    static public void printMainMenu() {
        System.out.println("""
                Login as 
                [1] Admin
                [2] Guest
                [3] Program shut down
                """);
    }

    static public void printOutUserOptions(String title, List<String> options) {
        System.out.println(); // newLine
        System.out.println(title);

        for (int i = 0; i < options.size(); i++) {
            String option = options.get(i);
            System.out.println("[" + (i + 1) + "] " + option);
        }

    }

    public static void confirmPassword() {

        Administrator admin = new Administrator("Admin", "1234");
        String userName = admin.getUserName();
        String password = admin.getPassword();

        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter your user name: ");
            String inputUserName = sc.next();

            System.out.print("Please enter your password: ");
            String inputPassword = sc.next();

            if (inputUserName.equalsIgnoreCase(userName) && (inputPassword.equals(password))) {
                System.out.println("You are logged in");
                break;
            } else if (i > 1) {
                System.out.println();
                main(null);
            } else {
                System.out.println("Invalid user name or password");
            }
        }
    }

    static public void printOutSearchOptions() {
        System.out.println(); // newLine
        System.out.println("""
                [1] Search by first name
                [2] Search by last name
                [3] Search by Street address
                [4] Free search
                """);
    }

    static public void printOutUpdateOptions(){
        System.out.println("""
                [1] first name
                [2] last name
                """);
    }

//    static public void apa(){
//        Contact contact = contactdb.getContact(Integer.parseInt(askUserForInput()));
//        menuUpdateAndRemove();
//        String choice = askUserForInput();
//
//        if (choice.equals("1")){
//            contactdb.update(contactdb.getContact(0), new String[]{"Torsten", "lname", "age", "077005485", "street", "num", "county", "zip"});
//        } else if (choice.equals("2")){
//            contactdb.delete(contact);
//        }
//    }


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
}

