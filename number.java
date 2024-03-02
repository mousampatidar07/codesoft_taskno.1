import java.util.Random;
import java.util.Scanner;

public class number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int attempts;
        boolean playAgain;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int randomNumber = random.nextInt(max - min + 1) + min;
            attempts = 0;

            System.out.println("I have selected a number between " + min + " and " + max + ".");
            System.out.println("Can you guess what it is?");

            while (true) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
                    System.out.println("Number of attempts: " + attempts);
                    break;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = sc.next();
            playAgain = playChoice.equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thank you for playing the Number Guessing Game! Goodbye.");
        sc.close();
    }
}
