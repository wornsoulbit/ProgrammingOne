package generatealphabetstring;

/**
 * receive a number that indicates how many alphabet letters to generate, the
 * case could be ‘u’ ‘U ’ ‘l ’ ‘L’ to indicate if you want the output to be in
 * uppercase or lowercase. Then generate an alphabetical string that starts at
 * ‘a’. If num is 0 or negative, then return an empty string.
 *
 * @author Alex Vasil
 */
public class GenerateAlphabetString {

    public static void main(String[] args) {
        System.out.println(generateAlphabetString(12, 'l'));
    }

    /**
     * Generates the alphabet based on how many characters will be displayed
     * then the type of case it will be in uppercase or lowercase.
     *
     * @param num a number that indicates how many alphabet letters to generate.
     * @param caseType to indicate if you want the output to be in uppercase or
     * lowercase.
     * @return an alphabetical string that starts at ‘a’.
     */
    public static String generateAlphabetString(int num, char caseType) {
        String strOut = "";
        for (int i = 0; i < num; i++) {
            if (num < 0) {
                strOut = " ";
                break;
            }
            strOut += (char) ('a' + i);
        }
        
        if (caseType == 'u' || caseType == 'U') {
            return strOut.toUpperCase();
        } else {
            return strOut;
        }

    }

}
