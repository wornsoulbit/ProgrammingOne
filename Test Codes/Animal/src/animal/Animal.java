package animal;

/**
 *
 * @author Alex Vasil
 */
public class Animal {

    public static void main(String[] args) {
        double min = 4;
        Dog d1 = new Dog();
        Dog d2 = new Dog("Copain", 3, 'm', "mixed" , "Black & Brown");
        Dog d3 = new Dog("Lucy", 2, 'f', "Chiwawa");
        
        System.out.println(d3.getName());
    }

}
