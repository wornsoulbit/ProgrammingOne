package pricecalculator;

import java.util.Scanner;

/**
 * Calculates the price of the item with the discount and taxes included
 * @author Alexander Vasil
 */
public class PriceCalculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the price of the item: ");
        double itemPrice = input.nextDouble();
        
        System.out.print("Enter the discount: ");
        double discountRatio = input.nextDouble();
        double discountedPrice = itemPrice - (itemPrice * discountRatio / 100);
        double federalRatio = 0.05; //5%
        double provincialRatio = 0.0975; //9.975%
        
        double federalTax = discountedPrice * federalRatio;
        double provincialTax = discountedPrice * provincialRatio;
        double totalTax = federalTax + provincialTax;
        double finalPrice = discountedPrice + totalTax;
        
        System.out.printf("%-15s: $%.2f\n", "Original Price", itemPrice);
        System.out.printf("%-15s: %.2f%%\n", "Discount Ratio", discountRatio);
        System.out.printf("%-15s: $%.2f\n", "Price before Tax", discountedPrice);
        System.out.println("-----------------------------------");
        System.out.printf("%-15s: $%.2f\n", "Federal Tax", federalTax);   
        System.out.printf("%-15s: $%.2f\n", "Provincial Tax", provincialTax);
        System.out.printf("%-15s: $%.2f\n", "Final Price", finalPrice);
    }
    
}
