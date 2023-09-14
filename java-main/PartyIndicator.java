import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of girls: ");
        int girls = scanner.nextInt();

        System.out.print("Please enter the number of boys: ");
        int boys = scanner.nextInt();

        int total = girls + boys;

        if (girls == boys && total >= 20)
        {
            System.out.println("The party is excellent!");
        }
        else if (total >= 20 && girls != 0)
        {
            System.out.println("Quite a cool party!");
        }
        else if (total < 20)
        {
            System.out.println("Average party...");
        }
        else
        {
            System.out.println("Sausage party");
        }
        scanner.close();
    }
}
