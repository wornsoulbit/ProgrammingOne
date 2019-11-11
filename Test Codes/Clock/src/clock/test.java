package clock;

/**
 *
 * @author Alex Vasil
 */
public class test {
    
    public static void main(String[] args) {
        Clock c1 = new Clock();
        Clock c2 = new Clock();
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println(c1 == c2);
    }
}
