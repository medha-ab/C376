public class DivisionByZerosException {
    public static double divideNumbers(int numerator, int denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Cannot divide by zero!");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            double result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
