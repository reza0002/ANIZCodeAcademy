package Lesson11.ArrayList.Vandpolo;

import java.util.ArrayList;



public class VandpoloArrayListSolution {
    public static void main(String[] args) {
        ArrayList<Spiller> hold = new ArrayList<>();

        // Tilføj spillere
        hold.add(new Spiller("Anna"));
        hold.add(new Spiller("Emil"));
        hold.add(new Spiller("Sofia"));

        // Scor nogle mål
        hold.get(0).scoreMål(); // Anna scorer
        hold.get(2).scoreMål(); // Sofia scorer
        hold.get(2).scoreMål(); // Sofia scorer igen

        // Udskriv alle spillere
        System.out.println("Resultat i vandpolo:");
        for (Spiller s : hold) {
            System.out.println(s);
        }

        // Find topscorer
        Spiller topscorer = findTopscorer(hold);
        System.out.println("\nTopscorer er: " + topscorer.getNavn() + " med " + topscorer.getMål() + " mål!");
    }

    // Metode til at finde topscorer i ArrayList
    public static Spiller findTopscorer(ArrayList<Spiller> hold) {
        Spiller bedste = hold.get(0); // Start med første spiller
        for (Spiller s : hold) {
            if (s.getMål() > bedste.getMål()) {
                bedste = s;
            }
        }
        return bedste;
    }
}
