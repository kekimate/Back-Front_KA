import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adja meg az 'a' értékét: ");
        double a = scanner.nextDouble();
        
        if (a == 0)
        {
            System.out.println("'a' értéke nem lehet nulla.");
            return;
        }

        System.out.print("Adja meg az 'b' értékét: ");
        double b = scanner.nextDouble();

        System.out.print("Adja meg a 'c' értékét: ");
        double c = scanner.nextDouble();

        Megoldas(a, b, c);
        
        scanner.close();
    }

    public static void Megoldas(double a, double b, double c) {

        double quad = b * b - 4 * a * c;

        if (quad > 0)
        {
            double x1 = (-b + Math.sqrt(quad)) / (2 * a);

            double x2 = (-b - Math.sqrt(quad)) / (2 * a);

            System.out.println("Két zérushelye van:");

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (quad == 0)
        {
            double root = -b / (2 * a);
            System.out.println("Egy zérushelye van:");
            System.out.println("x = " + root);
        }
        else
        {
            System.out.println("Nincs zérushelye.");
        }
    }
}
