import contactDB.Address;
import contactDB.Contact;


import java.util.*;

public class Application {
    static public List<HashMap<Contact, Address>> phoneBook = new ArrayList<>();
    static public PhoneBook database = new PhoneBook();
    static  public boolean isRunning = true;

    public static void main(String[] args) {

        database.defaultContact();
        database.freeSearch();
        System.out.println(); // newLine
        database.printProfile();




//        phoneBook.add(contact1);
//        phoneBook.add(contact2);
//        phoneBook.add(contact3);

//        printAllContacts();
//        System.out.println();


//        System.out.println(whatItIs.get(0) + ": " + contact.get(s.get(0)));


//        for (int i = 0; i < phoneBook.size(); i++) {
//            System.out.println("First Name: " + phoneBook.get(i).get("First Name"));
//            System.out.println("Last Name: " + phoneBook.get(i).get("Last Name"));
//            System.out.println("Age: " + phoneBook.get(i).get("Age"));
//            System.out.println("Phone: " + phoneBook.get(i).get("Phone"));
//            System.out.println("Street Address: " + phoneBook.get(i).get("Street Address"));
//            System.out.println("Country: " + phoneBook.get(i).get("Country"));
//            System.out.println("Zip Code: " + phoneBook.get(i).get("Zip Code"));
//        }

//        boolean running = true;
//        while(running) {
//
//
//            Scanner sc = new Scanner(System.in);
//            HashMap<String, String> contactNum = new HashMap<>();
//            HashMap<String, String> contactAddress = new HashMap<>();
//
//
//            Contact contact1 = new Contact.ContactBuilder("foo", "bar", "age", "07775500022")
//                    .fName(sc.next())
//                    .lName(sc.next())
//                    .age(String.valueOf(sc.next()))
//                    .phoneNo(String.valueOf(sc.next()))
//                    .build();
//
//            contactNum.put(contact1.getPhoneNo(), contact1.toString());
//
//
//            Address address1 = new Address.AddressBuilder("Street", "num", "county", "zip")
//                    .streetAddress(sc.next())
//                    .streetNum(String.valueOf(sc.next()))
//                    .county(sc.next())
//                    .zipCode(String.valueOf(sc.next()))
//                    .build();
//
//            contactAddress.put(contact1.getPhoneNo(), address1.toString());
//
//
//            System.out.println("input");
//            String search = String.valueOf(sc.next());
//
//            System.out.println(contactNum + "\n" + contactAddress.values());
//            System.out.println(contactNum.get(search) + "\n" + contactAddress.values() + "\nKeep going? y/n");
//
//            String quit = sc.next();
//            if (quit.equals("n")) {
//                running = false;
//            }
//
//
//        }
//
//        /*dataBase.addContact("First name", "Last name", "Age", "Address", "Phone");
//        System.out.println("first");
//
//
//        System.out.println("Last");
//        //contact.setLastName(sc.next());
//
//        System.out.println("Age");
//        //contact.setAge(sc.nextInt());
//
//        System.out.println("Street");
//        //address.setStreetAddress(sc.next());
//
//        System.out.println("phone");
//        //contact.setPhoneNo(sc.next());*/
//
//
//
////        new ContactDB()
////                .addContact("First name", "Last name", "Age", "Address", "Phone")
////                .addContact(
////                        contact.getFirstName(), contact.getLastName(),
////                            String.valueOf(contact.getAge()), contact.getAddress(),
////                            contact.getPhoneNo()).print();


//         Start of the program



//        while (isRunning) {
//            printOutMainMenu();
//            String userInput = askUserForInput();
//
//            //Log in as Admin
//            if (userInput.equals("1")) {
//
//                confirmPassword();
//                printOutAdminOptions();
//                userInput = askUserForInput();
//
//                if (userInput.equals("1")) {
//                    while (true) {
//                        System.out.println("Create Contact (y/n)");
//                        userInput = askUserForInput();
//                        if (userInput.equals("y")) {
//                            database.addContact();
//                        } else {
//                            break;
//                        }
//                    }
//
//                } else if (userInput.equals("2")) {
//                    // read contacts
//                } else if (userInput.equals("3")) {
//                    //Update - att kunna uppdatera en profils kontaktuppgifter
//                } else if (userInput.equals("4")) {
//                    //Delete - att kunna ta bort en profil
//                } else if (userInput.equals("5")) {
//                    //Go backward to previous menu
//                }
//                //Log in as Guest
//            } else if (userInput.equals("2")) {
//                printOutGuestOptions();
//                userInput = askUserForInput();
//
//                if (userInput.equals("1")) {
//                    while (true) {
//                        System.out.println("Create Contact (y/n)");
//                        userInput = askUserForInput();
//                        if (userInput.equals("y")) {
//                            database.addContact();
//                        } else {
//                            break;
//                        }
//                    }
//                } else if (userInput.equals("2")) {
//                    //Read contacts
//                    String input = askUserForInput();
//
//                } else if (userInput.equals("3")) {
//                    //Go backward to previous menu
//                }
//
//            } else if (userInput.equals("3")) {
//                isRunning = false;
//                System.out.println("\nHave a nice day my friend");
//            }
//
//        }
//
//        // End of the program

    }

    static public void runningProgram(){
        // Start of the program

        while (isRunning) {
            printOutMainMenu();
            String userInput = askUserForInput();

            //Log in as Admin
            if (userInput.equals("1")) {

                confirmPassword();
                printOutAdminOptions();
                userInput = askUserForInput();

                if (userInput.equals("1")) {
                    while (true) {
                        System.out.println("Create Contact (y/n)");
                        userInput = askUserForInput();
                        if (userInput.equals("y")) {
                            database.addContact();
                        } else {
                            break;
                        }
                    }

                } else if (userInput.equals("2")) {

                    // menu read Contact
                    // if
                    database.searchByFirstName();
                    // else-if
                    database.searchByLastName();
                    // else-if
                    database.searchByAdress();
                    // else-if
                    database.freeSearch();

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
                    // menu read Contact
                    // if
                    database.searchByFirstName();
                    // else-if
                    database.searchByLastName();
                    // else-if
                    database.searchByAdress();
                    // else-if
                    database.freeSearch();
                }

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
//                .fName()
//                .lName()
//                .age()
//                .streetAddress()
//                .streetNum()
//                .county()
//                .zipCode()
//                .build();
        /*Address addressInfo = new Address.AddressBuilder("Skolvägen", "6", "Sweden", "98432")

                .build();*/

//        LinkedHashMap<String, String> contact = new LinkedHashMap<>();
//        contact.put("First Name", contactInfo.getFirstName());
//        contact.put("Last Name", contactInfo.getLastName());
//        contact.put("Age", contactInfo.getAge());
//        contact.put("Phone", contactInfo.getPhoneNo());
//        contact.put("StreetAddress ", contactInfo.streetAddress + contactInfo.streetNum);
//        contact.put("Country", contactInfo.county);
//        contact.put("Zip Code", contactInfo.zipCode);
//        return contact;

    static public void printAllContacts() {
        System.out.println();
        for (int i = 0; i < phoneBook.size(); i++) {
            HashMap contact = phoneBook.get(i);
            System.out.println(contact);
        }
    }

    static public void removeContact() {
        int input = Integer.parseInt(askUserForInput());
        phoneBook.remove(input);
    }
}
