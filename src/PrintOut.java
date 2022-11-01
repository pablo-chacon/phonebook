import java.util.Scanner;

public class PrintOut {

    public void MainMenu(){
        System.out.println("""
                [1] log in as Admin
                [2] log in as Guest
                """);
    }

    public void guestUserOptions(){
        System.out.println("""
                [1] Create contact to PhoneBook
                [2] printout contact
                """);
    }
}
