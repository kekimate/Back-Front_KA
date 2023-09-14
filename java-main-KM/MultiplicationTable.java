import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= 10; i++)
        {
            int result = number * i;
            System.out.println(i + " * " + number + " = " + result);
        }

        scanner.close();
    }
}
