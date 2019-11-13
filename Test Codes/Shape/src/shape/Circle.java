package shape;

import java.util.Random;

/**
 *
 * @author Alex Vasil
 */
public class Circle {
    
    private double radius;

    public Circle() {
        Random rand = new Random();
        int numRange = 10; //The range of numbers e.g. [0, 10[
        int minNum = 1; //The minimum number in a range e.g. [1, 11[
        this.radius = rand.nextInt(numRange) + minNum;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Circle anotherCircle) {
        this.radius = anotherCircle.radius;
    }

    public double calcArea() {
        return Math.pow((Math.PI * this.radius), 2);
    }
    
    public double calcCircumference() {
        return 2 * Math.PI * this.radius;
    }
    
    @Override
    public String toString() {
        String message = String.format("%-13s: %.2f\n", "Radius", radius);
        message += String.format("%-13s: %.2f\n", "Area", calcArea());
        message += String.format("%-13s: %.2f\n", "Circumference", calcCircumference());
        
        return message;
    }
    
    public boolean equals(Circle anotherCircle) {
        return this.radius == anotherCircle.radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
