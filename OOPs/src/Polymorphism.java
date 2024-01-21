// Shape.java
abstract class Shape {
    // Abstract method for calculating area
    public abstract double calculateArea();

    // Common method to display information about the shape
    public void displayInfo() {
        System.out.println("Shape Type: " + this.getClass().getSimpleName());
        System.out.println("Area: " + calculateArea());
    }
}

// Rectangle.java
class Rectangle1 extends Shape {
    private double length;
    private double width;

    // Constructors, getters, setters, and methods (same as in previous examples)

    // Constructor
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter and setter methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Triangle.java
class Triangle1 extends Shape {
    private double base;
    private double height;

    // Constructors, getters, setters, and methods (same as in previous examples)

    // Constructor
    public Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Getter and setter methods
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main.java
public class Polymorphism {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle1(10.0, 5.0);
        shapes[1] = new Triangle1(8.0, 6.0);

        // Iterate through the array and call calculateArea() for each shape
        for (Shape shape : shapes) {
            shape.displayInfo(); // Polymorphic behavior
            System.out.println("--------------------");
        }
    }
}
