package task4;

/**
 * Takes a string, and then shift every character inside by delta, then return
 * the new string.
 *
 * @author Alex Vasil
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println(incode("yeah!", -2));
    }

    /**
     * Takes a string, and then shift every character inside by delta, then
     * return the new string.
     *
     * @param strIn the initial String.
     * @param delta how to shift the letters.
     * @return the incoded string.
     */
    public static String incode(String strIn, int delta) {
        String tempStr = "";
        for (int i = 0; i < strIn.length(); i++) {
            if (strIn.charAt(i) < 65 || strIn.charAt(i) > 90 && strIn.charAt(i) < 97
                    || strIn.charAt(i) > 122) {
                tempStr += strIn.charAt(i);
            } else {
                tempStr += (char) ((strIn.charAt(i) - 'a')); 
            }
        }
        return tempStr;
    }

}
