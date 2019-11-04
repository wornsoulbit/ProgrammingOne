package joinstrings;

/**
 * Write a method joinStrings () , the method takes two string s, and a. if the
 * first String is empty and the second string is not, then the output string is
 * the second string joined with itself. b. if the first String is not empty and
 * the second string is, then the output string is the first string joined with
 * itself. c. if both the two strings are not empty, then the output string is
 * the first string joined with the second string.
 *
 * @author Alex Vasil
 */
public class JoinStrings {

    public static void main(String[] args) {
        System.out.println(joinStrings("Java", ""));
    }

    /**
     * Joins two strings together based on if the two strings contains text or
     * not e.g. "" and "Hello" > "HelloHello"; "hi" and "" > "hihi"; "Hello" and
     * "Hi" > "HelloHi".
     *
     * @param strIn the first String.
     * @param strIn2 the second String.
     * @return the strings joined together e.g. "HelloHello", "HiHello", etc...
     */
    public static String joinStrings(String strIn, String strIn2) {
        if (strIn.isEmpty() || strIn2.isEmpty()) {
            if (strIn2.isEmpty()) {
                return strIn + strIn;
            }
            return strIn2 + strIn2;
        } else {
            return strIn + strIn2;
        }
    }
}
