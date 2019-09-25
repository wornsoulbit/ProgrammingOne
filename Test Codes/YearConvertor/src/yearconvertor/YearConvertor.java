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
        
        int century = calcCentury(year);
        int decade = calcDecade(year);
        
        printResult(year, century, decade);
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
    /**
     * Prints the year, century and decade.
     * 
     * @param year the original year.
     * @param century the century of the year.
     * @param decade the decade of the year.
     */
    public static void printResult(String year, int century, int decade){
        System.out.printf("\n%-10s: %s\n", "Year", year);
        System.out.printf("%-10s: %d\n", "Century", century);
        System.out.printf("%-10s: %d%s\n", "Decade", decade, "\'s");
    }
}
