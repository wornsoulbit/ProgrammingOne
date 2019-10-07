package simplecalculator;

import java.util.Scanner;

/**
 * A simple addition, subtraction, multiplication and division calculator.
 *
 * @author Alexander Vasil
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter two numbers, seperated by a space: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.print("Please choose an operation: (+, -, *, /): ");
        char oper = input.next().charAt(0);
        input.nextLine();
        
        System.out.print("Please enter a formula: e.g. \"3.14 * 2\": ");
        String formula = input.nextLine();
        
        System.out.printf("\nCalling the first method: %.2f + %.2f = %.2f\n",
                num1, num2, calcResult(num1, num2));
        System.out.printf("Calling the second method: %.2f %c %.2f = %.2f\n",
                num1, oper, num2, calcResult(num1, num2, oper));
        System.out.printf("Calling the third method: %s = %.2f",
                formula, calcResult(formula));
    }

    /**
     * Calculates the addition of two numbers.
     *
     * @param num1 number 1.
     * @param num2 number 2.
     * @return the addition of num1 and num2.
     */
    public static double calcResult(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Calculate based on the operator with two numbers.
     *
     * @param num1 number 1.
     * @param num2 number 2.
     * @param oper the operator (e.g. +, -, *, /).
     * @return the result based on the operator.
     */
    public static double calcResult(double num1, double num2, char oper) {
        if (oper == '+') {
            return num1 + num2;
        } else if (oper == '-') {
            return num1 - num2;
        } else if (oper == '*') {
            return num1 * num2;
        } else {
            return num1 / num2;
        }
    }
    
    
    /**
     * Calculate the value based on the numbers and the operators in the string.
     * 
     * @param formula the string to be calculated.
     * @return the result based on the string.
     */
    public static double calcResult(String formula) {
        int idxSpace = formula.indexOf(' ');
        int lastIdxSpace = formula.lastIndexOf(' ');
        
        double num1 = Double.parseDouble(formula.substring(0, idxSpace));
        double num2 = Double.parseDouble(formula.substring(lastIdxSpace + 1));
        char oper = formula.substring(idxSpace + 1, lastIdxSpace).charAt(0);
        
        if (oper == '+') {
            return num1 + num2;
        } else if (oper == '-') {
            return num1 - num2;
        } else if (oper == '*') {
            return num1 * num2;
        } else {
            return num1 / num2;
        }
    }
}
