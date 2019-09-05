package totalpricecalculator;

/**
 * This will calculate the total price of items bought including tips if needed.
 * @author Alexander Vasil
 */
public class TotalPriceCalculator {
    
    public static void main(String[] args) {
        //Sets the menu item price, federal tax, provincal and tip percentage rate.
        double menuPrice = 20; 
        double fedTax =0.05;
        double provincalTax = 0.09975;
        double tipPercentage = 0.15; 
        //prints Total price including tips, then prints the total cost.
        System.out.print("Total Price including tips: ");
        System.out.println(menuPrice*(1+fedTax+provincalTax)*(1+tipPercentage));
        
        //Sets and prints the value of num
//        double num = (3%5+1.1)*(28/10);
//        System.out.println(num);

    }
    
}
