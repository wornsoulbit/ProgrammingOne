package copystring;

/**
 * Take an input string e.g. "Hello" and repeat each letter in that string an
 * additional time to get the output string e.g. "HHeelllloo".
 * 
 * @author Alex Vasil
 */
public class CopyString {

    public static void main(String[] args) {
        System.out.println(repeatChar("point"));
    }

    /**
     * Repeats each character in a given string an additional time e.g. "Hi" to
     * "HHii"
     * 
     * @param strIn the inputed string.
     * @return the String with the additional characters in it.
     */
    public static String repeatChar(String strIn) {
        String strOut = "";
        for (int i = 0; i < strIn.length(); i++) {
            strOut += strIn.charAt(i) + "" + strIn.charAt(i);
        }
        return strOut;
    }
}
