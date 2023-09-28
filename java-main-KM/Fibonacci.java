public class Fibonacci {

    //Ciklussal
    public static int fibonacci(int n)
    {
        if (n < 0)
        {
            System.out.println("Az n nem lehet negatív.");
        }

        if (n <= 1)
        {
            return n;
        }

        int elozo = 0;
        int jelen = 1;

        for (int i = 2; i <= n; i++)
        {
            int kovetkezo = elozo + jelen;
            elozo = jelen;
            jelen = kovetkezo;
        }
        return jelen;
    }

    //Rekurzívan
    public static int fibonacciRec(int n)
    {
        if (n < 0)
        {
            System.out.println("Az n nem lehet negatív.");
        }

        if (n <= 1)
        {
            return n;
        }

        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    public static void main(String[] args)
    {
        int n = 10;
        System.out.println("Fibonacci(" + n + ") ciklussal: " + fibonacci(n));
        System.out.println("FibonacciRec(" + n + ") rekurzívan: " + fibonacciRec(n));
    }
}
