package book;

/**
 * A class of a book.
 * 
 * @author Alex Vasil
 */
public class Book {

    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private double price;

    /**
     * Default constructor of a book.
     */
    public Book() {
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.isbn = "";
        this.price = 0;
    }

    /**
     * Constructor of a book.
     * 
     * @param title the title of a book.
     */
    public Book(String title) {
        this.title = title;
        this.author = "";
        this.publisher = "";
        this.isbn = "";
        this.price = 0;
    }

    /**
     * Constructor of a book.
     * 
     * @param title the title of a book.
     * @param author the author of the book.
     * @param publisher the publisher of the book.
     * @param isbn the isbn number of the book.
     * @param price the price of the book.
     */
    public Book(String title, String author, String publisher, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.price = price;
    }
    
    /**
     * A copy of a book.
     * 
     * @param anotherBook the book to be copied.
     */
    public Book(Book anotherBook) {
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.publisher = anotherBook.publisher;
        this.isbn = anotherBook.isbn;
        this.price = anotherBook.price;   
    }
    
    /**
     * Checks the status of the ISBN number.
     * 
     * @param isbn the isbn number of the book.
     * @return -1 if its not a valid isbn number, 0 if it's isbn 10, and 1 if its
     * isbn 13.
     */
    public int checkIsbnStatus(String isbn) {
        boolean isIsbn13 = false;
        
        if (isbn.length() == 17) {
            isIsbn13 = true;
            if (!isbn.substring(0, 4).equals("978-"))
                return -1;
            else
                isbn = isbn.substring(4);
        }
        
        if (isbn.indexOf("-") != 1) {
            return -1;
        }
        
        if (!isValidIsbn10(isbn)) 
            return -1;
        else 
            return isIsbn13 ? 1 : 0;
    }
    
    /**
     * Checks to see if the isbn10 number is a valid number.
     * 
     * @param isbn the isbn10 number.
     * @return true or false, based on if its a valid isbn number.
     */
    public boolean isValidIsbn10(String isbn) {
        int validIsbn10Length = 13; // Valid length of isbn10 number.
        
        if (isbn.length() > validIsbn10Length)
            return false;
        
        String newIsbn = isbn.substring(2, isbn.lastIndexOf("-"));        
        return newIsbn.indexOf("-") != newIsbn.length() - 1 
                && newIsbn.indexOf("-") > 1;
    }
    
    /**
     * Changes any text to title case e.g.: Hello World from hellO wOrld.
     * 
     * @param strIn the inputed string.
     * @return the string in title case.
     */
    public String toTitleCase(String strIn) {
        if (strIn.isEmpty())
            return "";
        String strOut = "";
        while (strIn.indexOf(' ') != -1) {
            strOut += wordToTitleCase(strIn.substring(0, strIn.indexOf(' ')).trim()) + " ";
            strIn = strIn.substring(strIn.indexOf(' ') + 1).trim();
        }
        return strOut + wordToTitleCase(strIn);
    }
    
    /**
     * Converts a word into title case.
     * 
     * @param word the word that is to be converted to title case.
     * @return the word in title case.
     */
    public String wordToTitleCase(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
    
    /**
     * To string method: Prints the title, author, publisher, price and isbn number.
     * 
     * @return a string thats been pre-formated.
     */
    @Override
    public String toString() {
        String message = String.format("%-15s: %s\n", "Title", title);
        message += String.format("%-15s: %s\n", "Author", author);
        message += String.format("%-15s: %s\n", "Publisher", publisher);
        message += String.format("%-15s: %.2f\n", "Price", price);
        message += String.format("%-15s: %s\n", "ISBN", isbn);
        
        return message;
    }
    
    /**
     * Checks if two constructors are equal to each other.
     * 
     * @param anotherBook the constructor to be compared.
     * @return true or false, based on if both constructors are equals to each other.
     */
    public boolean equals(Book anotherBook) {
        return title.equals(anotherBook.title) 
                && author.equals(anotherBook.author)
                && publisher.equals(anotherBook.publisher)
                && price == anotherBook.price
                && isbn.equals(anotherBook.isbn);
    }
    
    /**
     * Clones a constructor.
     * 
     * @return a new constructor.
     */
    public Book clone() {
        return new Book(this);
    }
    
    /**
     * Gets the title of a book.
     * 
     * @return the title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of a book.
     * 
     * @return the author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the publisher of the book.
     * 
     * @return the publisher of the book.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Gets the ISBN number of the book.
     * 
     * @return the ISBN number of the book.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Gets the price of the book.
     * 
     * @return the price of the book.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the title of the book.
     * 
     * @param title the title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the author of the book.
     * 
     * @param author the author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the publisher of the book.
     * 
     * @param publisher the publisher of the book.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Sets the ISBN of the book.
     * 
     * @param isbn the ISBN of the book.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Sets the price of the book.
     * 
     * @param price the price of the book.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
