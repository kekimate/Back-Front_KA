import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Kérem a csirkék számát: ");
        int c = reader.nextInt();

        System.out.println("Kérem a disznók számát: ");
        int d = reader.nextInt();

        int csirkedb = c * 2;
        int disznodb = d * 4;

        int labak = csirkedb + disznodb;

        reader.close();

        System.out.println("A lábak száma:" + labak);
    }
}