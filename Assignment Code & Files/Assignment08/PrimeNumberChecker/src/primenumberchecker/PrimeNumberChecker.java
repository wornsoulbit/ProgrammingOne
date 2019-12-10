
package primenumberchecker;

/**
 * Checks whether a number is prime or not.
 * 
 * @author Alex Vasil
 */
public class PrimeNumberChecker {
    
    /**
     * Checks if a number is a prime number.
     * 
     * @param num the inputed number.
     * @return if the number is prime or not.
     */
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) 
            return false;
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) 
                return false;
        }
        return true;
    }
}
