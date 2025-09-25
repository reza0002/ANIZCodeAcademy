package Lesson13.BufferedReader;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandler {

    // Skriv tekst til en fil (overskriver indhold)
    public void writeToFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Skrevet til fil: " + filename);
        } catch (IOException e) {
            System.out.println("Fejl ved skrivning: " + e.getMessage());
        }
    }



    // Læs tekst fra en fil og returnér som String
    public String readFromFile(String filename) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Fejl ved læsning: " + e.getMessage());
        }
        return sb.toString();
    }
}
