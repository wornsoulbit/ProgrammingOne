
package primenumberchecker;

/**
 *
 * @author Alex Vasil
 */
public class PrimeNumberChecker {
    
    /**
     * 
     * @param num
     * @return 
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
