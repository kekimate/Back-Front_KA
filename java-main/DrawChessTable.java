import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the chess table size: ");
        int size = scanner.nextInt();

        for (int row = 1; row <= size; row++)
        {
            for (int col = 1; col <= size; col++)
            {
                if ((row + col) % 2 == 0)
                {
                    System.out.print("% ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}