package contactDB;

public abstract class Contact extends ContactDB {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNo;


    public Contact() {
    }

    public Contact(String firstName, String lastName, int age, String address, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public abstract String addressData();
}
