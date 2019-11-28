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
    
    public Library(Library anotherLibrary) {
        this.library = anotherLibrary.library;
    }

    /**
     *
     * @param keyword
     * @return
     */
    public ArrayList<Book> searchLibrary(String keyword) {
        ArrayList<Book> searchResult = new ArrayList<>();
        keyword = keyword.toLowerCase();
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getAuthor().toLowerCase().contains(keyword) || 
                    library.get(i).getTitle().toLowerCase().contains(keyword)) 
                searchResult.add(library.get(i));
        }
        return searchResult;
    }
    
    /**
     *
     * @param anotherLibrary
     * @return
     */
    public boolean equals(Library anotherLibrary) {
        return library.equals(anotherLibrary.library);
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
