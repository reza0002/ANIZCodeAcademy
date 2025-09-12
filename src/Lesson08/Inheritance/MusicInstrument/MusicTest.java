package Lesson08.Inheritance.MusicInstrument;

// Superklasse: Instrument
class Instrument {
    protected String name;
    protected String type; // fx Strenge, Blæs, Slag

    public Instrument(String name, String type) {
        this.name = name;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Instrument: " + name + ", type: " + type;
    }

    public void play() {
        System.out.println(name + " spilles...");
    }
}

// Subklasse: Guitar
class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, int strings) {
        super(name, "Strenge");
        this.strings = strings;
    }


    @Override
    public String toString() {
        return "Guitar: " + name + ", strings: " + strings;
    }

    public void strum() {
        System.out.println(name + " bliver strummmet: Strum Strum!");
    }
}

// Subklasse: Drum
class Drum extends Instrument {
    private boolean hasCymbal;

    public Drum(String name, boolean hasCymbal) {
        super(name, "Slag");
        this.hasCymbal = hasCymbal;
    }


    @Override
    public String toString() {
        return "Drum: " + name + ", cymbal: " + (hasCymbal ? "Yes" : "No");
    }

    public void hit() {
        System.out.println(name + " bliver slået: Boom Boom!");
    }
}

// Main klasse
public class MusicTest {
    public static void main(String[] args) {

        test();
    }

    public static void test()
    {
        Instrument guitar = new Guitar("Fender", 6);
        Instrument drum = new Drum("Yamaha", true);

        System.out.println(guitar);
        guitar.play();
        if (guitar instanceof Guitar) ((Guitar) guitar).strum();

        System.out.println();

        System.out.println(drum);
        drum.play();
        if (drum instanceof Drum) ((Drum) drum).hit();
    }
}
