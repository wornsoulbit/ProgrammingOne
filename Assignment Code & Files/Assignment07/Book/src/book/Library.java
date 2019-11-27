package book;

import java.util.ArrayList;

/**
 * A class of a Library.
 * 
 * @author Alex Vasil
 */
public class Library {
    private ArrayList<Book> library;

    public Library() {
        library = new ArrayList<>();
        
        library.add(new Book("New book!"));
        library.add(new Book("New book2!"));
        library.add(new Book("New book3!"));
        library.add(new Book("New book4!"));
        library.add(new Book("New book5!"));
    }
}
