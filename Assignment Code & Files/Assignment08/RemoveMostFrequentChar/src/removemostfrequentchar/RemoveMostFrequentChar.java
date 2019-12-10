
package removemostfrequentchar;

import java.util.ArrayList;

/**
 * Removes the first most frequent character in a sentence.
 * 
 * @author Alex Vasil
 */
public class RemoveMostFrequentChar {
    
    private static ArrayList<Integer> letterFrequency = new ArrayList<>();
    private static ArrayList<Character> letterList = new ArrayList<>();
    
    /**
     * Removes the first most frequent character in a sentence.
     * 
     * @param strIn the inputed string.
     * @return the string without the first most frequent character.
     */
    public static String removeMostFrequentChar(String strIn) {
        if (strIn == null || strIn.isEmpty())
            return strIn;
        
        String strOut = "";
        
        updateFrequency(strIn);
        char letterToRemove = letterList.get(findMostFrequentIdx(letterFrequency));
        for (int i = 0; i < strIn.length(); i++) {
            if (strIn.charAt(i) != letterToRemove)
                strOut += strIn.charAt(i);
        }
        
        return strOut;
    }
    
    /**
     * Updates the frequency of a character in a sentence.
     * 
     * @param strIn the inputed sentence.
     */
    public static void updateFrequency(String strIn) {
        letterList.clear();
        letterFrequency.clear();
        
        char c;
        for (int i = 0; i < strIn.length(); i++) {
            c = strIn.charAt(i);
            if (!letterList.contains(c)) {
                letterFrequency.add(checkFrequency(strIn, c));
                letterList.add(c);
            }
        }
    }
    
    /**
     * Checks how many times a character occurs in a sentence.
     * 
     * @param strIn the input string.
     * @param c the character being looked for.
     * @return the number of times the character occurs.
     */
    public static int checkFrequency(String strIn, char c) {
        int charFrequency = 0;
        
        for (int i = 0; i < strIn.length(); i++) {
            if (strIn.charAt(i) == c)
                charFrequency++;
        }
        
        return charFrequency;
    }
    
    /**
     * Checks for the first most frequent character index.
     * 
     * @param e the arrayList being looked.
     * @return the index of the first most frequent character.
     */
    public static int findMostFrequentIdx(ArrayList<Integer> e) {
        int letterIndex = 0;
        int letterNum = 0;
        for (int i = 0; i < e.size(); i++) {
            if (letterNum < e.get(i)) {
                letterNum = e.get(i);
                letterIndex = i;
            }
        }
        return letterIndex;
    }
}
