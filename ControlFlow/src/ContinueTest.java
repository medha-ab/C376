public class ContinueTest {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
