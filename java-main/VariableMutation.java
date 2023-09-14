public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;

        int b = 100;
        b -= 7;

        int c = 44;
        c *= 2;

        int d = 125;
        d /= 5;

        int e = 8;
        e = e * e * e;

        int f1 = 123;
        int f2 = 345;
        boolean nagyobbe = f1 > f2;

        int g1 = 350;
        int g2 = 200;
        boolean nagyobbe2 = (g2 * 2) > g1;

        int h = 136020258;
        boolean oszthatoe = (h % 11) == 0;

        int i1 = 10;
        int i2 = 3;
        boolean kozotte = i1 > (i2 * i2) && i1 < (i2 * i2 * i2);

        int j = 1521;
        boolean oszthatoe2 = (j % 3 == 0) || (j % 5 == 0);

        // Printing results
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f1 > f2: " + nagyobbe);
        System.out.println("2 * g2 > g1: " + nagyobbe2);
        System.out.println("h has 11 as a divisor: " + oszthatoe);
        System.out.println("i1 is between i2^2 and i2^3: " + kozotte);
        System.out.println("j is divisible by 3 or 5: " + oszthatoe2);
    }
}
