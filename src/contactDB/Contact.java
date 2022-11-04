package contactDB;

import java.util.Scanner;

public class Contact {
    static public Scanner sc = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String age;
    private String phoneNo;


    public Contact(ContactBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNo = builder.phoneNo;

    }


    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public String getAge() {
        return age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }


    @Override
    public String toString() {
        return "Name: " + this.firstName+ " " +this.lastName+", Age: " +this.age+ ", Phone number: " + this.phoneNo;
    }
    public static class ContactBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String phoneNo;

        public ContactBuilder(String firstName, String lastName, String age, String phoneNo) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.phoneNo = phoneNo;
        }

        public ContactBuilder fName() {
            System.out.print("First Name: ");
            this.firstName = sc.next();
            return this;
        }

        public ContactBuilder lName() {
            System.out.print("Last Name: ");
            this.lastName = sc.next();
            return this;
        }

        public ContactBuilder age() {
            System.out.print("Age: ");
            this.age = sc.next();
            return this;
        }
        public ContactBuilder phoneNo() {
            System.out.println("Phone: ");
            this.phoneNo = sc.next();
            return this;
        }
        public Contact build() {
            Contact contact = new Contact(this);
            return contact;
        }
    }
}
