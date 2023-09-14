import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int a = reader.nextInt();

        System.out.println("Please enter a number: ");
        int b = reader.nextInt();

        System.out.println("Please enter a number: ");
        int c = reader.nextInt();

        System.out.println("Please enter a number: ");
        int d = reader.nextInt();

        System.out.println("Please enter a number: ");
        int e = reader.nextInt();

        int sum = a+b+c+d+e;
        int avg = sum / 5;

        reader.close();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}