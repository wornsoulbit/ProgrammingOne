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
        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();
        double thirdNum = input.nextDouble();
        double fourthNum = input.nextDouble();
        double fifthNum = input.nextDouble();
        
        double mean = (firstNum + secondNum + thirdNum + fourthNum + fifthNum) / 5;
        
        double minNum = Math.min(firstNum, Math.min(secondNum, Math.min(thirdNum,
            Math.min(fourthNum, fifthNum))));
        double maxNum = Math.max(firstNum, Math.max(secondNum, Math.max(thirdNum,
                Math.max(fourthNum, fifthNum))));
        
        double stdDev = Math.sqrt((Math.pow((firstNum - mean), 2) + Math.pow(
                (secondNum - mean), 2) + Math.pow((thirdNum - mean), 2) + Math.pow(
                (fourthNum - mean), 2) + Math.pow((fifthNum - mean), 2)) / 5);
        
        System.out.printf("%-20s: %.2f, %.2f, %.2f, %.2f, %.2f\n", "Numbers", firstNum,
                secondNum, thirdNum, fourthNum, fifthNum);
        System.out.printf("%-20s: %.2f\n", "Mean", mean);
        System.out.printf("%-20s: %.2f\n", "Minimum", minNum);
        System.out.printf("%-20s: %.2f\n", "Maximum", maxNum);
        System.out.printf("%-20s: %.2f\n", "Standard Deviation", stdDev);
    }
    
}
