
package javaapplication;

/**
 *
 * @author Alex Vasil
 */
public class JavaApplication {
    
    /**
     * Repeats letters based on its position in the word. e.g. hello -> heelllllllooooo.
     * 
     * @param strIn the entered word.
     * @return the word with repeated letters.
     */
    public static String repeatLetters(String strIn) {
        if (strIn == null)
            return null;
        
        String strOut = "";        
        
            for (int i = 0; i < strIn.length(); i++) {
                for (int j = 0; j <= i; j++)
                    strOut += strIn.charAt(i);
            }
            return strOut;
    }
}
