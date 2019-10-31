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
        System.out.println(containsIgnoreCase("hello", 'a'));
    }

    /**
     * takes a string and a character, then check if the string contains that
     * character or not.
     *
     * @param str the inputed String.
     * @param c the character that is being looked for.
     * @return true or false based on if the character is in the String
     * regardless of case type.
     */
    public static boolean containsIgnoreCase(String str, char c) {
        Character.toLowerCase(c);
        char temp;
        for (int i = 0; i < str.length(); i++) {
            temp = str.toLowerCase().charAt(i);
            if (temp == c) {
                return true;
            }
        }
        return false;
    }

}
