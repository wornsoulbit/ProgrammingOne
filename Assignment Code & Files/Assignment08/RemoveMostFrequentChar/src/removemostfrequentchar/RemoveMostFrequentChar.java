
package removemostfrequentchar;

import java.util.ArrayList;

/**
 *
 * @author Alex Vasil
 */
public class RemoveMostFrequentChar {
    
    private static ArrayList<Integer> letterFrequency = new ArrayList<>();
    private static ArrayList<Character> letterList = new ArrayList<>();
    
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
    
    public static int checkFrequency(String strIn, char c) {
        int charFrequency = 0;
        
        for (int i = 0; i < strIn.length(); i++) {
            if (strIn.charAt(i) == c)
                charFrequency++;
        }
        
        return charFrequency;
    }
    
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
