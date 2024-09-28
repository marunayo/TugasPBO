/**
 * The Shape class represents a geometric shape with a color and a filled status.
 */
public class Shape {
    private String color;  // Instance variable for color
    private boolean filled; // Instance variable for filled status

    // No-argument constructor initializing color to "green" and filled to true
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor with parameters for color and filled status
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for filled status
    public boolean isFilled() {
        return filled;
    }

    // Setter for filled status
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled") + ".";
    }
}
