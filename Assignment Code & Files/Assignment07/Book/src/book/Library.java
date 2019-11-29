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
        library = new ArrayList<>();
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
    
    /**
     * A shallow copy of a library.
     * 
     * @param anotherLibrary the library to be copied.
     */
    public Library(Library anotherLibrary) {
        this.library = anotherLibrary.library;
    }

    /**
     * Searches in the array list for any book with the keyword.
     * 
     * @param keyword the word that is being searched for in the array.
     * @return the books that contains the keyword.
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
     * Checks if two libraries are equal to each other.
     * 
     * @param anotherLibrary the library thats being compared.
     * @return if the two libraries are equal to each other.
     */
    public boolean equals(Library anotherLibrary) {
        return library.equals(anotherLibrary.library);
    }
    
    /**
     * A copy of a library.
     * 
     * @return a new library as a constructor.
     */
    public Library clone() {
        return new Library(this);
    }
    
    /**
     * Default to string method.
     * 
     * @return a string with the library data.
     */
    @Override
    public String toString() {
        return "Library{" + "library=" + library + '}';
    }
    
    /**
     * Getter of library.
     * 
     * @return the library.
     */
    public ArrayList<Book> getLibrary() {
        return library;
    }

    /**
     * Setter of a library.
     * 
     * @param library 
     */
    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }
}
