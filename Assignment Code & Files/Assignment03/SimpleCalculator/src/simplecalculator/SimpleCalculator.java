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
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print("Please choose an operation: (+, -, *, /): ");
        char oper = input.next().charAt(0);
        input.nextLine();
        System.out.print("Please enter a formula: e.g. \"3.14 * 2\": ");
        String formula = input.nextLine();
        
        System.out.println(calcResult("3.14 * 2"));
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
     * calculate based on the operator with two numbers.
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

    public static double calcResult(String formula) {
        int firstNumLength = formula.indexOf(' ');
        double firstNum = Integer.parseInt(formula.substring(0, firstNumLength + 1));
        return firstNum;
    }
}
