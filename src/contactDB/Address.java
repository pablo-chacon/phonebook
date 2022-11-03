package contactDB;

public class Address {

    public String streetAddress;
    public String streetNum;
    public String county;
    public String zipCode;


    public Address(AddressBuilder builder) {
        this.streetAddress = builder.streetAddress;
        this.streetNum = streetNum;
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
            this.county = county;
            this.zipCode = zipCode;
        }

        public AddressBuilder streetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public AddressBuilder streetNum(String streetNum) {
            this.streetNum = streetNum;
            return this;
        }

        public AddressBuilder county(String county) {
            this.county = county;
            return this;
        }

        public AddressBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Address build() {
            Address address = new Address(this);
            return address;
        }
    }
}
