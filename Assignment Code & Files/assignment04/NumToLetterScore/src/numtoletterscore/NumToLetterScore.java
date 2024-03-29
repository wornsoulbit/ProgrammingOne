package numtoletterscore;

/**
 * Takes a score between 0 and 100 and gives a letter based on the score, e.g.
 * 95 > 'a'.
 * 
 * @author Alex Vasil
 */
public class NumToLetterScore {

    public static void main(String[] args) {
        
    }

    /**
     * takes a digit score in [0, 100], then calculate the letter score based on
     * it.
     *
     * @param digitScore the input score from 0 to 100.
     * @return a char based on the inputed score.
     */
    public static char toLetterScore(double digitScore) {

        if (digitScore >= 90 && digitScore <= 100) {
            return 'a';
        } else if (digitScore < 90 && digitScore >= 80) {
            return 'b';
        } else if (digitScore < 80 && digitScore >= 70) {
            return 'c';
        } else if (digitScore < 70 && digitScore >= 60) {
            return 'd';
        } else if (digitScore < 60) {
            return 'f';
        } else {
            return ' ';
        }
    }

    /**
     * Takes a letter score, then print “Excellent” for ‘a’ or ‘A’, “Well done”
     * for ‘b’ or ‘B’, ‘c’ or ‘C’, “Passed” for ‘d’ or ‘D’, and “better try
     * again" for ‘f’ or ‘F’. For all the other letters, print “Invalid grade”
     *
     * @param letterScore the score a person got on a test.
     */
    public static void printMessage(char letterScore) {

        switch (letterScore) {
            case 'a':
                System.out.println("Excellent!");
                break;
            case 'b':
            case 'c':
                System.out.println("Well done.");
                break;
            case 'd':
                System.out.println("Passed.");
                break;
            case 'f':
                System.out.println("Better luck next time.");
                break;
            default:
                System.out.println("Invaild Grade.");
                break;
        }

//        if (letterScore == 'a') {
//            System.out.println("Excellent!");
//        } else if (letterScore == 'b' || letterScore == 'c') {
//            System.out.println("Well done.");
//        } else if (letterScore == 'd') {
//            System.out.println("Passed.");
//        } else if (letterScore == 'f') {
//            System.out.println("Better luck next time.");
//        } else {
//            System.out.println("Invaild Grade.");
//        }
    }
}
