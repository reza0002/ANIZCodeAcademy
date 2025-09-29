package Lesson15.ReadFromCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadBuildingsFromCSV {
    public static void main(String[] args) {
        String fileName = "buildings.csv";

        // Først tæller vi linjer i filen
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            System.out.println("Fejl ved læsning: " + e.getMessage());
            return;
        }

        // Opret array med rette størrelse
        Building[] buildings = new Building[count];

        // Læs igen og udfyld arrayet
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    String name = parts[0];
                    String country = parts[1];
                    int year = Integer.parseInt(parts[2]);
                    buildings[i] = new Building(name, country, year);
                    i++;
                }
            }
        } catch (IOException e) {
            System.out.println("Fejl ved læsning: " + e.getMessage());
        }

        // Udskriv bygningerne
        System.out.println("Famous Buildings:");
        for (Building b : buildings) {
            System.out.println(b);
        }
    }
}
