package loopexcerise2;

/**
 * Loop exercises.
 *
 * @author Alex Vasil
 */
public class LoopExcerise2 {

    public static void main(String[] args) {
        String str = "Hello Bad World";
        System.out.println(reverseString(str));
    }

    /**
     * Calculates the sum of all even numbers between the two boundaries.
     *
     * @param boundary1 the first number.
     * @param boundary2 the second number.
     * @return the sum of all even numbers between the two boundaries.
     */
    public static int calcEvenNum(int boundary1, int boundary2) {
        int max = Math.max(boundary2, boundary1);
        int min = Math.min(boundary2, boundary1);

        int sum = 0;

        //Soultion one.
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        //Soultion two.
//        for (int i = min; i <= max; i++) {
//            if (i % 2 == 1) {
//                continue;
//            }
//            sum += i;
//        }
        //Soultion three.
//        for (int i = (min % 2 == 0) ? min : max; i <= max; i += 2) {
//            sum += i;
//        }
        return sum;
    }
    
    /**
     * Reverse the given String ex/ "Hello" to "olleH"
     * @param strIn the input string.
     * @return the reversed string.
     */
    public static String reverseString(String strIn) {
        String strOut = "";
        for (int i = strIn.length() - 1; i >= 0; i--) {
            strOut += strIn.charAt(i);
        }
        return strOut;
    }
}
