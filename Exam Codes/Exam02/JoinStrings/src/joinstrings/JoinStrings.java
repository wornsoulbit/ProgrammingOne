package joinstrings;

/**
 * Joins two strings together to form one single string, if the first string is
 * empty then output the second string added to it self e.g.: "" and "Hi" to
 * "HiHi", if the second string is empty then same as previous but with the
 * first string, otherwise if both of the strings are not empty output both
 * strings together, e.g. "Hello" and "Java" to "HelloJava".
 *
 * @author Alex Vasil
 */
public class JoinStrings {

    public static void main(String[] args) {
        System.out.println(joinStrings("", ""));
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
