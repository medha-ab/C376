import java.util.Scanner;
import java.util.Random;

public class BeerBottleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("There are 21 beer bottles...");
        System.out.println("There are 2 players - Computer and you.");
        System.out.println("At a time, each one can pick up any no. of bottles between 1 and 4 (inclusive). The one to pick the last bottle looses. ");
        int totalBottles = 21;

        while (true) {
            int userPick = getUserInput(scanner, totalBottles);

            totalBottles -= userPick;
            System.out.println("The bottles remaining are: " + totalBottles);

            if (totalBottles == 1) {
                System.out.println("You Lose");
                break;
            }

            int computerPick = (totalBottles - 1) % 5;
            if (computerPick == 0) {
                computerPick = random.nextInt(4) + 1;
            }

            totalBottles -= computerPick;
            System.out.println("Computer has picked " + computerPick);
            System.out.println("Remaining bottles: " + totalBottles);

            if (totalBottles == 1) {
                System.out.println("Computer wins!");
                break;
            }
        }
    }

    private static int getUserInput(Scanner scanner, int remainingBottles) {
        int userPick;
        do {
            System.out.print("How many you would like to pick up? ");
            userPick = Integer.parseInt(scanner.nextLine());

            if (userPick < 1 || userPick > 4 || userPick > remainingBottles) {
                System.out.println("Invalid input. Pick between 1 and 4.");
            } else {
                break;
            }
        } while (true);

        return userPick;
    }
}
