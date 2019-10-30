package task2;

/**
 * takes a string, and an index, then create a string, in which all characters
 * in the string are hidden (display as dash “-”) and only the one at that idx
 * is displayed. If the idx is out of the range (too big or too small), then
 * just return the original string.
 *
 * @author Alex Vasil
 */
public class Task2 {

    public static void main(String[] args) {
        System.out.println(hideChar("hello", -3));
    }

    /**
     * create a string, in which all characters in the string are hidden
     * (display as dash “-”) and only the one at that idx is displayed.
     *
     * @param str the initial string.
     * @param idx the character that is not hidden.
     * @return a hidden string e.g. "Hello" idx 2 -> "--l--".
     */
    public static String hideChar(String str, int idx) {
        String strOut = "";
        
        if (idx < 0 || idx > str.length()) {
            return str;
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (idx == i) {
                strOut += str.charAt(i);
            } else {
                strOut += "-";
            }
        }
        return strOut;
    }

}
