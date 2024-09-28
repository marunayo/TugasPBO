/**
 * The Circle class represents a circle with a radius.
 */
public class Circle extends Shape {
    private double radius; // Instance variable for radius

    // No-argument constructor initializing radius to 1.0
    public Circle() {
        // super(); // Call the no-arg constructor of Shape
        this.radius = 1.0;
    }

    // Constructor with parameter for radius
    public Circle(double radius) {
        //super(); // Call the no-arg constructor of Shape
        this.radius = radius;
    }

    // Constructor with parameters for color, filled, and radius
    public Circle(String color, boolean filled, double radius) {
        //super(color, filled); // Call the parameterized constructor of Shape
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter (circumference) of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
