package pricecalculator;

import java.util.Scanner;

/**
 * Calculates the price of the item with the discount and taxes included
 * @author Alexander Vasil
 */
public class PriceCalculator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Asks the user to input the price of the item.
        System.out.print("Please enter the price of the item: ");
        double itemPrice = input.nextDouble();
        
        //Asks the user to input the discount.
        System.out.print("Please enter the discount: ");
        double discountRatio = input.nextDouble();
        double discountedPrice = itemPrice - (itemPrice * discountRatio / 100);
        
        //Federal and Provincial Tax Ratio.
        double federalRatio = 0.05; //5%
        double provincialRatio = 0.0975; //9.975%
        
        //Calculates the Taxes with the discount then adds it to the total price.
        double federalTax = discountedPrice * federalRatio;
        double provincialTax = discountedPrice * provincialRatio;
        double totalTax = federalTax + provincialTax;
        double finalPrice = discountedPrice + totalTax;
        
        //Prints out the item price, discount ratio/price, Federal and Provincial Tax
        //then the final price.
        System.out.println("");
        System.out.printf("%-15s: $%.2f\n", "Original Price", itemPrice);
        System.out.printf("%-15s: %.2f%%\n", "Discount Ratio", discountRatio);
        System.out.printf("%-15s: $%.2f\n", "Price before Tax", discountedPrice);
        System.out.println("-----------------------------------");
        System.out.printf("%-15s: $%.2f\n", "Federal Tax", federalTax);   
        System.out.printf("%-15s: $%.2f\n", "Provincial Tax", provincialTax);
        System.out.printf("%-15s: $%.2f\n", "Final Price", finalPrice);
    }
    
}
