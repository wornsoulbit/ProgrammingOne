package dog;

/**
 *
 * @author Alex Vasil
 */
public class Test {
    
    public static void main(String[] args) {
        Dog d1 = new Dog("Copain", 3, true);
        
        for (int i = 0; i < 20; i++) {
            System.out.println(d1);
            d1.increaseAge();
        }
    }
}
