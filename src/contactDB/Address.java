package contactDB;

public class Address extends Contact {

    public String streetAddress;
    public String county;
    public String zipCode;


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


    @Override
    public String addressData() {
        return "Street: " + getStreetAddress() + "\n\t\t\t\t\t\t\t\t County: " + getCounty() + "\n\t\t\t\t\t\t\t\t Zip: " + getZipCode() + " ";
    }
}
