import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int storedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int guess;
        boolean found = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the stored number between " + minRange + " and " + maxRange);

        while (!found)
        {
            System.out.print("Please enter your guess: ");
            guess = scanner.nextInt();

            if (guess < minRange || guess > maxRange)
            {
                System.out.println("Your guess is out of the valid range.");
            }
            else if (guess < storedNumber)
            {
                System.out.println("The stored number is greater than " + guess);
            }
            else if (guess > storedNumber)
            {
                System.out.println("The stored number is smaller than " + guess);
            }
            else
            {
                System.out.println("You have found the stored number " + storedNumber);
                found = true;
            }
        }
        scanner.close();
    }
}
