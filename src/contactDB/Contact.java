package contactDB;
// Contact POJO.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Contact {
    static public Scanner sc = new Scanner(System.in);

    private int id = 2;
    private String fname;
    private String lname;
    private String age;
    private String phone;
    private String streetAddress;
    private String streetNum;
    private String county;
    private String zipCode;

    // Huge constructor.
    public Contact() {
        id = id + 1;
    }


    public Contact(int id, String fname, String lname, String age, String phone, String streetAddress, String streetNum, String county, String zipCode) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.phone = phone;
        this.streetAddress = streetAddress;
        this.streetNum = streetNum;
        this.county = county;
        this.zipCode = zipCode;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String firstName) {
        this.fname = firstName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    static public String digitsLimit() {
        String phone = "";

        while (true) {
            System.out.print("Phone: ");
            phone = sc.next();

            if (phone.length() > 16 || onlyDigits(phone)) {
                System.out.println("Invalid phone number");
            } else if (onlyDigits(phone)) {
                System.out.println("Invalid phone number");
            } else {
                break;
            }
        }
        return phone;
    }

    static public boolean onlyDigits(String value) {
        boolean hasLetters = false;

        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(0) == '+') {
                hasLetters = false;
            } else if (!Character.isDigit(value.charAt(i))) {
                hasLetters = true;
            }
        }

        return hasLetters;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }


    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public void setCounty(String county) {
        this.county = county;

    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> groupOfStrings() {
        return Arrays.asList(fname, lname, age, phone, streetAddress, streetNum, county, zipCode);
    }

    @Override
    public String toString() {
        return "Name: " + this.fname + " " + this.lname + " Age: " + this.age + " Phone: " + this.phone + " Street: " + this.streetAddress +
                " " + this.streetNum + " County: " + this.county + " Zip code: " + this.zipCode + " ID: " + this.id;
    }
}