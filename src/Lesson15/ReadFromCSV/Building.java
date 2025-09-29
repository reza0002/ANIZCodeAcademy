package Lesson15.ReadFromCSV;

// Klasse der repræsenterer en bygning
public class Building {
    private String name;
    private String country;
    private int year;

    public Building(String name, String country, int year) {
        this.name = name;
        this.country = country;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " (" + country + ", built " + year + ")";
    }
}
