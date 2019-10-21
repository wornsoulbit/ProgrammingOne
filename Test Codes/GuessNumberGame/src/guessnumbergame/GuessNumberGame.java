package guessnumbergame;

import java.util.Random;
import java.util.Scanner;

/**
 * To generate a random number and ask the user to guess it.
 * 
 * @author Alex Vasil
 */
public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int boundary = 10; // The range should be from [1, 10[
        
        Random rand = new Random();
        int secretNum = rand.nextInt(boundary) + 1;
        int maxTries = 3; 
        int guessNum;
        boolean win = false;
        
        for (int i = 0; i < maxTries; i++) {
            System.out.printf("Please guess a number between [1, %d]\n", boundary);
            guessNum = input.nextInt();
            if (guessNum > secretNum)
                System.out.println("Your number is too big");
            else if (guessNum < secretNum)
                System.out.println("Your number is too small");
            else {
                win = true;
                break;
            }
        }
        if (win) {
            System.out.printf("You guessed the number %d correct!\n", secretNum);
        } else {
            System.out.printf("You didn't guess the number %d correctly\n", secretNum);
        } 
    }
}
