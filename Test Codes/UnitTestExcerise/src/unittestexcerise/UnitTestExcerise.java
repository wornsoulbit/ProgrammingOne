package unittestexcerise;

/**
 *
 * @author Alex Vasil
 */
public class UnitTestExcerise {
    
    public static int factorial(int num) {
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
        } 
        return total;
    }
    
    public static String reverseString(String strIn) {
        if(strIn == null) 
            return null;
        String strOut = "";
        
        for (int i = strIn.length() - 1; i >= 0; i--) {
            strOut += strIn.charAt(i);
        }
        
        return strOut;
    }
    
    public static void main(String[] args) {

    }
    
}
