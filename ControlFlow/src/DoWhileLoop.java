public class DoWhileLoop {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;
        System.out.println("First 10 numbers of Fibonacci series:");
        int i = 1;
        do {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;
            i++;
        } while (i <= n);
    }
}
