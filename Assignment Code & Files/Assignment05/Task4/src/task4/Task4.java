package task4;

/**
 * Takes a string, and then shift every character inside by delta, then return
 * the new string.
 *
 * @author Alex Vasil
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println(decode("Eua cuxq euaxykrl zuu jgtm ngxj, mktoay inorj!", 6));
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

            if (isNotAlphabet(strIn.charAt(i))) {
                strOut += strIn.charAt(i);
                continue;
            }

            if (checkCase(strIn.charAt(i))) {
                strOut += shiftCaseAlpha(strIn.charAt(i), convertRange(delta));
            } else {
                strOut += shiftCaseAlpha(strIn.charAt(i), convertRange(delta));
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
        delta = delta * (-1);
        String strOut = "";
        for (int i = 0; i < strIn.length(); i++) {

            if (isNotAlphabet(strIn.charAt(i))) {
                strOut += strIn.charAt(i);
                continue;
            }

            if (checkCase(strIn.charAt(i))) {
                strOut += shiftCaseAlpha(strIn.charAt(i), convertRange(delta));
            } else {
                strOut += shiftCaseAlpha(strIn.charAt(i), convertRange(delta));
            }

        }
        return strOut;
    }

    /**
     * Converts a number into a range of 1 to 26. e.g. num == 30 > 4
     *
     * @param delta the inputed number.
     * @return a number in the range of 1 to 26.
     */
    public static int convertRange(int delta) {
        return delta % 26;
    }

    /**
     * Checks to see if a letter is lowercase or uppercase and returns true for
     * lowercase, false for uppercase.
     *
     * @param letter the inputed letter.
     * @return true if the letter is lowercase, otherwise false.
     */
    public static boolean checkCase(char letter) {
        return Character.isLowerCase(letter);
    }

    /**
     * Checks to see if a character is in the English alphabet.
     *
     * @param character to see if its an English letter.
     * @return true if its in the English alphabet, otherwise false.
     */
    public static boolean isNotAlphabet(char character) {
        return !Character.isAlphabetic(character);
    }

    /**
     * Shifts a letter to a new letter. (caesar cipher)
     *
     * @param letter the inputed letter.
     * @param delta how far the letter will be shifted. e.g. 'Z', 2 -> 'B'
     * @return the shifted letter with the proper casing.
     */
    public static char shiftCaseAlpha(char letter, int delta) {
        if (checkCase(letter)) {

            if (letter + delta < 97) {
                return (char) (letter + 26 + delta);
            }

            if (letter + delta > 122) {
                return (char) (letter - 26 + convertRange(delta));
            } else {
                return (char) (letter + convertRange(delta));
            }

        } else {

            if (letter + delta < 65) {
                return (char) (letter + 26 + delta);
            }

            if (letter + delta > 90) {
                return (char) (letter - 26 + convertRange(delta));
            } else {
                return (char) (letter + convertRange(delta));
            }
        }
    }
}
