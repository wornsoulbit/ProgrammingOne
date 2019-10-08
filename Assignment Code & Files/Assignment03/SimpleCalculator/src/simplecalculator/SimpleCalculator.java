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
        String formula = input.nextLine().trim();

        System.out.printf("\n%-25s: %.2f + %.2f = %.2f\n", "Calling the first"
                + " method", num1, num2, calcResult(num1, num2));
        System.out.printf("%-25s: %.2f %c %.2f = %.2f\n", "Calling the second "
                + "method", num1, oper, num2, calcResult(num1, num2, oper));
        System.out.printf("%-25s: %s = %.2f\n", "Calling the third method",
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
        switch (oper) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
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
        
        switch (oper) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                return num1 / num2;
        }
    }
}
