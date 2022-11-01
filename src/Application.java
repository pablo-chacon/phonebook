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


        new ContactDB()
                .addContact("First name", "Last name", "Age", "Address", "Phone")
                .addContact(
                        contact.getFirstName(), contact.getLastName(),
                            String.valueOf(contact.getAge()), contact.getAddress(),
                            contact.getPhoneNo()).print();
    }

}