package birthyearcalculator;

import java.util.Scanner;

/**
 * Asks the user to enter a birth year and calculate the century and decade.
 * @author Alexander Vasil
 */
public class BirthYearCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a four digit birth year: ");
        String birthYear = input.nextLine().trim();
        
        String centurySub = birthYear.substring(0, 2); 
        String decade = birthYear.substring(2, 3); 

        int century = Integer.parseInt(centurySub) + 1;
        
        System.out.printf("%-10s: %s\n", "Birth Year", birthYear);
        System.out.printf("%-10s: %4s\n", "Century", century);
        System.out.printf("%-10s: %4s\n", "Decade", decade + 0);
    }
    
}
