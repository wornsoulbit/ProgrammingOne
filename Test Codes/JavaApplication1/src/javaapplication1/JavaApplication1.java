package javaapplication1;

import java.util.Scanner;

/**
 * Asks the user to input a birth year and outputs a century and decade.
 *
 * @author Alexander Vasil
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your birth year: ");
        String birthYear = input.next();

        int century = calcCentury(birthYear);
        int decade = calcDecade(birthYear);

        System.out.printf("\n%-13s: %s\n", "Birth Year:", birthYear);
        System.out.printf("%-13s: %d\n", "Century:", century);
        System.out.printf("%-13s: %d\n", "Decade:", decade);
    }

    /**
     * Calculate the decade based on a birth year.
     *
     * @param birthYear the birth year of the person.
     * @return the decade of a person's birth year.
     */
    public static int calcDecade(String birthYear) {
        return Integer.parseInt(birthYear.substring(2, 3)) * 10;
    }

    /**
     * Calculate the century based on a birth year.
     *
     * @param birthYear the birth year of the person.
     * @return the century of a person's birth year.
     */
    public static int calcCentury(String birthYear) {
        return Integer.parseInt(birthYear.substring(0, 2)) + 1;
    }
}
