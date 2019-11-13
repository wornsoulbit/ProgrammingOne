package shape;

import java.util.Random;

/**
 * A class of circle
 * @author Alex Vasil
 */
public class Circle {
    
    private double radius;

    /**
     * Default constructor that gives a random radius.
     */
    public Circle() {
        Random rand = new Random();
        int numRange = 10; //The range of numbers e.g. [0, 10[
        int minNum = 1; //The minimum number in a range e.g. [1, 11[
        this.radius = rand.nextInt(numRange) + minNum;
    }

    /**
     * Constructor with a specific radius.
     * @param radius the radius.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Copy constructor.
     * @param anotherCircle the target circle.
     */
    public Circle(Circle anotherCircle) {
        this.radius = anotherCircle.radius;
    }

    /**
     * Calculates the area of a circle.
     * @return the area of the circle.
     */
    public double calcArea() {
        return Math.pow((Math.PI * this.radius), 2);
    }
    
    /**
     * Calculates the circumference of a circle.
     * @return the circumference of the circle.
     */
    public double calcCircumference() {
        return 2 * Math.PI * this.radius;
    }
    
    /**
     * To generate a string to represent the circle.
     * @return a generated string for circle.
     */
    @Override
    public String toString() {
        String message = String.format("%-13s: %.2f\n", "Radius", radius);
        message += String.format("%-13s: %.2f\n", "Area", calcArea());
        message += String.format("%-13s: %.2f\n", "Circumference", calcCircumference());
        
        return message;
    }
    
    /**
     * To check if two circles are the same.
     * @param anotherCircle the other circle to compare.
     * @return To check if two circles are the same.
     */
    public boolean equals(Circle anotherCircle) {
        return this.radius == anotherCircle.radius;
    }
    
    /**
     * A copy of a circle.
     * @return a copy of a circle.
     */
    public Circle clone() {
        return new Circle(this);
    }
    
    /**
     * Getter.
     * @return the radius of the circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Setter.
     * @param radius sets the radius of the circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
