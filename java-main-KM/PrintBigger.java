import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Please enter another number: ");
        double number2 = scanner.nextDouble();

        if (number1 > number2)
        {
            System.out.println(number1);
        }
        else
        {
            System.out.println(number2);
        }
        scanner.close();
    }
}
