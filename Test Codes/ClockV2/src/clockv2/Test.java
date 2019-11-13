package clockv2;

/**
 *
 * @author Alex Vasil
 */
public class Test {
    
    public static void main(String[] args) {
        ClockV2 c1 = new ClockV2(23, 59, 55);
        for (int i = 0; i < 10; i++) {
            c1.increaseSe();
            System.out.println(c1);
        }
    }
}
