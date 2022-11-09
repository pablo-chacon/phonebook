import contactDB.Contact;
import contactDB.*;

import java.util.*;

public class Application {
    static public Scanner sc = new Scanner(System.in);
    static public ContactDataBase contactdb = new ContactDataBase();
    public static void main(String[] args) {


        printMainMenu();
        String userInput = askUserForInput();

        if (userInput.equals("1")) {
            confirmPassword();
        }

        while (true) {

            if (userInput.equals("1")) {
                runAsAdmin();
            } else if (userInput.equals("2")) {
                runAsGuest();
            } else if (userInput.equals("3")) {
                System.out.println("Shutting down");
                System.exit(0);
            }
        }
    }

    static public void runAsAdmin() {

        //Log in as Admin
        printOutUserOptions("Select one of following options",
                Arrays.asList("Create Contacts", "Read Contacts"));
       String userInput = askUserForInput();

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

            // User enter wrong input
        } else if(!userInput.equals("3")) {
            System.out.println("\nInvalid input");
        }
    }

    static public void runAsGuest() {
        printOutUserOptions("Select one of following options",
                Arrays.asList("Create Contacts", "Read Contacts"));
        String userInput = askUserForInput();

        // Create Contact
        if (userInput.equals("1")) {
            contactdb.addContact();

            // Read Contact
        } else if (userInput.equals("2")) {
            printOutSearchOptions();
            contactdb.readContacts(askUserForInput());

            // User enter wrong input
        } else {
            System.out.println("\nInvalid input");
        }
    }

    static public String askUserForInput() {

        System.out.print("Input: ");
        String userInput = sc.next();

        if (userInput.equals("quit")) {
            main(null);
        }
        return userInput;
    }

    static public void printMainMenu() {
        System.out.println("""
                Log in as
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

    static public void printOutSearchOptions() {
        System.out.println(); // newLine
        System.out.println("""
                [1] Search by first name
                [2] Search by last name
                [3] Search by Street address
                [4] Free search
                """);
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
}

