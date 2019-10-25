package task1;

import java.util.Scanner;

/**
 * Calculate the amount of days there are in a month.
 * 
 * @author Alex Vasil
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number month and year seperated by a space: ");
        
        int month = input.nextInt();
        int year = input.nextInt();
        System.out.println(calcDays(month, year));
    }
    
    /**
     * Calculates how many days there are in a month.
     * 
     * @param month the chosen month in a number. e.g. 1 = January.
     * @param year the chosen year.
     * @return the number of days in a month.
     */
    public static int calcDays(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
        }
        
//        if (month == 1 || month == 3 || month == 5 || month == 7 || 
//                month == 8 || month == 10 || month == 12) {
//            return 31;
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            return 30;
//        } else {
//            if (isLeapYear(year)) {
//                return 29;
//            } else {
//                return 28;
//            }
//        }
    }
    
    /**
     * Checks to see if it's a leap year.
     * 
     * @param year the year.
     * @return true if its a leap year, false if its not.
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}
