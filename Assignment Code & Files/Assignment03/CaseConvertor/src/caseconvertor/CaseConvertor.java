package caseconvertor;

import java.util.Scanner;

/**
 * Convert the case sensitivity of a user inputed string to a specified case
 * sensitivity.
 *
 * @author Alexander Vasil
 */
public class CaseConvertor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String word = input.nextLine().trim();

        System.out.printf("%s\n %s\n %s\n %s\n",
                "Please choose a type of case: ",
                "1. 'l' or 'L' for lowercase",
                "2. 'u' or 'U' for uppercase",
                "3. 't' or 'T' for titlecase");
        char caseType = input.nextLine().charAt(0);
        
        System.out.printf("\n%-37s: %s\n", "Original word", word);
        System.out.printf("%-37s: %s\n", "Calling the first convertCase method",
                convertCase(word));
        System.out.printf("%-37s: %s\n", "Calling the second convertCase method",
                convertCase(word, caseType));
    }

    /**
     * Converts the given string to Xxxxx.
     *
     * @param word the initial string.
     * @return the string in Xxxxx.
     */
    public static String toTitleCase(String word) {
        return Character.toUpperCase(word.charAt(0))
                + word.substring(1).toLowerCase();
    }

    /**
     * Converts the given string to Xxxxx.
     *
     * @param word the initial string.
     * @return the string as Xxxxx.
     */
    public static String convertCase(String word) {
        return toTitleCase(word);
    }

    /**
     * Converts the given string to Xxxxx.
     *
     * @param word the initial string.
     * @param caseType the type of casing the user wants.
     * @return the string as specified by the user e.g. XXXXX; Xxxxx; xxxxx.
     */
    public static String convertCase(String word, char caseType) {
        if (caseType == 'l' || caseType == 'L') {
            return word.toLowerCase();
        } else if (caseType == 'u' || caseType == 'U') {
            return word.toUpperCase();
        } else {
            return Character.toUpperCase(word.charAt(0))
                    + word.substring(1).toLowerCase();
        }
    }
}
