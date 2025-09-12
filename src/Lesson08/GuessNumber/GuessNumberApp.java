package Lesson08.GuessNumber;


import java.util.Scanner;

// --- Main-klassen ---
public class GuessNumberApp {
    public static void main(String[] args) {
        GuessNumberGame();
    }

    public static void GuessNumberGame(){

        Scanner scanner = new Scanner(System.in);

        Player player = new Player("Spiller 1", scanner);
        Game game = new Game(100); // tal mellem 1 og 100

        writeWelcomeMessage();

        boolean correct = false;
        while (!correct) {
            int guess = player.makeGuess();
            correct = game.checkGuess(guess);
        }

        scanner.close();
    }

    public static void writeWelcomeMessage()
    {
        System.out.println("Velkommen til 'Gæt et tal'! 🎉");
        System.out.println("Jeg har valgt et tal mellem 1 og 100. Kan du finde det?");
    }
}
