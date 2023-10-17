package zoo;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public abstract void breed();
}

class Bird extends Animal {

    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void breed() {
        System.out.println(getName() + " is breeding by laying eggs.");
    }
}

class Mammal extends Animal {

    public Mammal(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void breed() {
        System.out.println(getName() + " is breeding by giving birth.");
    }
}

class Reptile extends Animal {

    public Reptile(String name, int age, String gender) {
        super(name, age, gender);
    }
    
    @Override
    public void breed() {
        System.out.println(getName() + " is breeding by laying eggs.");
    }
}
