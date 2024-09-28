public class TestSquare {
    public static void main(String[] args) {

        Square square1 = new Square(5.0);
        System.out.println(square1.toString());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        square1.setSide(7.0);
        System.out.println("After setting new side length:");
        System.out.println(square1.toString());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        square1.setWidth(4.0);
        System.out.println("After setting width to 4.0:");
        System.out.println(square1.toString());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        square1.setLength(10.0);
        System.out.println("After setting length to 10.0:");
        System.out.println(square1.toString());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
    }
}
