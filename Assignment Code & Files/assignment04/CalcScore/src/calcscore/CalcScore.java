package calcscore;

import java.util.Random;

/**
 * Calculate the average score based on a [0, 100] range.
 *
 * @author Alex Vasil
 */
public class CalcScore {

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
        int numGenerate = 100; //Amount of numbers that will be generated.
        int numDiscard = 40; //Numbers below the value will be discarded.
        int randomNum;
        double sum = 0;
        int counter = 0;

        for (int i = 0; i < num; i++) {
            randomNum = rand.nextInt(numGenerate + 1);
            if (randomNum < numDiscard) {
                continue;
            }
            counter++;
            sum += randomNum;
        }

        return sum / counter;
    }
}
