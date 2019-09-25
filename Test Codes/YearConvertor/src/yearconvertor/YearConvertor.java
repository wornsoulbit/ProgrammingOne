package yearconvertor;

import java.util.Scanner;

/**
 * Convert a year to century and decade. 
 * 
 * @author Alexander Vasil
 */
public class YearConvertor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a 4 digit year: ");
        
        String year = input.next();
        
        System.out.printf("\nThe century: %d\n",calcCentury(year));
        System.out.printf("The decade: %d%s\n", calcDecade(year), "\'s");
    }

    /**
     * To calculate the century of the year.
     * 
     * @param year the year that gets converted into century.
     * @return the century of the year.
     */
    public static int calcCentury(String year) {
        return Integer.parseInt(year.substring(0, 2)) + 1;
    }
    
    /**
     * To calculate the decade of the year.
     * 
     * @param year the year that gets converted into decade.
     * @return the decade of the year.
     */
    public static int calcDecade(String year){
        return Integer.parseInt(year.substring(2, 3) + 0);
    }

}
