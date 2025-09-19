package Lesson11.ArrayList.Vandpolo;
import java.util.ArrayList;

public class VandpoloArrayList {
    public static void main(String[] args) {
        // Opret en ArrayList til spillerne
        ArrayList<Spiller> hold = new ArrayList<>();

        // Tilføj spillere
        hold.add(new Spiller("Anna"));
        hold.add(new Spiller("Emil"));
        hold.add(new Spiller("Sofia"));

        // Nogle scorer mål
        hold.get(0).scoreMål(); // Anna scorer
        hold.get(2).scoreMål(); // Sofia scorer
        hold.get(2).scoreMål(); // Sofia scorer igen

        // Udskriv hele holdet
        System.out.println("Resultat i vandpolo:");
        for (Spiller s : hold) {
            System.out.println(s);
        }
    }
}

