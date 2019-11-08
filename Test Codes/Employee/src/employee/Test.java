package employee;

/**
 *
 * @author Alex Vasil
 */
public class Test {
    
    public static void main(String[] args) {
        Address a1 = new Address("Canada", "Quebec", "Randall", "Montreal", 4852, "", "H4V2V1");
        Employee e1 = new Employee("Alex Vasil", "male", a1);
        Employee e2 = new Employee("Jeff", "male", null);
        Employee e3 = new Employee("Jeff", "male", null);
        
        System.out.println(e2 == e3);
    }
}
