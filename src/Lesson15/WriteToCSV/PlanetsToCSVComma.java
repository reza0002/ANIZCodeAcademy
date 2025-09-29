package Lesson15.WriteToCSV;



import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlanetsToCSVComma {
    public static void main(String[] args) {
        // 1. Lav en ArrayList med planeter og nogle ekstra oplysninger
        List<String[]> planets = new ArrayList<>();
        planets.add(new String[]{"Mercury", "4879", "57.9"}); // navn, diameter km, afstand mio km
        planets.add(new String[]{"Venus", "12104", "108.2"});
        planets.add(new String[]{"Earth", "12742", "149.6"});
        planets.add(new String[]{"Mars", "6779", "227.9"});
        planets.add(new String[]{"Jupiter", "139820", "778.3"});
        planets.add(new String[]{"Saturn", "116460", "1427"});
        planets.add(new String[]{"Uranus", "50724", "2871"});
        planets.add(new String[]{"Neptune", "49244", "4495"});

        // 2. Skriv til CSV-fil med komma-separation
        try (FileWriter writer = new FileWriter("planets.csv")) {
            // Header
            writer.write("Name,Diameter(km),Distance(million km)\n");

            for (String[] planet : planets) {
                writer.write(String.join(",", planet) + "\n"); // alle felter på samme linje, separeret med komma
            }

            System.out.println("Planeter skrevet til planets.csv (komma-separeret)");
        } catch (IOException e) {
            System.out.println("Fejl ved skrivning til fil: " + e.getMessage());
        }
    }
}
