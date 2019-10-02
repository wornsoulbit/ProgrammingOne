package milkcontainercalculator;

import java.util.Scanner;

/**
 * Create a project MilkContainerCalculator to ask the user to input how many 
 * gallons of milk needs to be packed (1 gallon = 3.78541 liters). A container 
 * can take 2 liters of milk, and the price is $0.13. Usually, 2% of milk will 
 * be spilled while packing (this part of milk is wasted). The government will 
 * cover 2.5% of the cost, and the company have to pay for the rest. Calculate 
 * how many containers are required, how much the government will pay and how 
 * much the company will pay.
 * 
 * @author Alexander Vasil
 */
public class MilkContainerCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many gallons of milk needs to be packed: ");
        double milkGallon = input.nextDouble();
        double milkLost = 0.02; //Average amount of milk lost.
        
        double containerCap = 2; //How many liters a container can hold.
        final double containerPrice = 0.13; //the price of the container.
        final double govRebate = 0.025;
        final double GALLON_TO_LITER = 3.78541;
          
        double milkLiter = milkGallon * GALLON_TO_LITER;
        double milkRemain = milkLiter - (milkLiter * milkLost);
        
        double containerAmount = Math.floor(milkRemain / containerCap);
        double finalCost = containerAmount * containerPrice;
        double govCost = finalCost * govRebate;
        double compCost = finalCost - govCost;
        
        System.out.printf("\n%-40s: %10.2f\n", 
                "Milk Quantity (Original in gallons)", milkGallon);
        System.out.printf("%-40s: %10.2f\n", 
                "Milk Quantity (Original in liters)", milkLiter);
        System.out.printf("%-40s: %10.2f\n", 
                "Milk Quantity (Remained in liters)", milkRemain);
        System.out.println("----------------------------------------------------");
        System.out.printf("%-40s: %10.2f\n", 
                "Container Capacity (In liters)", containerCap);
        System.out.printf("%-40s: %10.0f\n", 
                "Number of containers", containerAmount);
        System.out.printf("%-40s: %10.2f\n", "Container Price", containerPrice);
        System.out.printf("%-40s: %10.2f\n", "Container Cost", finalCost);
        System.out.printf("%-40s: %10.2f\n", "Government Cost", govCost);
        System.out.printf("%-40s: %10.2f\n", "Company Cost", compCost);
    }
    
}
