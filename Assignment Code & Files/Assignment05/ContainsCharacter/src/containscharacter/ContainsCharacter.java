package containscharacter;

/**
 * takes a string and a character, then check if the string contains that
 * character or not. While checking, the method will ignore the case of the char
 * and the string.
 *
 * @author Alex Vasil
 */
public class ContainsCharacter {

    public static void main(String[] args) {
        System.out.println(containsIgnoreCase("hello", 'E'));
    }

    /**
     * takes a string and a character, then check if the string contains that
     * character or not.
     *
     * @param strIn the inputed String.
     * @param c the character that is being looked for.
     * @return true or false based on if the character is in the String
     * regardless of case type.
     */
    public static boolean containsIgnoreCase(String strIn, char c) {
        char lowerCaseChar = Character.toLowerCase(c);
        String lowerCaseStr = strIn.toLowerCase();
        
        for (int i = 0; i < strIn.length(); i++) {
            if (lowerCaseStr.charAt(i) == lowerCaseChar) {
                return true;
            }
        }
        return false;
    }

}
