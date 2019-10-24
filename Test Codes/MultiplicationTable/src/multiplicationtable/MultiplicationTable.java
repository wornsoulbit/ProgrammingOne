package multiplicationtable;

/**
 * To print a multiplication table.
 * 
 * @author Alex Vasil
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        printMultiplicationTable(12);
    }

    /**
     * Prints the multiplication table.
     * 
     * @param boundary the boundary of the table. e.g. 1-9.
     */
    public static void printMultiplicationTable (int boundary) {
        
        //Print the column number.
        System.out.print("     ");
        for (int i = 1; i <= boundary; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("");
        
        //Print the horizontal line.
        System.out.print("-----");
        for (int i = 1; i <= boundary; i++) {
            System.out.print("----");
        }
        System.out.println("");
        
        //Prints the table body.
        for (int row = 1; row <= boundary; row++) {
            //Prints the row numbers and the vertical line.
            System.out.printf("%4d|", row);
            
            //Prints athe results.
            for (int col = 1; col <= boundary; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println("");
        }
            
    }
    
}
