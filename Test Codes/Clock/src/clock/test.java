package clock;

/**
 *
 * @author Alex Vasil
 */
public class test {
    
    public static void main(String[] args) {
        Clock c1 = new Clock();
        Clock c2 = new Clock();
//        Clock c3 = c1;
        Clock c3 = c1.clone();
        Clock c4 = new Clock(c1);
        c1.setHr(5);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        System.out.println(c1 == c2);
        
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        
    }
}
