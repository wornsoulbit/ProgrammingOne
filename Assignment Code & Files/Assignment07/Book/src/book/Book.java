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

    public Book() {
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.isbn = "";
        this.price = 0;
    }

    public Book(String title) {
        this.title = title;
        this.author = "";
        this.publisher = "";
        this.isbn = "";
        this.price = 0;
    }

    public Book(String title, String author, String publisher, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.price = price;
    }

    public Book(Book anotherBook) {
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.publisher = anotherBook.publisher;
        this.isbn = anotherBook.isbn;
        this.price = anotherBook.price;   
    }
    
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
        return isIsbn13 ? (isValidIsbn10(isbn) ? 1 : -1) : (isValidIsbn10(isbn) ? 0 : -1);
    }
    
    public boolean isValidIsbn10(String isbn) {
        int length = 10; //Length of the isbn number after the first and last dashes are cut off.
        String newIsbn = isbn.substring(2, isbn.lastIndexOf("-"));
        return newIsbn.indexOf("-") != newIsbn.length() - 1 && newIsbn.indexOf("-") > 1 && length > newIsbn.length();
    }
    
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
    
    public String wordToTitleCase(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
    
    @Override
    public String toString() {
        String message = String.format("%-15s: %s\n", "Title", title);
        message += String.format("%-15s: %s\n", "Author", author);
        message += String.format("%-15s: %s\n", "Publisher", publisher);
        message += String.format("%-15s: %.2f\n", "Price", price);
        message += String.format("%-15s: %s\n", "ISBN", isbn);
        
        return message;
    }
    
    public boolean equals(Book anotherBook) {
        return title.equals(anotherBook.title) 
                && author.equals(anotherBook.author)
                && publisher.equals(anotherBook.publisher)
                && price == anotherBook.price
                && isbn.equals(anotherBook.isbn);
    }
    
    public Book clone() {
        return new Book(this);
    }
    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
