/**
 * The Square class represents a square which is a subclass of Rectangle.
 */
public class Square extends Rectangle {

    // Constructor that initializes the square with a given side length
    public Square(double side) {
        super(side, side); // Call the constructor of Rectangle with equal width and length
    }

    // Getter for side length
    public double getSide() {
        return getWidth();
    }

    // Setter for side length, which sets both width and length
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override the setWidth method to maintain square properties
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    // Override the setLength method to maintain square properties
    @Override
    public void setLength(double length) {
        setSide(length);
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
