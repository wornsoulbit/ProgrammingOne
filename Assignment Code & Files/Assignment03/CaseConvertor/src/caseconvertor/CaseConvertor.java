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
        String word = input.nextLine();

        System.out.printf("%s\n %s\n %s\n %s\n",
                "Please choose a type of case: ",
                "1. 'l' or 'L' for lowercase",
                "2. 'u' or 'U' for uppercase",
                "3. 't' or 'T' for titlecase");
        System.out.print("Enter your choice: ");
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
                + word.substring(1).toLowerCase().trim();
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
     * Converts the given string to a specified case type e.g. XXXXX; Xxxxx;
     * xxxxx.
     *
     * @param word the initial string.
     * @param caseType the type of casing the user wants.
     * @return the string as specified by the user e.g. XXXXX; Xxxxx; xxxxx.
     */
    public static String convertCase(String word, char caseType) {
        String newWord = word.trim();
        
        if (caseType == 'l' || caseType == 'L') 
            return newWord.toLowerCase();
        else if (caseType == 'u' || caseType == 'U')
            return newWord.toUpperCase();
        else 
            return toTitleCase(word);
//        switch (caseType) {
//            case 'l':
//            case 'L':
//                return newWord.toLowerCase();
//            case 'u':
//            case 'U':
//                return newWord.toUpperCase();
//            default:
//                return Character.toUpperCase(newWord.charAt(0))
//                        + newWord.substring(1);
//        }
    }
}
