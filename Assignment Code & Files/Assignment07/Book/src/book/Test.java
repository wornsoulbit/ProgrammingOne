package book;

/**
 *
 * @author Alex Vasil
 */
public class Test {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Book b1 = new Book("hello   WoRld", "alex", "publisher", "1-11-111111-1", 9.99);
        System.out.println(b1.checkIsbnStatus(b1.getIsbn()));
    }
    
}
