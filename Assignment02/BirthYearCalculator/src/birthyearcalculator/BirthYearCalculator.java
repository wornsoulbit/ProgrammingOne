package birthyearcalculator;

import java.util.Scanner;

/**
 * Asks the user to enter a birth year and calculate the century and decade.
 * @author Alexander Vasil
 */
public class BirthYearCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a birth year: ");
        int birthYear = input.nextInt();
        
        int century = (birthYear - (birthYear % 100)) / 100 + 1;
        int decade = (birthYear % 100 / 10) * 10;
        
        System.out.printf("%-10s: %d\n", "Birth Year", birthYear);
        System.out.printf("%-10s: %d\n", "Century", century);
        System.out.printf("%-10s: %d\n", "Decade", decade);
    }
    
}
