import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter an number: ");
        int a = reader.nextInt();

        System.out.println("Please enter an other number: ");
        int b = reader.nextInt();

        if (a > b)
        {
            System.out.println("The second number should be bigger");
        }
        else
        {
            for (int i = 0; i < dif; i++) {

                System.out.println(a + i);
            }
        }

        reader.close();
    }
}