package contactDB;
// Contact POJO.

public class Contact {

    private String fname;
    private String lname;
    private String age;
    private String phone;

    public String streetAddress;
    public String streetNum;
    public String county;
    public String zipCode;

    // Huge constructor.
    public Contact(String fname, String lastName, String age, String phone_number, String street, String number, String county, String zipCode) {
        this.fname = fname;
        this.lname = lname;
        this.age = this.age;
        this.phone = phone;
        this.streetAddress = streetAddress;
        this.streetNum = streetNum;
        this.county = this.county;
        this.zipCode = this.zipCode;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}