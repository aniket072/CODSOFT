import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char playAgain;

        do {
            System.out.println("Welcome to the Number Guessing Game!");
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean found = false;
            final int maxAttempts = 10;

            while (!found && attempts < maxAttempts) {
                System.out.print("Enter your guess (1-100) or 'q' to quit: ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Thanks for playing! The secret number was " + secretNumber + ".");
                    break;
                }

                int guess;
                try {
                    guess = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    found = true;
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (attempts >= maxAttempts && !found) {
                System.out.println("You've reached the maximum number of attempts. The secret number was " + secretNumber + ".");
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.nextLine().charAt(0);
        } while (Character.toLowerCase(playAgain) == 'y');
    }
}
