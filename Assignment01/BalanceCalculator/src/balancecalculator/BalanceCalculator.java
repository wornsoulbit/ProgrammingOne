package balancecalculator;

import java.util.Scanner;

/**
 * Interest per Annum (year) calculator
 * @author Alexander Vasil
 */
public class BalanceCalculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asks the user to input the initial balance, annual interest rate and number 
        //of years the money will stay in the account.
        System.out.print("Please enter the initial balance: ");
        double initBal = input.nextDouble();
        System.out.print("Please enter the annual interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Please enter the amount of years the client wants the "
                + "money in the account: ");
        double numYears = input.nextDouble();

        //calculates the total bal with interest by using compound interest formula.
        double totalBal = initBal * Math.pow(1 + (interestRate / 100), numYears);
        
        //Calculates the balance with interest in a repetative for loop until i 
        //is less than numYears.
//        double totalBal = initBal; 
//        for (int i = 0; i < numYears; i++) {
//            totalBal += totalBal * intRate / 100;
//        }
        
        //Prints initial balance, interest rate, years of saving and balance after x
        //years of saving.
        System.out.println("");
        System.out.printf("%-23s: %9.2f\n", "Inital Balance", initBal);
        System.out.printf("%-23s: %8.2f%%\n", "Annual Interest Rate", interestRate);
        System.out.printf("%-23s: %9.0f\n", "Years of Saving", numYears);
        System.out.println("------------------------------------");
        System.out.printf("");
        System.out.printf("%s %.0f %-7s: $%8.2f\n", "Balance After", numYears, 
                "Years", totalBal);
    }
    
}
