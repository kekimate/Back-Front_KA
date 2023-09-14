import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int elso = reader.nextInt();

        System.out.print("Please enter the second number: ");
        int masodik = reader.nextInt();

        if (masodik <= elso) {
            System.out.println("The second number should be bigger.");
        }
        else
            {
            System.out.println("Numbers between " + elso + " and " + masodik + " (excluding " + masodik + "):");
            for (int i = elso; i < masodik; i++) {
                System.out.println(i);
            }
        }

        reader.close();
    }
}