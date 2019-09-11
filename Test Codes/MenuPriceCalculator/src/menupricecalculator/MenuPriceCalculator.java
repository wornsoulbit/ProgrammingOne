package menupricecalculator;

import java.util.Scanner;

/**
 * Calculate the total price of the meal with tips and taxes included
 * @author Alexander Vasil
 */
public class MenuPriceCalculator {
    
    public static void main(String[] args) {
        
        //Creates a new Scanner for the user inputs.
        Scanner input = new Scanner(System.in);
        
        //Asks the user to input a price.
        System.out.print("Please enter the price on the menu: ");        
        double menuPrice = input.nextDouble();
        
        //Asks the user to input a tip percentage. 
        System.out.print("Please enter a tip percentage: ");
        double tipRatio = input.nextDouble() / 100;
        
        //Sets the federal and provincial tax rates.
        double federalRatio = 0.05; //5%
        double provincialRatio = 0.09975; //9.975%
        
        //Calculates the federal, provincial and the total amount after tax.
        double federalTax = menuPrice * federalRatio;
        double provincialTax = menuPrice * provincialRatio;
        double totalTax = federalTax + provincialTax;
        
        //Calculates the total amount for tips, final price, and final price with tips.
        double tips = (menuPrice + totalTax) * tipRatio;
        double finalPrice = menuPrice + totalTax;
        double finalPriceTips = menuPrice + totalTax + tips;
        
        //Prints the federal and provincial tax rate, the total amount of the 
        //tips, and the total price with and without tips.
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Federal tax rate: " + federalRatio*100 + "%");
        System.out.printf("Provincial tax rate: %.2f%%\n", provincialRatio * 100);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Federal Taxes: $%.2f\n", federalTax);
        System.out.printf("Provincal Taxes: $%.2f\n", provincialTax);
        System.out.printf("Total taxes: $%.2f\n", totalTax);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Tip Percentage: %.1f%%\n", tipRatio * 100);
        System.out.printf("Tips: $%.2f\n", tips);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");        
        System.out.printf("Total Price with Tax: $%.2f\n", finalPrice);
        System.out.printf("Total Price including tips: $%.2f\n", finalPriceTips);
                
    }
    
}
