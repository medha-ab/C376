public class Triangle {
    private double base;
    private double height;

    // Default constructor
    public Triangle() {
        // Initialize with default values
        this.base = 10.0;
        this.height = 12.5;
    }

    // Parameterized constructor
    public Triangle(double base, double height) {
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

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();

        // Output default values
        System.out.println("Default Base: " + myTriangle.getBase());
        System.out.println("Default Height: " + myTriangle.getHeight());

        myTriangle.setBase(10.0);
        myTriangle.setHeight(12.5);

        double area = myTriangle.calculateArea();

        System.out.println("Base: " + myTriangle.getBase());
        System.out.println("Height: " + myTriangle.getHeight());
        System.out.println("Area: " + area);
    }
}
