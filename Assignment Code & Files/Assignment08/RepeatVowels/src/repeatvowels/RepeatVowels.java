
package repeatvowels;

/**
 * Repeats the vowels in a sentence.
 * 
 * @author Alex Vasil
 */
public class RepeatVowels {
    
    /**
     * Repeats the vowels in a sentence.
     * 
     * @param strIn the inputed sentence.
     * @return a new String with repeated vowels.
     */
    public static String repeatVowels(String strIn) {
        if (strIn == null || strIn.isEmpty())
            return strIn;
        
        String strOut = "";        
            for (int i = 0; i < strIn.length(); i++) {
                if (isVowel(strIn.charAt(i)))
                    strOut += "" + strIn.charAt(i) + strIn.charAt(i);
                else 
                    strOut += strIn.charAt(i);
            }
            return strOut;
    }
    
    /**
     * Checks to see if a letter is a vowel or not.
     * 
     * @param c the letter being checked.
     * @return if the letter is a vowel or not.
     */
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
