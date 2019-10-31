package task4;

/**
 * Takes a string, and then shift every character inside by delta, then return
 * the new string.
 *
 * @author Alex Vasil
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println(encode("Java", -1));
    }

    /**
     * Takes a string, encodes it and then shift every character inside by
     * delta, then return the new string.
     *
     * @param strIn the initial String.
     * @param delta how to shift the letters.
     * @return the encoded string.
     */
    public static String encode(String strIn, int delta) {
        String strOut = "";
        for (int i = 0; i < strIn.length(); i++) {

            if (Character.isAlphabetic(strIn.charAt(i))) {
                strOut += shiftCaseAlpha(strIn.charAt(i), delta);
            } else {
                strOut += strIn.charAt(i);
            }

        }
        return strOut;
    }

    /**
     * Takes a string, decodes it by shifting it by delta the opposite way it
     * was encoded by.
     *
     * @param strIn the initial String.
     * @param delta how to shift the letters.
     * @return the decoded string.
     */
    public static String decode(String strIn, int delta) {
        String strOut = "";
        for (int i = 0; i < strIn.length(); i++) {

            if (Character.isAlphabetic(strIn.charAt(i))) {
                strOut += shiftCaseAlpha(strIn.charAt(i), -delta % 26);
            } else {
                strOut += strIn.charAt(i);
            }

        }
        return strOut;
    }

    /**
     * Shifts a letter to a new letter. (caesar cipher)
     *
     * @param letter the inputed letter.
     * @param delta how far the letter will be shifted. e.g. 'Z', 2 -> 'B'
     * @return the shifted letter with the proper casing.
     */
    public static char shiftCaseAlpha(char letter, int delta) {
//        if (checkCase(letter)) {
//
//            if (letter + delta < 97) {
//                return (char) (letter + 26 + delta);
//            }
//
//            if (letter + delta > 122) {
//                return (char) (letter - 26 + delta);
//            } else {
//                return (char) (letter + delta);
//            }
//
//        } else {
//
//            if (letter + delta < 65) {
//                return (char) (letter + 26 + delta);
//            }
//
//            if (letter + delta > 90) {
//                return (char) (letter - 26 + delta);
//            } else {
//                return (char) (letter + delta);
//            }
//        }
        
        // if delta < 0 
        // do something to bring it to positive
        if (delta < 0) {
            delta = (delta % 26) + 26;
        }
        char startLetter = Character.isUpperCase(letter) ? 'A' : 'a';
        return (char) ((letter - startLetter + delta % 26) + startLetter);
    }
    
}
