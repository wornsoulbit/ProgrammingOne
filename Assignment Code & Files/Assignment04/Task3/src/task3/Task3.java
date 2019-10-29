package task3;

/**
 * Calculates the salary of an employee year over year with an increase in the
 * workers salary .
 *
 * @author Alex Vasil
 */
public class Task3 {

    public static void main(String[] args) {
        System.out.printf(".2f", calcFutureSalary(30000, 5));
    }

    /**
     * Calculates the future salary of an employee based off of how many years
     * they've worked for the company.
     *
     * @param currentSal the employee's current yearly salary.
     * @param year the number of years the employee worked for the employer.
     * @return the future salary based on how many years the employee worked for
     * the company.
     */
    public static double calcFutureSalary(double currentSal, int year) {
        double yearIntOne = 0.03;
        double yearIntTwo = 0.05;
        double yearIntThree = 0.08;

        for (int i = 1; i <= year; i++) {
            if (i <= 3) {
                currentSal += currentSal * yearIntOne;
            } else if (i > 3 && i <= 10) {
                currentSal += currentSal * yearIntTwo;
            } else {
                currentSal += currentSal * yearIntThree;
            }
        }
        return currentSal;
    }
}
