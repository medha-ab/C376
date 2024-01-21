class Rectangles {
    private double length;
    private double width;

    // Default constructor
    public Rectangles() {
        // Default values or initialization logic if needed
    }

    // Parameterized constructor
    public Rectangles(double length, double width) {
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

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class OverloadedParameterizedConstructor {
    public static void main(String[] args) {
        Rectangles myRectangle = new Rectangles();

        myRectangle.setLength(10.0);
        myRectangle.setWidth(12.5);

        double perimeter = myRectangle.calculatePerimeter();
        double area = myRectangle.calculateArea();

        System.out.println("Height: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
