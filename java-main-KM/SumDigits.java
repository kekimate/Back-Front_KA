import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem adjon meg egy nem negatív egész számot: ");
        int n = scanner.nextInt();

        if (n < 0)
        {
            System.out.println("A szám nem lehet negatív!");
        }
        else
        {
            int osszeg = szamjegyekOsszege(n);
            System.out.println("A számjegyek összege: " + osszeg);
        }
    }

    public static int szamjegyekOsszege(int n) {
        if (n == 0)
        {
            return 0;
        }
        else
        {
            int utolsoSzamjegy = n%10;

            int tobbiOsszege = szamjegyekOsszege(n/10);

            return utolsoSzamjegy + tobbiOsszege;
        }
    }
}
