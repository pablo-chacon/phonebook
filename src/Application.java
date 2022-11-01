import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

//        Contact contact = new Contact();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("first");
//        contact.setFirstName(sc.next());
//
//        System.out.println("Last");
//        contact.setLastName(sc.next());
//
//        System.out.println("Age");
//        contact.setAge(sc.nextInt());
//
//        System.out.println("Address");
//        contact.setAddress(sc.next());
//
//        System.out.println("phone");
//        contact.setPhoneNo(sc.next());
//        System.out.println("Hogaboga");
//
//
//        new ContactDB()
//                .addContact("First name", "Last name", "Age", "Address", "Phone")
//                .addContact(
//                        contact.getFirstName(), contact.getLastName(),
//                            String.valueOf(contact.getAge()), contact.getAddress(),
//                            contact.getPhoneNo()).print();

        boolean isRunning = true;


        while (isRunning){
            printOutMainMenu();
            String userInput = askUserForInput();

            if (userInput.equals("1")){
                printOutAdminOptions();
            } else if (userInput.equals("2")){
               printOutGuestOptions();
            } else if (userInput.equals("3")) {

            }

        }
    }
//            Printout userGuest options in the console
//            Ask for input from the user
//
//                    if(input = 1)
//            Create - att lägga till nya profiler i telefonboken
//                    else-if(input = 2)
//            Read - att söka efter profiler i telefonboken givet olika sökningar
//            ask input from user
//
//                        if(input = 1)
//            Sökning på förnamn - ger alla profiler med det sökta förnamnet.
//                        else-if(input = 2)
//            Sökning på efternamn - ger profilen som först matchar med sökningen
//                        else-if(input = 3)
//            Sökning på adress - ger alla profiler på samma gatunamn.
//                    else-if(input = 4)
//            Fri sökning - ger alla profiler med någon relaterbar kontaktinformation
//
//
//      -else-if(input = 2)
//            enter Password
//            printout user admin options in the console
//            ask for input from the user
//
//            if(input = 1)
//                Create - att lägga till nya profiler i telefonboken
//            else-if(input = 2)
//                Read - att söka efter profiler i telefonboken givet olika sökningar
//            else-if(input = 3)
//                Update - att kunna uppdatera en profils kontaktuppgifter
//            else-if(input = 4)
//                Delete - att kunna ta bort en profil
//
//      -else-if(input = 3)
//            end program


    static public void printOutMainMenu(){
        System.out.println("""
                what do you prefer login as
                [1] Admin
                [2] Guest
                """);
    }
    static public String askUserForInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        return sc.nextLine();
    }

    static public void printOutAdminOptions(){
        System.out.println("""
                [1] Create contact
                [2] Read contact
                [3] Update contact
                [4] Delete contact
                [5] Go back
                """);
    }

    static public void printOutGuestOptions(){
        System.out.println("""
                [1] Create contact
                [2] Read contact
                [3] Go back
                """);
    }









}