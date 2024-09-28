/**
 * The Rectangle class represents a rectangle with width and length.
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

    // No-argument constructor initializing width and length to 1.0
    public Rectangle() {
        super(); // Call the no-arg constructor of Shape
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor with parameters for width and length
    public Rectangle(double width, double length) {
        super(); // Call the no-arg constructor of Shape
        this.width = width;
        this.length = length;
    }

    // Constructor with parameters for color, filled, width, and length
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled); // Call the parameterized constructor of Shape
        this.width = width;
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return width * length;
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
