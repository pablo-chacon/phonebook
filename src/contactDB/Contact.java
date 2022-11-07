package contactDB;
// Contact POJO.

import java.util.Scanner;


public class Contact {
    static  public Scanner sc = new Scanner(System.in);

    public int id;

    private String fname;
    private String lname;
    private String age;
    private String phone;
    private String streetAddress;
    private String streetNum;
    private String county;
    private String zipCode;

    // Huge constructor.
    public Contact(int id, String fname, String lastName, String age, String phone_number, String street,
                   String number, String county, String zipCode) {
        this.id = id;
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
        this.phone = phoneLenght();
    }
     static  public String phoneLenght(){
        String phone = "";
        while (true){
            System.out.print("Phone: ");
            phone = sc.next();

            if(phone.length() != 10){
                System.out.println("Invalid phone number");
            } else {
                break;
            }
        }
        return phone;
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

    @Override
    public String toString() {
        return "Name: " + this.fname + " " + this.lname + " Age: " + this.age + " Street: " + this.streetAddress +
                " " + this.streetNum + " County: " + this.county + " Zip code: " + this.zipCode;
    }
}