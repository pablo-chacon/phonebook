import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Contact contact = new Contact();
        Scanner sc = new Scanner(System.in);

        System.out.println("first");
        contact.setFirstName(sc.next());

        System.out.println("Last");
        contact.setLastName(sc.next());

        System.out.println("Age");
        contact.setAge(sc.nextInt());

        System.out.println("Address");
        contact.setAddress(sc.next());

        System.out.println("phone");
        contact.setPhoneNo(sc.next());



//        new ContactDB()
//                .addContact("First name", "Last name", "Age", "Address", "Phone")
//                .addContact(
//                        contact.getFirstName(), contact.getLastName(),
//                            String.valueOf(contact.getAge()), contact.getAddress(),
//                            contact.getPhoneNo()).print();


        // Start of the program

        boolean isRunning = true;


        while (isRunning){
            printOutMainMenu();
            String userInput = askUserForInput();

            //Log in as Admin
            if (userInput.equals("1")){
                //Ask user to input password maybe hashmap

                // if password is correct
                    printOutAdminOptions();
                    userInput = askUserForInput();
                // else-if password is incorrect
                    // printout an error message

                if (userInput.equals("1")){
                    //Create a new contact

                    // ask user to input: firstName, surname, age, adress, phone-number

                    // if phone-number is not similar to a phone-number already exist in phone book
                        //add new contact to phone book
                    // else
                        // deny the request and print out an error messages
                } else if (userInput.equals("2")) {
                    // read contacts
                    printOutSearchOptions();
                    String input = askUserForInput();



                } else if (userInput.equals("3")) {
                    //Update - att kunna uppdatera en profils kontaktuppgifter
                } else if (userInput.equals("4")) {
                    //Delete - att kunna ta bort en profil
                } else if (userInput.equals("5")) {
                    //Go backward to previous menu
                }
            //Log in as Guest
            } else if (userInput.equals("2")){
               printOutGuestOptions();
               userInput = askUserForInput();

               if (userInput.equals("1")){
                   //Create a contact
               } else if (userInput.equals("2")) {
                   //Read contacts
                   printOutSearchOptions();
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

        // End of the program
    }

    static public void printOutMainMenu(){
        System.out.println("""
                Select one of following options
                [1] Login as Admin
                [2] Login as Guest
                [3] Exit
                """);
    }
    static public String askUserForInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        return sc.nextLine();
    }

    static public void printOutAdminOptions(){
        System.out.println("""
                \nSelect one of following options
                [1] Create contact
                [2] Read contact
                [3] Update contact
                [4] Delete contact
                [5] Go back
                """);
    }

    static public void printOutGuestOptions(){
        System.out.println("""
                \nSelect one of following options
                [1] Create contact
                [2] Read contact
                [3] Go back
                """);
    }
    static public void printOutSearchOptions(){
        System.out.println("""
                \nSelect one of following options
                [1] Search by first name
                [2] Search by surname
                [3] Search by address
                [4] Free search
                [5] Go back
                """);
    }

}