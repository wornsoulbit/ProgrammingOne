package overloadexamples;

import java.util.Scanner;

/**
 * Examples of overloads by calculating the century and more.
 *
 * @author Alexander Vasil
 */
public class OverloadExamples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Please enter a year: ");
        System.out.println(min(1, 2, 1.5));
    }

    /**
     * To calculate the century of the year.
     *
     * @param year the year inputed by the user.
     * @return the century of the year.
     */
    public static int calcCentury(int year) {
        return year / 100 + 1;
    }

    /**
     * To calculate the century of the year.
     *
     * @param year the year inputed by the user.
     * @return the century of the year.
     */
    public static int calcCentury(String year) {
        return Integer.parseInt(year.substring(0, year.length() - 2)) + 1;
    }

    /**
     * To calculate the decade of the year.
     *
     * @param year the year inputed by the user.
     * @return the decade of the year.
     */
    public static int calcDecade(int year) {
        return year % 100 / 10 * 10;
    }

    /**
     * To calculate the decade of the year.
     *
     * @param year the year inputed by the user.
     * @return the decade of the year.
     */
    public static int calcDecade(String year) {
        return Integer.parseInt(year.substring(year.length() - 1, year.length())) * 10;
    }

    /**
     * Sing happy birthday song.
     *
     * @param name the name of the a person.
     */
    public static void singHappyBirthday(String name) {
        System.out.println("Happy birthday to you~");
        System.out.println("Happy birthday to you~");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.println("Happy birthday to you~");
    }

    /**
     * Sing happy birthday song.
     */
    public static void singHappyBirthday() {
        System.out.println("Happy birthday to you~");
        System.out.println("Happy birthday to you~");
        System.out.println("Happy birthday dear friends~");
        System.out.println("Happy birthday to you~");
    }

    /**
     * Find the largest number from two numbers.
     *
     * @param num1 the 1st number.
     * @param num2 the 2nd number.
     * @return the largest number out of the two.
     */
    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    /**
     * Find the largest number from three numbers.
     *
     * @param num1 the 1st number.
     * @param num2 the 2nd number.
     * @param num3 the 3rd number.
     * @return the largest number out of the three.
     */
    public static double max(double num1, double num2, double num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    /**
     * Find the smallest number from two numbers.
     *
     * @param num1 the 1st number.
     * @param num2 the 2nd number.
     * @return the smallest number out of the two.
     */
    public static double min(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    /**
     * Find the smallest number from three numbers.
     *
     * @param num1 the 1st number.
     * @param num2 the 2nd number.
     * @param num3 the 3rd number.
     * @return the smallest number out of the three.
     */
    public static double min(double num1, double num2, double num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
