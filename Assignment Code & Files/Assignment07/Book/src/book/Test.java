package book;

/**
 *
 * @author Alex Vasil
 */
public class Test {
    
    public static void main(String[] args) {
        Book b1 = new Book("hello   WoRld");
        
        System.out.println(b1.toTitleCase("hello    WoRLD"));
    }
    
}
