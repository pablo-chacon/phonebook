package contactDB;
// Contact POJO.

import java.util.Scanner;

public class Contact {
    Scanner sc = new Scanner(System.in);

    private String fname;
    private String lname;
    private String age;
    private String phone;
    private String streetAddress;
    private String streetNum;
    private String county;
    private String zipCode;
    private int id;

    // Huge constructor.
    public Contact(String fname, String lastName, String age, String phone_number, String street, String number, String county, String zipCode) {
        setFname();
        setLname();
        setAge();
        setPhone();
        setStreetAddress();
        setStreetNum();
        setCounty();
        setZipCode();
    }

    public String printContact() {

        return "\nFirst Name: " + fname + '\n' +
                "Last Name: " + lname + '\n' +
                "Age: " + age + '\n' +
                "Phone: " + phone + '\n' +
                "Street Address: " + streetAddress + '\n' +
                "StreetNum: '" + streetNum + '\n' +
                "County: " + county + '\n' +
                "ZipCode: " + zipCode + '\n';
    }


    public String getFname() {
        return fname;
    }

    public void setFname() {
        System.out.print("First name: ");
        this.fname = String.valueOf(sc.next());
    }

    public String getLname() {
        return lname;
    }

    public void setLname() {
        System.out.print("Last name: ");
        this.lname = String.valueOf(sc.next());
    }

    public String getAge() {
        return age;
    }

    public void setAge() {
        System.out.print("Age: ");
        this.age = String.valueOf(sc.next());
    }

    public String getPhone() {
        return phone;
    }


    public void setPhone() {

        System.out.print("Phone: ");
        this.phone = String.valueOf(sc.next());
        if (phone.length() == 10){

        }else {
            System.out.println("");
        }
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress() {
        System.out.print("Street Address: ");
        this.streetAddress = String.valueOf(sc.next());
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum() {
        System.out.print("Street Number: ");
        this.streetNum = String.valueOf(sc.next());
    }

    public String getCounty() {
        return county;
    }

    public void setCounty() {
        System.out.print("Country: ");
        this.zipCode = String.valueOf(sc.next());

    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode() {
        System.out.print("Zip Code: ");
        this.zipCode = String.valueOf(sc.next());
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}