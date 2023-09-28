import java.util.Scanner;

public class Factorial {

    public static int calculateFactorial(int n) {

        if (n < 0)
        {
            System.out.println("A faktoriális csak nemnegatív egész számo lehet.");
        }
        
        int factorial = 1;

        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        return factorial;
    }

    public static int calculateFactorialRec(int n) {
        if (n < 0)
        {
            System.out.println("A faktoriális csak nemnegatív egész számo lehet.");
        }
        
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return n * calculateFactorialRec(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérlek, add meg az egész számot: ");
        int n = scanner.nextInt();
        int eredmeny = calculateFactorialRec(n);
        System.out.println(n + "! = " + eredmeny);
    }
}