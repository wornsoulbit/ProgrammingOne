package employee;

/**
 * Addresses, which contains the country, city, street name, address of the
 * house, apartment number, and postal code
 *
 * @author Alex Vasil
 */
public class Address {

    private String country;
    private String province;
    private String streetName;
    private String city;
    private int address;
    private String apartmentNumber;
    private String postalCode;

    /**
     * The default values for an address if none is inputed.
     */
    public Address() {
        this.country = "Canada";
        this.province = "";
        this.streetName = "";
        this.city = "";
        this.address = 0;
        this.apartmentNumber = "";
        this.postalCode = "";
    }

    /**
     *
     * @param country
     * @param province
     * @param city
     */
    public Address(String country, String province, String city) {
        this.country = country;
        this.province = province;
        this.streetName = "";
        this.city = city;
        this.address = 0;
        this.apartmentNumber = "";
        this.postalCode = "";
    }

    /**
     *
     * @param country
     * @param province
     * @param streetName
     * @param city
     * @param address
     * @param apartmentNumber
     */
    public Address(String country, String province, String streetName,
            String city, int address, String apartmentNumber) {
        this.country = country;
        this.province = province;
        this.streetName = streetName;
        this.city = city;
        this.address = address;
        this.apartmentNumber = apartmentNumber;
        this.postalCode = "";
    }

    /**
     *
     * @param country
     * @param province
     * @param streetName
     * @param city
     * @param address
     * @param apartmentNumber
     * @param postalCode
     */
    public Address(String country, String province, String streetName,
            String city, int address, String apartmentNumber, String postalCode) {
        this.country = country;
        this.province = province;
        this.streetName = streetName;
        this.city = city;
        this.address = address;
        this.apartmentNumber = apartmentNumber;
        this.postalCode = postalCode;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String message = String.format("\n%-17s: %s\n", "Country", country);
        message += String.format("%-17s: %s\n", "Province", province);
        message += String.format("%-17s: %s\n", "City", city);
        message += String.format("%-17s: %s\n", "Street Name", streetName);
        message += String.format("%-17s: %d\n", "Address", address);
        message += String.format("%-17s: %s\n", "Apartment Number", apartmentNumber);
        message += String.format("%-17s: %s\n", "Postal Code", postalCode);

        return message;
    }

    /**
     *
     * @param address
     * @return
     */
    public boolean isValidAdress(int address) {
        return address > 0 && address <= 99999;
    }

    /**
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @return
     */
    public String getProvince() {
        return province;
    }

    /**
     *
     * @return
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @return
     */
    public int getAddress() {
        return address;
    }

    /**
     *
     * @return
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     *
     * @return
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     *
     * @param streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @param address
     */
    public void setAddress(int address) {
        if (isValidAdress(address)) {
            this.address = address;
        }
    }

    /**
     *
     * @param apartmentNumber
     */
    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    /**
     *
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
