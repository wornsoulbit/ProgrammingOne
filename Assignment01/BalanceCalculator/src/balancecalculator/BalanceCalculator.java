package balancecalculator;

import java.util.Scanner;

/**
 * Interest per Annum (year) calculator
 * @author Alexander Vasil
 */
public class BalanceCalculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the initial balance: ");
        double initBal = input.nextDouble();
        
        System.out.print("Please enter the annual interest rate: ");
        double intRate = input.nextDouble();
        
        System.out.print("Please enter the amount of years the client wants the "
                + "money in the account: ");
        double numYears = input.nextDouble();
        
        double balWithInt = initBal; 
        for (int i = 0; i < numYears; i++) {
            balWithInt += balWithInt * intRate / 100;
        }
        System.out.println("");
        System.out.printf("%-23s: %8.2f\n", "Inital Balance", initBal);
        System.out.printf("%-23s: %8.2f%%\n", "Annual Interest Rate", intRate);
        System.out.printf("%-23s: %9.0f\n", "Years of Saving", numYears);
        System.out.println("------------------------------------");
        System.out.printf("");
        System.out.printf("%s %.0f %-7s: $%8.2f\n", "Balance After", numYears, 
                "Years", balWithInt);

    }
    
}
