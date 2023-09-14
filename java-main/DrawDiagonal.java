import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the square size: ");
        int size = scanner.nextInt();

        for (int row = 1; row <= size; row++)
        {
            for (int col = 1; col <= size; col++)
            {
                if (row == 1 || row == size || col == 1 || col == size || row == col)
                {
                    System.out.print("%");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}