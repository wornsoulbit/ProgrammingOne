package hidecharacter;

/**
 * takes a string, and an index, then create a string, in which all characters
 * in the string are hidden (display as dash “-”) and only the one at that idx
 * is displayed. If the idx is out of the range (too big or too small), then
 * just return the original string.
 *
 * @author Alex Vasil
 */
public class HideCharacter {

    public static void main(String[] args) {
        System.out.println(hideChar("hello", 5));
    }

    /**
     * create a string, in which all characters in the string are hidden
     * (display as dash “-”) and only the one at that idx is displayed.
     *
     * @param strIn the initial string.
     * @param idx the character that is not hidden.
     * @return a hidden string e.g. "Hello" idx 2 -> "--l--".
     */
    public static String hideChar(String strIn, int idx) {
        String strOut = "";
        
        if (idx < 0 || idx > strIn.length()) {
            return strIn;
        }
        
        for (int i = 0; i < strIn.length(); i++) {
            strOut += idx == i ? strIn.charAt(i) : "-";
        }
        return strOut;
    }

}
