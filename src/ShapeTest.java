public class ShapeTest {
    public static void main(String[] args) {
        // Creating Shape objects using various constructors
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(5.0); // Circle
        Shape shape3 = new Shape(4, 10.0); // Square
        Shape shape4 = new Shape(4, 15.0, 20.0); // Rectangle
        Shape shape5 = new Shape(3, 8.0, 10.0, 12.0); // Triangle

        // Getting shape details
        String details1 = shape1.getShapeDetails();
        String details2 = shape2.getShapeDetails();
        String details3 = shape3.getShapeDetails();
        String details4 = shape4.getShapeDetails();
        String details5 = shape5.getShapeDetails();

        System.out.println();

        // Printing shape details
        System.out.println("Shape Details 1:\n" + details1);
        System.out.println("\nShape Details 2:\n" + details2);
        System.out.println("\nShape Details 3:\n" + details3);
        System.out.println("\nShape Details 4:\n" + details4);
        System.out.println("\nShape Details 5:\n" + details5);
    }
}
