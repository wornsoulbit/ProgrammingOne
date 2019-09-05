package totalpricecalculator;

/**
 * This will calculate the total price of items bought including tips if needed.
 * @author Alexander Vasil
 */
public class TotalPriceCalculator {
    
    public static void main(String[] args) {
        //Sets the menu item price, federal tax, provincal and tip percentage rate.
        double menuPrice = 20; 
        double federalTaxRate =0.05;
        double provincialTaxRate = 0.09975;
        double tipPercentage = 0.15; 
        //calculates the federal, provincial and the total amount after tax.
        double federalTax = menuPrice * federalTaxRate;
        double procincialTax = menuPrice * provincialTaxRate;
        double totalTax = federalTax + procincialTax;
        //calculates the total amount for tips, final price, and final price with tips
        double tips = (menuPrice+totalTax) * tipPercentage; 
        double finalPrice = menuPrice +totalTax;
        double finalPriceTips = menuPrice + totalTax + tips;
        //prints the federal and provincial tax rate, the total amount of the tips, and the total price with and without tips.
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Federal tax: " + federalTaxRate*100 + "%");
        System.out.println("Provincial tax: " + provincialTaxRate*100+ "%");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Tips: $"+tips);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total Price without tips: $" + finalPrice);
        System.out.println("Total Price including tips: $" + finalPriceTips);
        
        //Sets and prints the value of num
//        double num = (3%5+1.1)*(28/10);
//        System.out.println(num);

    }
    
}
