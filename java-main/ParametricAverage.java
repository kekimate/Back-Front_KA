import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers would you like to enter: ");
        int numberOfNumbers = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= numberOfNumbers; i++)
        {
            System.out.print("Enter number " + i + " of " + numberOfNumbers + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / numberOfNumbers;

        System.out.println("Sum: " + sum + ", Average: " + average);

        scanner.close();
    }
}
