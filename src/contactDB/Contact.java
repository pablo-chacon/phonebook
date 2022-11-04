package contactDB;

public class Contact  {

    private String firstName;
    private String lastName;
    private String age;
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
        return age;
    }

    @Override
    public String toString() {
        return "name " + this.firstName+ " " + this.lastName + " \nage " +this.age +
                " \naddress " + this.streetAddress + " " + this.streetNum + " \ncounty " + this.county + " \nzip " + this.zipCode;
    }
    public static class ContactBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String phoneNo;
        public String streetAddress;
        public String streetNum;
        public String county;
        public String zipCode;


        public ContactBuilder(String firstName, String lastName, String age, String streetAddress,
                              String streetNum, String county, String zipCode) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.streetAddress = streetAddress;
            this.streetNum = streetNum;
            this.county = county;
            this.zipCode = zipCode;
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

        public String getPhoneNo() {
            return phoneNo;
        }

        public ContactBuilder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public ContactBuilder streetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public ContactBuilder streetNum(String streetNum) {
            this.streetNum = streetNum;
            return this;
        }

        public ContactBuilder county(String county) {
            this.county = county;
            return this;
        }

        public ContactBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public Contact build() {
            Contact contact = new Contact(this);
            return contact;
        }

    }
}
