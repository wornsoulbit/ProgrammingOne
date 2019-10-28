package randomexample;

import java.util.Random;

/**
 * Examples of random number generators.
 * 
 * @author Alex Vasil
 */
public class RandomExample {

    public static void main(String[] args) {
//        Random rand = new Random();
//        
//        int totalTries = 100000; 
//        int num;
//        int evenCounter = 0;
//        
//        for (int i = 0; i < totalTries; i++) {
//            num = rand.nextInt(2);
//            
//            if (num == 0) {
//                evenCounter++;
//            }
//        }
//        
//        double probability = (double) evenCounter / totalTries;
//        System.out.printf("The probability of %d / %d is: %f\n", 
//                evenCounter, totalTries, probability);

        Random rand = new Random();
        
        int dice = rand.nextInt(6) + 1;
        int listLength = 10; // The number of numbers in a list of numbers.
        int stepLength = 2; // The length of a list of numbers e.g. {5, 7, 9, 11, 13}
        int min = 5; // The minimum number in a list of numbers e.g. {5, 7, 9, 11, 13}
        int num1 = rand.nextInt(listLength) * stepLength + min;
        int num2 = rand.nextInt(5) * 5 - 10; // for {-10, -5, 0, 5, 10}
        int num3 = rand.nextInt(5) * 4 - 1; // for {-1, 3, 7, 11, 15}
        System.out.println(num1);
    }
    
}
