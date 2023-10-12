public class Animal {
    private int numberOfLegs;
    private int numberOfEyes;
    private String name;

    public Animal(int numberOfLegs, int numberOfEyes, String name) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.name = name;
    }

    public void printAnimal() {
        System.out.println("Neve: " + name);
        System.out.println("Lábai száma: " + numberOfLegs);
        System.out.println("Szemei száma: " + numberOfEyes);
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal(4, 2, "Buksi");
        Animal animal2 = new Animal(10, 6, "Csoki");
        animal.printAnimal();
        animal2.printAnimal();
    }
}
