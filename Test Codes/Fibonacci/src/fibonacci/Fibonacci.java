package fibonacci;

/**
 *
 * @author Alex Vasil
 */
public class Fibonacci {

    /**
     * To calculate the fibonacci number of a input number.
     * 
     * @param num the input number.
     * @return the fibonacci number.
     */
    public static int fibonacci(int num) {
        if (num < 0)
            return  -1;
        if (num < 2)
            return num;
        int f0 = 0;
        int f1 = 1;
        int result = 0;
        for (int i = 2; i <= num; i++) {
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }
        return result;
    }
}
