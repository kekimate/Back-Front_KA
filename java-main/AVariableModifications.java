import java.lang.Math;

public class AVariableModifications {
    public static void main(String[] args) {
        int a = 3;
        // increase the value of variable "a" by 10 and print the new value
        int a1 = a + 10;
        System.out.println(a1);

        int b = 100;
        // decrease the value of b by 7 and print the new value
        int b1 = b - 7;
        System.out.println(b1);


        int c = 44;
        // double the value of c and print the new value
        int c1 = c*2;
        System.out.println(c1);

        int d = 125;
        // divide the value of d by 5 and print the new value
        int d1 = d / 5;
        System.out.println(d1);


        int e = 8;
        // cube the value of e and print the new value
        System.out.println(Math.pow(e, 2));

        int f1 = 123;
        int f2 = 345;
        // determine if f1 is greater than f2 (print as a boolean)
        if(f1 > f2)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }


        int g1 = 350;
        int g2 = 200;
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)
        if(2*g2 > g1)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }


        int h = 135798745;
        // determine if h has 11 as a divisor (print as a boolean)
        if(h % 11 == 0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        int i1 = 10;
        int i2 = 3;
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)
        if(i1 > Math.pow(i2, 2))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }


        int j = 1521;
        // determine if j is divisible by 3 or 5 (print as a boolean)
        if(j % 3 == 0 || j % 5 == 0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
