package andornotswitchoperators;

/**
 * Using and, or, not, and switch operators.
 * 
 * @author Alexander Vasil
 */
public class AndOrNotSwitchOperators {

    public static void main(String[] args) {
        System.out.println(isSkipped(1));
        System.out.println(14 | 7);
        System.out.println(check(100, 50000));
        
    }
    //num < 0 && num >= 18 || balance < 1000
    /**
     * Checks to see if a person is an adult or a child.
     * 
     * @param gender the inputed gender.
     * @param age the inputed age.
     * @return whether a person is a child or an adult.
     */
    public static char generateTitle(char gender, int age) {
        gender = Character.toLowerCase(gender);
//        if (gender == 'f')
//            return (age < 18) ? 'g' : 'w';
//        else 
//            return (age < 18) ? 'b' : 'm';
                
        if (gender == 'f' && age < 18)
            return 'g';
        else if (gender == 'f' && age > 18)
            return 'w';
        else if (gender == 'm' && age < 18)
            return 'b';
        else 
            return 'm';
    }
    
    /**
     * Checks to see if a number is skipped or not.
     * 
     * @param num the user inputed number
     * @return true or false based on if the number contains a 3 or it can be
     * divided by 3.
     */
    public static boolean isSkipped(int num) {
        return num % 3 == 0 || ("" + num).contains("3");
    }
    
    /**
     * Checks to see if a number is not skipped or if it is.
     * @param num the user inputed number.
     * @return true or false based on if the number does not contains a 3 or if it can't
     * be divided by 3.
     */
    public static boolean isNotSkipping(int num) {
        return num % 3 != 0 && !("" + num).contains("3");
        
    }
    
    public static boolean check(int num, int balance) {
        return num <= 0 && num > 18 || balance <= 1000;
    }
}
