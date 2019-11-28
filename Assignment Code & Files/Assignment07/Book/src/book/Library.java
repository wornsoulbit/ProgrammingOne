package book;

import java.util.ArrayList;

/**
 * A class of a Library.
 * 
 * @author Alex Vasil
 */
public class Library {
    private ArrayList<Book> library;

    /**
     * The default constructor of the library.
     */
    public Library() {
        library.add(new Book("New book!"));
        library.add(new Book("New book2!"));
        library.add(new Book("New book3!"));
        library.add(new Book("New book4!"));
        library.add(new Book("New book5!"));
    }

    /**
     * Constructor of the library.
     * 
     * @param library 
     */
    public Library(ArrayList<Book> library) {
        this.library = library;
    }

//    /**
//     *
//     * @param keyword
//     * @return
//     */
//    public Library searchLibrary(String keyword) {
//        
//    }
    
    /**
     *
     * @param anotherLibrary
     * @return
     */
    public boolean equals(Library anotherLibrary) {
        return library.equals(anotherLibrary.library);
    }
    
    public Library(Library anotherLibrary) {
        
    }
    
    public Library clone() {
        return new Library(this);
    }
    
    @Override
    public String toString() {
        return "Library{" + "library=" + library + '}';
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Book> getLibrary() {
        return library;
    }

    /**
     *
     * @param library
     */
    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }
}
