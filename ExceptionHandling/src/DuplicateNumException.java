import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNumException {
    public static void checkDuplicateNumbers(int[] numbers) throws DuplicateNumberException {
        Set<Integer> numberSet = new HashSet<>();
        for (int num : numbers) {
            if (!numberSet.add(num)) {
                throw new DuplicateNumberException("Duplicate numbers found!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers (separated by space): ");
        String input = scanner.nextLine();
        String[] strNumbers = input.split("\\s+");
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        try {
            checkDuplicateNumbers(numbers);
            System.out.println("No duplicate numbers found.");
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
