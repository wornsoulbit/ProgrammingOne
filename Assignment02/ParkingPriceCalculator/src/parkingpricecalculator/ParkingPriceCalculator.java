package parkingpricecalculator;

import java.util.Scanner;

/**
 * Asks the user to input the amount of time they've been parked and calculate the 
 * cost of the parking for the amount of time they've spent.
 * @author cstuser
 */
public class ParkingPriceCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please input the number of minutes your car has been parked: ");
        double numMin = input.nextInt();
        double parkingCost = 2.00;
        
        double numHour = Math.ceil(numMin / 60);
        
        double price = numHour * parkingCost;
        
        String outPrice = String.format("%-24s: $%.2f\n", "Price", price);
        
        System.out.printf("%-24s: %.0f\n", "Parking time (minutes)", numMin);
        System.out.printf("%-24s: %.0f\n", "Parking time (hour)", numHour);
        System.out.printf(outPrice);
    }
    
}
