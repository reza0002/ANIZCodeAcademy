package Lesson11.ArrayList.Vandpolo;

import java.util.ArrayList;

public class VandpoloArrayListException {
    public static void main(String[] args) {
        // Opret ArrayList til vandpolo-spillere
        ArrayList<String> spillere = new ArrayList<>();
        spillere.add("Anna");
        spillere.add("Emil");
        spillere.add("Sofia");

        // Udskriv alle spillere
        System.out.println("Liste over vandpolo-spillere:");
        for (String s : spillere) {
            System.out.println(s);
        }

        System.out.println("\nPrøver at hente en spiller på plads 5 (som ikke findes):");

        // Håndtering af exception
        try {
            // Dette vil kaste en IndexOutOfBoundsException
            String spiller = spillere.get(5);
            System.out.println("Spiller: " + spiller);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fejl: Der findes ingen spiller på denne plads!");
            System.out.println("Exception besked: " + e.getMessage());
        }


        System.out.println("\nProgrammet fortsætter her efter try-catch.");
    }
}
