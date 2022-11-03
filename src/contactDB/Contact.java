package contactDB;

public class Contact {

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

        public ContactBuilder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public ContactBuilder fName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ContactBuilder lName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ContactBuilder age(String age) {
            this.age = age;
            return this;
        }
        public Contact build() {
            Contact contact = new Contact(this);
            return contact;
        }
    }
}
