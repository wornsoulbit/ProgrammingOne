package simplestatisticcalculator;

import java.util.Scanner;

/**
 * Asks the user to input 5 numbers, from that finds the mean, minimum, maximum, 
 * and standard deviation.
 * @author Alexander Vasil
 */
public class SimpleStatisticCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please input 5 numbers seperated by spaces: ");
        double numOne = input.nextDouble();
        double numTwo = input.nextDouble();
        double numThree = input.nextDouble();
        double numFour = input.nextDouble();
        double numFive = input.nextDouble();
        
        double mean = (numOne + numTwo + numThree 
                + numFour + numFive) / 5;
        
        double minNum = Math.min(numOne, Math.min(numTwo, 
                Math.min(numThree, Math.min(numFour, numFive))));
        
        double maxNum = Math.max(numOne, Math.max(numTwo, 
                Math.max(numThree, Math.max(numFour, numFive))));
        
        double stdDev = Math.sqrt((Math.pow(numOne - mean, 2) 
                + Math.pow(numTwo - mean, 2) 
                + Math.pow(numThree - mean, 2) 
                + Math.pow(numFour - mean, 2)
                + Math.pow(numFive - mean, 2)) / 5);
        
        System.out.printf("%-20s: %.2f, %.2f, %.2f, %.2f, %.2f\n", "Numbers",
                numOne, numTwo, numThree, numFour, numFive);
        System.out.printf("%-20s: %.2f\n", "Mean", mean);
        System.out.printf("%-20s: %.2f\n", "Minimum", minNum);
        System.out.printf("%-20s: %.2f\n", "Maximum", maxNum);
        System.out.printf("%-20s: %.2f\n", "Standard Deviation", stdDev);
    }
    
}
