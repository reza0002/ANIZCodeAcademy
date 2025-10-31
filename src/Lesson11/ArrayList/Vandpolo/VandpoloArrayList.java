package Lesson11.ArrayList.Vandpolo;
import java.util.ArrayList;
import java.util.Scanner;

public class VandpoloArrayList {
    public static void main(String[] args) {
        // Opret en ArrayList til spillerne
        ArrayList<Spiller> hold = new ArrayList<>();

        // Tilføj spillere manualt
        hold.add(new Spiller("Anna"));
        hold.add(new Spiller("Emil"));
        hold.add(new Spiller("Sofia"));

        //Eller tilføj via brugerinput
        tilføjSpiller(hold);

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
     //Metoden til at selv og tilføje en spiller 
    public static void tilføjSpiller(ArrayList<Spiller> hold) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast et spillernavn: ");
        String navn = scanner.nextLine();
        hold.add(new Spiller(navn));
    }
}

