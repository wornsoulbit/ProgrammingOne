package totalpricecalculator;

/**
 * This will calculate the total price of items bought including tips if needed.
 * @author Alexander Vasil
 */
public class TotalPriceCalculator {
    
    public static void main(String[] args) {
        //Sets the menu item price, federal tax, provincal and tip percentage rate.
        double menuPrice = 20; 
        double federalTaxRatio =0.05;
        double provincialTaxRatio = 0.09975;
        double tipPercentage = 0.15; 
        //calculates the federal, provincial and the total amount after tax.
        double federalTax = menuPrice * federalTaxRatio;
        double procincialTax = menuPrice * provincialTaxRatio;
        double totalTax = federalTax + procincialTax;
        
        double tips = (menuPrice+totalTax) * tipPercentage; 
        double finalPrice = menuPrice +totalTax;
        double finalPriceTips = menuPrice + totalTax + tips;
        //prints final price which includes taxes and tips.
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");      
        System.out.println("Federal tax: " + federalTaxRatio*100 + "%");        
        System.out.println("Provincial tax: " + provincialTaxRatio*100+ "%");
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
