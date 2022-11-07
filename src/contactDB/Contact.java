package contactDB;

import java.util.Scanner;

public class Contact  {
    static Scanner sc = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private int age;
    private String phoneNo;
    public String streetAddress;
    public String streetNum;
    public String county;
    public String zipCode;


    public Contact(ContactBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNo = builder.phoneNo;
        this.streetAddress = builder.streetAddress;
        this.streetNum = builder.streetNum;
        this.county = builder.county;
        this.zipCode = builder.zipCode;
    }


    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public String getAge() {
        return String.valueOf(age);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String toString() {
        return "name " + this.firstName+ " " + this.lastName + " \nage " +this.age +
                " \naddress " + this.streetAddress + " " + this.streetNum + " \ncounty " + this.county + " \nzip " + this.zipCode;
    }


    public static class ContactBuilder {

        private String firstName;
        private String lastName;
        private int age;
        private String phoneNo;
        public String streetAddress;
        public String streetNum;
        public String county;
        public String zipCode;


        public ContactBuilder(String firstName, String lastName, int age, String phoneNo, String streetAddress,
                              String streetNum, String county, String zipCode) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.phoneNo = phoneNo;
            this.streetAddress = streetAddress;
            this.streetNum = streetNum;
            this.county = county;
            this.zipCode = zipCode;
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
            this.age = sc.nextInt();
            return this;
        }


        public String getPhoneNo() {
            return phoneNo;
        }

        public ContactBuilder phoneNo() {
            System.out.print("Phone: ");
            this.phoneNo = sc.next();
            return this;
        }

        public ContactBuilder streetAddress() {
            System.out.print("StreetAddress: ");
            this.streetAddress = sc.next();
            return this;
        }

        public ContactBuilder streetNum() {
            System.out.print("Street Number: ");
            this.streetNum = sc.next();
            return this;
        }

        public ContactBuilder county() {
            System.out.print("Country: ");
            this.county = sc.next();
            return this;
        }

        public ContactBuilder zipCode() {
            System.out.print("Zip Code: ");
            this.zipCode = sc.next();
            return this;
        }
        public Contact build() {
            Contact contact = new Contact(this);
            return contact;
        }

    }
}
