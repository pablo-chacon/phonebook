public class Address extends Contact  {

    public String streetAddress;
    public String zipCode;
    public String county;

    public Address() {

    }

    public Address(String firstName, String lastName, int age, String address, String phoneNo, String streetAddress, String zipCode, String county) {
        super(firstName, lastName, age, address, phoneNo);
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
}
