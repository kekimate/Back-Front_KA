import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of chickens: ");
        int chickens = scanner.nextInt();

        System.out.print("Please enter the number of pigs: ");
        int pigs = scanner.nextInt();

        int chickenLegs = chickens * 2;
        int pigLegs = pigs * 4;
        int totalLegs = chickenLegs + pigLegs;

        System.out.println("The number of legs: " + totalLegs);

        scanner.close();
    }
}
