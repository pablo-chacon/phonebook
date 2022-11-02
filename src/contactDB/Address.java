package contactDB;

public class Address {

    public String streetAddress;
    public String zipCode;
    public String county;

    public Address() {

    }

    public Address(String streetAddress, String zipCode, String county) {
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.county = county;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }


    public String addressData(String streetAddress, String county, String zipCode) {
        return getStreetAddress() + " County: " + getCounty() + " Zip: " + getZipCode() + " ";
    }
}
