package music;

public abstract class Instrument {
    protected String name;
    public abstract void play();
}

public abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;

    public abstract void sound();

    @Override
    public void play() {
        System.out.print(name + ", a " + numberOfStrings + "-húros hangszer, amely ");
        sound();
    }
}

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        name = "Electric Guitar";
        numberOfStrings = 6;
    }

    @Override
    public void sound() {
        System.out.println("Twang");
    }
}

public class BassGuitar extends StringedInstrument {
    public BassGuitar() {
        name = "Bass Guitar";
        numberOfStrings = 4;
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum");
    }
}

public class Violin extends StringedInstrument {
    public Violin() {
        name = "Violin";
        numberOfStrings = 4;
    }

    @Override
    public void sound() {
        System.out.println("Screech");
    }
}
