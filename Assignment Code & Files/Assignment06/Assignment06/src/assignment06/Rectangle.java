package assignment06;

import java.util.Random;

/**
 * A class of a rectangle.
 *
 * @author Alex Vasil
 */
public class Rectangle {

    private double length;
    private double width;

    /**
     * Generates a default constructor with a random length and width between
     * the ranges of [1, 10] while always keeping the width smaller or equals to
     * the length.
     */
    public Rectangle() {
        int generatedNums = 10; //How many numbers will be generated e.g. [0, 9]
        int minNum = 1; //The minimum number that is generated e.g. [1, 10]
        Random rand = new Random();

        this.length = rand.nextInt(generatedNums) + minNum;
        this.width = rand.nextInt(generatedNums) + minNum;

        if (this.length > this.width) {
            this.width = this.length;
        }
    }

    /**
     * Generates a constructor with given values for length and width.
     *
     * @param length the length of the rectangle in numbers.
     * @param width the width of the rectangle in numbers.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the area.
     *
     * @param length the length of the object.
     * @param width the width of the object.
     * @return the area of the object.
     */
    public double calcArea(double length, double width) {
        return this.length * this.width;
    }

    /**
     * Calculates the perimeter.
     *
     * @param length the length of the object.
     * @param width the width of the object.
     * @return the perimeter of the object.
     */
    public double calcPerimeter(double length, double width) {
        return (this.length + this.width) * 2;
    }

    /**
     * Checks to see if an object is a square or not.
     *
     * @param length the length of the object.
     * @param width the width of the object.
     * @return true or false, based on if the objects length and width equals
     * each other.
     */
    public boolean isSquare(double length, double width) {
        return this.length == this.width;
    }

    /**
     * Checks to see if the length is not less than zero.
     *
     * @param length the length of the object.
     * @return true or false based on if length is less than zero.
     */
    public boolean isValidLength(double length) {
        return this.length < 0;
    }

    /**
     * Checks to see if the width is not less than zero.
     *
     * @param width the width of the object.
     * @return true or false based on if width is less than zero.
     */
    public boolean isValidWidth(double width) {
        return this.width < 0;
    }

    /**
     * Allows for a rectangle to be deep copied.
     *
     * @param otherRectangle the rectangle that has the same data as the one
     * inputed.
     */
    public Rectangle(Rectangle otherRectangle) {
        this.length = otherRectangle.length;
        this.width = otherRectangle.width;
    }

    /**
     * Deep copying a rectangle.
     *
     * @return a new constructor of rectangle with the same values as the
     * original rectangle.
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    /**
     * Formats a string to show the values of length, width, area, and
     * perimeter.
     *
     * @return a string with the values of length, width, area, and perimeter.
     */
    @Override
    public String toString() {
        String message = String.format("%-10s: %.2f\n", "Length", length);
        message += String.format("%-10s: %.2f\n", "Width", width);
        message += String.format("%-10s: %.2f\n", "Area",
                calcArea(length, width));
        message += String.format("%-10s: %.2f\n", "Perimeter",
                calcPerimeter(length, width));

        return message;
    }

    /**
     * Checks to see if two constructors equals each other.
     * 
     * @param anotherRectangle the constructor being compared.
     * @return true or false based on if they equal or not.
     */
    public boolean equals(Rectangle anotherRectangle) {
        return this.length == anotherRectangle.length
                && this.width == anotherRectangle.width;
    }

    /**
     * Gets the length of an object.
     * 
     * @return the length.
     */
    public double getLength() {
        return length;
    }

    /**Gets the width of an object.
     *
     * @return the width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the length to an object.
     * 
     * @param length the length of the object.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Sets the width to an object.
     * 
     * @param width the width of the object.
     */
    public void setWidth(double width) {
        this.width = width;
    }

}
