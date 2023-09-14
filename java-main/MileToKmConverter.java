import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a distance in miles: ");
        double miles = scanner.nextDouble();

        double kilometers = miles * 1.60934;

        System.out.println("The distance in km: " + kilometers);

        scanner.close();
    }
}
