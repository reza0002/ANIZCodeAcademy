package Lesson15.WriteToCSV;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlanetsToCSV {
    public static void main(String[] args) {
        // 1. Lav en ArrayList med planeter
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");

        // 2. Skriv til CSV-fil
        try (FileWriter writer = new FileWriter("planets.csv")) {
            for (String planet : planets) {
                writer.write(planet + "\n"); // hver planet på en ny linje
            }
            System.out.println("Planeter skrevet til planets.csv");
        } catch (IOException e) {
            System.out.println("Fejl ved skrivning til fil: " + e.getMessage());
        }
    }
}
