package simplecalculator;

import java.util.Scanner;

/**
 * Create a project SimpleCalculator that asks the user to input 5 numbers, then
 * ignore the smallest number and the largest number, and then calculate the sum
 * and the average of the remaining 3 number, print the result on the screen.
 * e.g.: 4, 1, 6, 9, 3, the min is 1, the max is 9, the rest are 3, 4, 6, and
 * the average of the three are 4.33. You have to use printf() and tune the
 * width to align the “:” in the printing result.
 *
 * @author Alexander Vasil
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 5 numbers, seperated by spaces: ");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();

        double maxVal = calcMax(num1, num2, num3, num4, num5);
        double minVal = calcMin(num1, num2, num3, num4, num5);
        
        double restSum = calcRestSum(num1, num2, num3, num4, num5,
                minVal, maxVal);
        double restAvg = calcRestAvg(restSum);
        
        printResults(num1, num2, num3, num4, num5, maxVal, minVal,
                restSum, restAvg);
    }

    /**
     * Calculates the maximum value of a list of numbers
     *
     * @param num1 the first number that the user inputs
     * @param num2 the second number that the user inputs
     * @param num3 the third number that the user inputs
     * @param num4 the fourth number that the user inputs
     * @param num5 the fifth number that the user inputs
     * 
     * @return the maximum value of a list of numbers
     */
    public static double calcMax(double num1, double num2, double num3,
            double num4, double num5) {
        return Math.max(num1, Math.max(num2, Math.max(num3,
                Math.max(num4, num5))));
    }

    /**
     * Calculates the minimum value of a list of numbers
     *
     * @param num1 the first number that the user inputs
     * @param num2 the second number that the user inputs
     * @param num3 the third number that the user inputs
     * @param num4 the fourth number that the user inputs
     * @param num5 the fifth number that the user inputs
     * 
     * @return the minimum value of a list of numbers
     */
    public static double calcMin(double num1, double num2, double num3,
            double num4, double num5) {
        return Math.min(num1, Math.min(num2, Math.min(num3,
                Math.min(num4, num5))));
    }
    /**
     * 
     * @param num1 the first number that the user inputs.
     * @param num2 the second number that the user inputs.
     * @param num3 the third number that the user inputs.
     * @param num4 the fourth number that the user inputs.
     * @param num5 the fifth number that the user inputs.
     * @param maxValue the maximum value.
     * @param minValue the minimum value.
     * @return the sum of the values minus the max and min values.
     */
    public static double calcRestSum(double num1, double num2, double num3,
            double num4, double num5, double minValue, double maxValue) {
        return num1 + num2 + num3 + num4 + num5 - maxValue - minValue;
    }
    
    /**
     * 
     * @param restSum the sum of 3 numbers minus the max and min values.
     * @return the average of 3 numbers minus the max and min values.
     */
    public static double calcRestAvg(double restSum) {
        return restSum / 3;
    }
    
    /**
     * Prints num1 to num5, maxValue, minValue, restSum, and restAvg.
     * 
     * @param num1 the first number that the user inputs.
     * @param num2 the second number that the user inputs.
     * @param num3 the third number that the user inputs.
     * @param num4 the fourth number that the user inputs.
     * @param num5 the fifth number that the user inputs.
     * @param maxValue the maximum value.
     * @param minValue the minimum value.
     * @param restSum the sum of 3 numbers minus the max and min values.
     * @param restAvg the average of 3 numbers minus the max and min values.
     */
    public static void printResults(double num1, double num2, double num3,
            double num4, double num5, double maxValue, double minValue, 
            double restSum, double restAvg) {
        System.out.printf("\n%-20s: %.2f, %.2f, %.2f, %.2f, %.2f\n",
                "Input numbers", num1, num2, num3, num4, num5);
        System.out.printf("%-20s: %.2f\n", "Largest number", maxValue);
        System.out.printf("%-20s: %.2f\n", "Smallest number", minValue);
        System.out.printf("%-20s: %.2f\n", "Sum of the rest", restSum);
        System.out.printf("%-20s: %.2f\n", "Average of the rest", restAvg);
    }
}
