package javaapplication3;

/**
 *
 * @author Alexander Vasil
 */
public class JavaApplication3 {

    public static void main(String[] args) {

    }

    /**
     * calculate whether a shopping cart gets free shipping or not.
     *
     * @param prodCost the cost of the product.
     * @return if the shipping is free or if there is a shipping cost.
     */
    public static double caclShippingFee(double prodCost) {
        double freeShippingMin = 70;
        double shippingCost = 12;

//        if (prodCost >= freeShippingMin) 
//            return 0;
//        else 
//            return shippingCost;
        return (prodCost >= freeShippingMin) ? 0 : shippingCost;
    }

    /**
     * Checks the gender of a person and the age of that person.
     *
     * @param gender the user inputed gender.
     * @param age the user inputed age.
     * @return the gender and the age.
     */
    public static char generateTitle(char gender, int age) {
        gender = Character.toLowerCase(gender);
        if (gender == 'f') {
            return (age < 18) ? 'g' : 'w';
        } else {
            return (age < 18) ? 'b' : 'm';
        }
    }
    
    public static double calcParentGift(double balance) {
        double tinyGift = 10;
        double hugeGift = 50;
        double giftThreshold = 100;
        
        return (balance >= giftThreshold) ? balance + tinyGift : balance + hugeGift; 
    }
}
