package contactDB;

import java.util.Scanner;

public class Address {
    static public Scanner sc = new Scanner(System.in);

    public String streetAddress;
    public String streetNum;
    public String county;
    public String zipCode;


    public Address(AddressBuilder builder) {
        this.streetAddress = builder.streetAddress;
        this.streetNum = builder.streetNum;
        this.county = builder.county;
        this.zipCode = builder.zipCode;
    }



    public String getStreetAddress() {
        return streetAddress;
    }


    public String getZipCode() {
        return zipCode;
    }


    public String getCounty() {
        return county;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public String toString() {
        return "Street: " + getStreetAddress() + " County: " + getCounty() +
                " Zip: " + getZipCode();
    }

    public static class AddressBuilder {

        String streetAddress;
        String streetNum;
        String county;
        String zipCode;

        public AddressBuilder(String streetAddress, String streetNum, String county, String zipCode) {
            this.streetAddress = streetAddress;
            this.streetNum = streetNum;
            this.county = county;
            this.zipCode = zipCode;
        }

        public AddressBuilder streetAddress() {
            System.out.print("Street Address: ");
            this.streetAddress = sc.next();
            return this;
        }

        public AddressBuilder streetNum() {
            System.out.print("Street Number: ");
            this.streetNum = sc.next();
            return this;
        }

        public AddressBuilder county() {
            System.out.print("Country: ");
            this.county = sc.next();
            return this;
        }

        public AddressBuilder zipCode() {
            System.out.print("Zip Code: ");
            this.zipCode = sc.next();
            return this;
        }

        public Address build() {
            Address address = new Address(this);
            return address;
        }
    }
}