public class TestShape {
    public static void main(String[] args) {
        // Create a Shape instance using the no-arg constructor
        Shape shape1 = new Shape();
        System.out.println(shape1.toString()); // Output default values

        // Create a Shape instance using the constructor with parameters
        Shape shape2 = new Shape("red", false);
        System.out.println(shape2.toString()); // Output specified values

        // Test the getter methods
        System.out.println("Shape 1 Color: " + shape1.getColor());
        System.out.println("Shape 1 Filled: " + shape1.isFilled());

        // Modify shape1's properties using setter methods
        shape1.setColor("blue");
        shape1.setFilled(false);
        System.out.println("Updated Shape 1: " + shape1.toString());

        // Test the getter methods for shape2
        System.out.println("Shape 2 Color: " + shape2.getColor());
        System.out.println("Shape 2 Filled: " + shape2.isFilled());
    }
}
