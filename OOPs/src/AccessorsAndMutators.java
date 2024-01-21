class Rectangle {
    private double length;
    private double width;

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
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

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class AccessorsAndMutators {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();

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