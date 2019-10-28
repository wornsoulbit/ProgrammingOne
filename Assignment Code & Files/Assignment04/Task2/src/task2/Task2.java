package task2;

import java.util.Random;

/**
 * Calculate the average score based on a [0, 100] range.
 *
 * @author Alex Vasil
 */
public class Task2 {

    public static void main(String[] args) {
        System.out.println(calcAverageScore(3));
    }

    /**
     * Takes a positive integer to see how many will be generated and generates
     * the average of those numbers.
     *
     * @param num the number of integer that will be generated.
     * @return the average of the numbers.
     */
    public static double calcAverageScore(int num) {

        Random rand = new Random();

        int temp;
        double average = 0;
        int counter = 0;

        for (int i = 0; i <= num; i++) {
            temp = rand.nextInt(100);
            if (temp < 40) {
                continue;
            }
            counter++;
            average += temp;
        }

        return average / counter;
    }
}
