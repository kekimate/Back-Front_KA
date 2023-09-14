
public class Cuboid {
    public static void main(String[] args) {

        double length = 10.4;
        double width = 13.5;
        double height = 8.2;

        double surface = 2 * ((length * width) + (width * height) + (height * length));

        double volume = length * width * height;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);

    }
}