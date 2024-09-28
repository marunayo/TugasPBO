public class Cylinder extends Circle {
    private double height;

    // Constructor with default color, radius, and height
    public Cylinder() {
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // Overriding the getArea() method to calculate surface area of a cylinder
    @Override
    public double getArea() {
        // Surface Area = 2πrh + 2πr^2
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // A public method for computing the volume of cylinder
    // We use the base area from Circle's getArea() method (via super.getArea())
    public double getVolume() {
        return super.getArea() * height;  // Call Circle's getArea() for the base area
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() // calling Circle's toString()
                + " height=" + height;
    }
}
