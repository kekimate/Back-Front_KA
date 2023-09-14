import java.util.Scanner;

public class ConditionalVariableMutation {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter an integer as variable: ");
        int a = reader.nextInt();
        if (a % 1 == 0)
        {
            System.out.println(a);
        }

        System.out.println("Please enter an integer between 0 and 30: ");
        int b = reader.nextInt();

        if (b >= 10 && b <= 20)
        {
            System.out.println("Sweet!");
        }
        if (b <= 10)
        {
            System.out.println("Less!");
        }
        if (b > 20)
        {
            System.out.println("More!");
        }

        System.out.println("Please enter an integer between 0 and 100 as variable credits: ");
        int c = reader.nextInt();

        System.out.println("Please enter a boolean (true/false) as variable isBonus: ");
        boolean isBonus = reader.nextInt();

        if (c >= 50 && isBonus == false)
        {
            System.out.println("2");
        }

        if (c <= 50 && isBonus == false)
        {
            System.out.println("1");
        }

        System.out.println("Please enter an integer between 0 and 50: ");
        int d = reader.nextInt();
        
        System.out.println("Please enter an integer between 0 and 500: ");
        int time = reader.nextInt();

        if(d % 4 == 0 && time < 200)
        {
            System.out.println("Check");
        }

        if(d % 4 == 0 && time > 200)
        {
            System.out.println("Time out");
        }
        else{
            System.out.println("Run Forest Run!");
        }
        reader.close();
    }
}