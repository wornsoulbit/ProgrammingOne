package basiccalculator;

import java.util.Scanner;

/**
 * A basic calculator that can add, subtract, divide, and multiply.
 * 
 * @author Alexander Vasil
 */
public class BasicCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers, seperated by spaces: ");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.print("Please select an operation: +, -, *, /: ");

        char oper = input.next().charAt(0);

        double result;
        if (oper == '+') {
            result = calcSum(num1, num2);
        } else if (oper == '-') {
            result = calcSubtract(num1, num2);
        } else if (oper == '*') {
            result = calcMultiply(num1, num2);
        } else if (oper == '/'){
            result = calcDivide(num1, num2);
        } else {
            System.out.println("The chosen operator is invalid.");
            return;
        }

        System.out.printf("%.2f %c %.2f = %.2f\n", num1, oper, num2, result);
    }

    /**
     * To calculate the sum of two numbers.
     *
     * @param num1 first number that a user inputs.
     * @param num2 second number that a user inputs.
     * @return the sum of the two numbers.
     */
    public static double calcSum(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * To calculate the division of two numbers.
     *
     * @param num1 first number that a user inputs.
     * @param num2 second number that a user inputs.
     * @return the division of two numbers.
     */
    public static double calcDivide(double num1, double num2) {
        return num1 / num2;
    }

    /**
     * To calculate the subtraction of two numbers.
     *
     * @param num1 first number that a user inputs.
     * @param num2 second number that a user inputs.
     * @return the subtraction of two numbers.
     */
    public static double calcSubtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * To calculate the subtraction of two numbers.
     *
     * @param num1 first number that a user inputs.
     * @param num2 second number that a user inputs.
     * @return the subtraction of two numbers.
     */
    public static double calcMultiply(double num1, double num2) {
        return num1 * num2;
    }
    
}
