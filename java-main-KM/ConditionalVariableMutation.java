import java.util.Scanner;

public class ConditionalVariableMutation {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter an integer as variable 'a': ");
        int a = reader.nextInt();

        int output1 = 0;

        if (a % 2 == 0) {
            output1++;
        }

        System.out.println("The value of output1 is: " + output1);

        reader.close();

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

        System.out.print("Please enter an integer between 0 and 100 as variable credits: ");
        int credits = reader.nextInt();

        System.out.print("Please enter a boolean (true/false) as variable isBonus: ");
        boolean isBonus = reader.nextBoolean();

        int output3 = 50;

        if (credits >= 50 && !isBonus) {
            output3 -= 2;
        } else if (credits < 50 && !isBonus) {
            output3 -= 1;
        }

        System.out.println("The value of output3 is: " + output3);


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