package employee;

/**
 *
 * @author Alex Vasil
 */
public class Employee {

    private String name;
    private String gender;
    private Address address;

    /**
     *
     */
    public Employee() {
        this.name = "";
        this.gender = "";
        this.address = null;
    }

    /**
     *
     * @param name
     * @param gender
     * @param address
     */
    public Employee(String name, String gender, Address address) {
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String message = String.format("%-17s: %s\n", "Name", name);
        message += String.format("%-17s: %s\n", "Gender", gender);
        message += String.format("%-17s: %s\n", "Address", address);

        return message;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @return
     */
    public Address getAddress() {
        return address;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

}
