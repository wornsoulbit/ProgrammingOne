
package repeatvowels;

/**
 *
 * @author Alex Vasil
 */
public class RepeatVowels {
    
    public static String repeatVowels(String strIn) {
        if (strIn == null)
            return null;
        
        String strOut = "";        
            for (int i = 0; i < strIn.length(); i++) {
                if (isVowel(strIn.charAt(i)))
                    strOut += "" + strIn.charAt(i) + strIn.charAt(i);
                else 
                    strOut += strIn.charAt(i);
            }
            return strOut;
    }
    
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
