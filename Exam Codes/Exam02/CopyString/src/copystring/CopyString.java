package copystring;

/**
 *
 * @author Alex Vasil
 */
public class CopyString {

    public static void main(String[] args) {
        System.out.println(repeatChar("Hello"));
    }


    public static String repeatChar(String strIn) {
        String strOut = "";
        for (int i = 0; i < strIn.length(); i++) {
            strOut += strIn.charAt(i) + "" + strIn.charAt(i);
        }
        return strOut;
    }
}
