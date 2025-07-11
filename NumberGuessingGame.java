import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0, rounds = 0;

        do {
            int number = rand.nextInt(100) + 1;
            int attempts = 5;
            System.out.println("\n--- Guess the number between 1 and 100 ---");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts--;

                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed it!");
                    score++;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                if (attempts == 0) {
                    System.out.println("Out of attempts! The number was: " + number);
                }
            }

            rounds++;
            System.out.print("Do you want to play again? (yes/no): ");
        } while (sc.next().equalsIgnoreCase("yes"));

        System.out.println("\nRounds played: " + rounds);
        System.out.println("Total correct guesses: " + score);
        sc.close();
    }
}
