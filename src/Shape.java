class Shape {
    private String shapeName;
    private int numberOfEdges;

    // Basic constructor
    public Shape() {
        System.out.println("Creating a Shape object.");
        shapeName = "Undefined shape";
    }

    // Constructor for Circle
    public Shape(double radius) {
        System.out.println("Creating a Circle object.");
        shapeName = "Circle";
    }

    // Constructor for Square
    public Shape(int edges, double edgeLength) {
        System.out.println("Creating a Square object.");
        shapeName = "Square";
        numberOfEdges = edges;
    }

    // Constructor for Rectangle
    public Shape(int edges, double e1, double e2) {
        System.out.println("Creating a Rectangle object.");
        shapeName = "Rectangle";
        numberOfEdges = edges;
    }

    // Constructor for Triangle
    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("Creating a Triangle object.");
        shapeName = "Triangle";
        numberOfEdges = edges;
    }

    // Method to get shape details
    public String getShapeDetails() {
        return "Shape Name: " + shapeName + "\nNumber of Edges: " + numberOfEdges;
    }
}
